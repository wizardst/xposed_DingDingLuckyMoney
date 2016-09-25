package me.veryyoung.dingding.luckymoney;

import android.widget.ImageButton;

import org.json.JSONObject;

import java.util.List;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam;

import static de.robv.android.xposed.XposedHelpers.callMethod;
import static de.robv.android.xposed.XposedHelpers.callStaticMethod;
import static de.robv.android.xposed.XposedHelpers.findAndHookMethod;
import static de.robv.android.xposed.XposedHelpers.findClass;
import static de.robv.android.xposed.XposedHelpers.findConstructorBestMatch;
import static de.robv.android.xposed.XposedHelpers.findField;
import static de.robv.android.xposed.XposedHelpers.findFirstFieldByExactType;
import static java.lang.Thread.sleep;


public class Main implements IXposedHookLoadPackage {

    private static final String DINGDING_PACKAGE_NAME = "com.alibaba.android.rimet";

    private static final String CONVERSATION_CHANGE_MAID_CLASS_NAME = "anx";


    @Override
    public void handleLoadPackage(final LoadPackageParam lpparam) throws Throwable {
        if (lpparam.packageName.equals(DINGDING_PACKAGE_NAME)) {

            findAndHookMethod(CONVERSATION_CHANGE_MAID_CLASS_NAME, lpparam.classLoader, "onLatestMessageChanged", List.class, new XC_MethodHook() {
                @Override
                protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                    if (!PreferencesUtils.open()) {
                        return;
                    }
                    List conversations = (List) param.args[0];
                    for (Object conversation : conversations) {
                        Object message = callMethod(conversation, "latestMessage");
                        String messageContent = findField(message.getClass().getSuperclass().getSuperclass(), "mMessageContent").get(message).toString();

                        JSONObject jsonObject = new JSONObject(messageContent);
                        int tp = jsonObject.optInt("tp", 0);
                        if (901 == tp || 902 == tp) {
                            String ext = jsonObject.getJSONArray("multi").getJSONObject(0).getString("ext");
                            ext = ext.replace("\\", "").replace("\"{", "{").replace("}\"", "}");
                            jsonObject = new JSONObject(ext);
                            Long sender = jsonObject.getLong("sid");
                            String clusterId = jsonObject.getString("clusterid");

                            Object redPacketsRpc = callStaticMethod(findClass("abc", lpparam.classLoader), "a");
                            Object redPacketsRpc$9 = findConstructorBestMatch(findClass("abc$9", lpparam.classLoader), redPacketsRpc.getClass(), findClass("afm", lpparam.classLoader)).newInstance(redPacketsRpc, null);

                            Object redEnvelopPickIService = callStaticMethod(findClass("cvx", lpparam.classLoader), "a", findClass("com.alibaba.android.dingtalk.redpackets.idl.service.RedEnvelopPickIService", lpparam.classLoader));

                            if (PreferencesUtils.delay()) {
                                sleep(PreferencesUtils.delayTime());
                            }
                            callMethod(redEnvelopPickIService, "pickRedEnvelopCluster", sender, clusterId, redPacketsRpc$9);
                        }
                    }
                }
            });

            findAndHookMethod("com.alibaba.android.dingtalk.redpackets.activities.PickRedPacketsActivity", lpparam.classLoader, "a", new XC_MethodHook() {
                @Override
                protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                    if (PreferencesUtils.quickOpen()) {
                        ImageButton imageButton = (ImageButton) findFirstFieldByExactType(param.thisObject.getClass(), ImageButton.class).get(param.thisObject);
                        if (imageButton.isClickable()) {
                            imageButton.performClick();
                        }
                    }
                }
            });


        }
    }


}