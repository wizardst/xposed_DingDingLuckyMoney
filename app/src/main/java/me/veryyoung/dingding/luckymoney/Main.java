package me.veryyoung.dingding.luckymoney;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.widget.ImageButton;
import android.widget.ImageView;

import org.json.JSONObject;

import java.util.List;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam;

import static de.robv.android.xposed.XposedBridge.log;
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

    private static String dingdingVersion = "";


    @Override
    public void handleLoadPackage(final LoadPackageParam lpparam) throws Throwable {
        if (lpparam.packageName.equals(DINGDING_PACKAGE_NAME)) {

            initVersion(lpparam);

            findAndHookMethod(VersionParam.ConversationChangeMaidClassName, lpparam.classLoader, "onLatestMessageChanged", List.class, new XC_MethodHook() {
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
                        log("get message:" + messageContent);
                        int tp = jsonObject.optInt("tp", 0);
                        if (901 == tp || 902 == tp) {
                            String ext = jsonObject.getJSONArray("multi").getJSONObject(0).getString("ext");
                            ext = ext.replace("\\", "").replace("\"{", "{").replace("}\"", "}");
                            jsonObject = new JSONObject(ext);
                            Long sender = jsonObject.getLong("sid");
                            String clusterId = jsonObject.getString("clusterid");

                            Object redPacketsRpc = callStaticMethod(findClass(VersionParam.RedPacketsRpcClassName, lpparam.classLoader), "a");
                            Object redPacketsRpc$9 = findConstructorBestMatch(findClass(VersionParam.RedPacketsRpcClassName + "$9", lpparam.classLoader), redPacketsRpc.getClass(), findClass(VersionParam.ApiEventListenerClass, lpparam.classLoader)).newInstance(redPacketsRpc, null);

                            Object redEnvelopPickIService = callStaticMethod(findClass(VersionParam.ServiceFactoryClass, lpparam.classLoader), "a", findClass("com.alibaba.android.dingtalk.redpackets.idl.service.RedEnvelopPickIService", lpparam.classLoader));

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

            findAndHookMethod("com.alibaba.android.dingtalk.redpackets.activities.FestivalRedPacketsPickActivity", lpparam.classLoader, "a", new XC_MethodHook() {
                @Override
                protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                    if (PreferencesUtils.quickOpen()) {
                        ImageView imageButton = (ImageView) findFirstFieldByExactType(param.thisObject.getClass(), ImageView.class).get(param.thisObject);
                        if (imageButton.isClickable()) {
                            imageButton.performClick();
                        }
                    }
                }
            });


            findAndHookMethod("com.alibaba.lightapp.runtime.LightAppRuntimeReverseInterfaceImpl", lpparam.classLoader, "initSecurityGuard", Context.class, new XC_MethodHook() {
                @Override
                protected void beforeHookedMethod(MethodHookParam param) {
                    param.setResult(null);
                }
            });


        }
    }

    private void initVersion(LoadPackageParam lpparam) throws PackageManager.NameNotFoundException {
        if (TextUtils.isEmpty(dingdingVersion)) {
            Context context = (Context) callMethod(callStaticMethod(findClass("android.app.ActivityThread", null), "currentActivityThread", new Object[0]), "getSystemContext", new Object[0]);
            String versionName = context.getPackageManager().getPackageInfo(lpparam.packageName, 0).versionName;
            log("Found dingding version:" + versionName);
            dingdingVersion = versionName;
            VersionParam.init(versionName);
        }
    }


}