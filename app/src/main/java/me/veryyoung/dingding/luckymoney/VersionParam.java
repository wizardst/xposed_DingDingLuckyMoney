package me.veryyoung.dingding.luckymoney;

/**
 * Created by veryyoung on 16/9/25.
 */
public class VersionParam {

    public static String ApiEventListenerClass = "alm";
    public static String ConversationChangeMaidClassName = "avq";
    public static String ServiceFactoryClass = "dhp";
    public static String RedPacketsRpcClassName = "agr";

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
            case "3.1.1":
            case "3.1.2":
                ApiEventListenerClass = "agi";
                ConversationChangeMaidClassName = "apg";
                ServiceFactoryClass = "cxt";
                RedPacketsRpcClassName = "abx";
                break;
            case "3.2.0":
                ApiEventListenerClass = "ajt";
                ConversationChangeMaidClassName = "asv";
                ServiceFactoryClass = "dce";
                RedPacketsRpcClassName = "aff";
                break;
            case "3.3.0":
                ApiEventListenerClass = "alm";
                ConversationChangeMaidClassName = "avq";
                ServiceFactoryClass = "dhp";
                RedPacketsRpcClassName = "agr";
                break;
            default:
                ApiEventListenerClass = "alm";
                ConversationChangeMaidClassName = "avq";
                ServiceFactoryClass = "dhp";
                RedPacketsRpcClassName = "agr";
        }
    }

}
