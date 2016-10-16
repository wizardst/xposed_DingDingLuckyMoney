package me.veryyoung.dingding.luckymoney;

/**
 * Created by veryyoung on 16/9/25.
 */
public class VersionParam {

    public static String ApiEventListenerClass = "afn";
    public static String ConversationChangeMaidClassName = "any";
    public static String ServiceFactoryClass = "cwa";
    public static String RedPacketsRpcClassName = "abd";

    public static void init(String version) {
        switch (version) {
            case "3.0.0":
                ApiEventListenerClass = "afm";
                ConversationChangeMaidClassName = "anv";
                ServiceFactoryClass = "cvs";
                RedPacketsRpcClassName = "abc";
                break;
            case "3.0.1":
                ApiEventListenerClass = "afm";
                ConversationChangeMaidClassName = "anx";
                ServiceFactoryClass = "cvx";
                RedPacketsRpcClassName = "abc";
                break;
            case "3.0.3":
                ApiEventListenerClass = "afn";
                ConversationChangeMaidClassName = "any";
                ServiceFactoryClass = "cwa";
                RedPacketsRpcClassName = "abd";
                break;
            default:
                ApiEventListenerClass = "afn";
                ConversationChangeMaidClassName = "any";
                ServiceFactoryClass = "cwa";
                RedPacketsRpcClassName = "abd";
        }
    }

}
