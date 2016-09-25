package me.veryyoung.dingding.luckymoney;

/**
 * Created by veryyoung on 16/9/25.
 */
public class VersionParam {

    public static String CONVERSATION_CHANGE_MAID_CLASS_NAME = "anx";

    public static String ServiceFactoryClass = "cvx";

    public static void init(String version) {
        switch (version) {
            case "3.0.0":
                CONVERSATION_CHANGE_MAID_CLASS_NAME = "anv";
                ServiceFactoryClass = "cvs";
                break;
            case "3.0.1":
                CONVERSATION_CHANGE_MAID_CLASS_NAME = "anx";
                ServiceFactoryClass = "cvx";
                break;
            default:
                CONVERSATION_CHANGE_MAID_CLASS_NAME = "anx";
                ServiceFactoryClass = "cvx";
        }
    }

}
