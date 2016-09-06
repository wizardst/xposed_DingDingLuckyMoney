package me.veryyoung.dingding.luckymoney;

import android.view.MotionEvent;
import android.view.View;

import org.json.JSONObject;

import java.lang.reflect.Field;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam;

import static de.robv.android.xposed.XposedBridge.log;
import static de.robv.android.xposed.XposedHelpers.callMethod;
import static de.robv.android.xposed.XposedHelpers.callStaticMethod;
import static de.robv.android.xposed.XposedHelpers.findAndHookMethod;
import static de.robv.android.xposed.XposedHelpers.findClass;
import static de.robv.android.xposed.XposedHelpers.findConstructorBestMatch;
import static de.robv.android.xposed.XposedHelpers.getObjectField;


public class Main implements IXposedHookLoadPackage {

    private static final String DINGDING_PACKAGE_NAME = "com.alibaba.android.rimet";

    private static final String MAP_CLASS_NAME = "com.alibaba.android.rimet.biz.im.notification.MessageNotificationManager";
    private static final String MAP_FUNCTION_NAME = "a";


    @Override
    public void handleLoadPackage(final LoadPackageParam lpparam) throws Throwable {
        if (lpparam.packageName.equals(DINGDING_PACKAGE_NAME)) {

            findAndHookMethod(MAP_CLASS_NAME, lpparam.classLoader, MAP_FUNCTION_NAME, int.class, "com.alibaba.wukong.im.Message", boolean.class, new XC_MethodHook() {
                        @Override
                        protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                            if (!PreferencesUtils.open()) {
                                return;
                            }
                            if (null != param.args[1]) {
                                log(param.args[0].toString());
                                log(param.args[2].toString());
                                Field messageContentFileld = param.args[1].getClass().getSuperclass().getSuperclass().getDeclaredField("mMessageContent");
                                String messageContent = messageContentFileld.get(param.args[1]).toString();
                                log(messageContent);

                                JSONObject jsonObject = new JSONObject(messageContent);
                                int tp = jsonObject.optInt("tp", 0);
                                if (901 == tp || 902 == tp) {
                                    String ext = jsonObject.getJSONArray("multi").getJSONObject(0).getString("ext");
                                    ext = ext.replace("\\", "").replace("\"{", "{").replace("}\"", "}");
                                    jsonObject = new JSONObject(ext);
                                    Long sender = jsonObject.getLong("sid");
                                    String clusterId = jsonObject.getString("clusterid");

                                    Object redPacketsRpc = callStaticMethod(findClass("zy", lpparam.classLoader), "a");
                                    Object redPacketsRpc$9 = findConstructorBestMatch(findClass("zy$9", lpparam.classLoader), redPacketsRpc.getClass(), findClass("aeb", lpparam.classLoader)).newInstance(redPacketsRpc, null);

                                    Object redEnvelopPickIService = callStaticMethod(findClass("crh", lpparam.classLoader), "a", findClass("com.alibaba.android.dingtalk.redpackets.idl.service.RedEnvelopPickIService", lpparam.classLoader));

                                    callMethod(redEnvelopPickIService, "pickRedEnvelopCluster", sender, clusterId, redPacketsRpc$9);
                                }
                            }
                        }
                    }
            );


            findAndHookMethod("com.alibaba.android.dingtalk.redpackets.activities.PickRedPacketsActivity", lpparam.classLoader, MAP_FUNCTION_NAME, new XC_MethodHook() {
                @Override
                protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                    View mView = (View) getObjectField(param.thisObject, "h");
                    mView.callOnClick();
                    mView.setOnTouchListener(new View.OnTouchListener() {
                        @Override
                        public boolean onTouch(View v, MotionEvent event) {
                            return false;
                        }
                    });
                }
            });


        }
    }


}