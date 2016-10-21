package me.veryyoung.dingding.luckymoney;

/**
 * Created by veryyoung on 16/9/25.
 */
public class VersionParam {

    public static String ApiEventListenerClass = "age";
    public static String ConversationChangeMaidClassName = "aoq";
    public static String ServiceFactoryClass = "cxg";
    public static String RedPacketsRpcClassName = "abt";

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
            case "3.1.0":
                ApiEventListenerClass = "age";
                ConversationChangeMaidClassName = "aoq";
                ServiceFactoryClass = "cxg";
                RedPacketsRpcClassName = "abt";
                break;
            default:
                ApiEventListenerClass = "age";
                ConversationChangeMaidClassName = "aoq";
                ServiceFactoryClass = "cxg";
                RedPacketsRpcClassName = "abt";
        }
    }

}
