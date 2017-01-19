package me.veryyoung.dingding.luckymoney;

/**
 * Created by veryyoung on 16/9/25.
 */
public class VersionParam {

    public static String ApiEventListener = "amx";
    public static String ConversationChangeMaid = "axm";
    public static String ServiceFactory = "dkk";
    public static String RedPacketsRpc = "ahy";

    public static void init(String version) {
        switch (version) {
            case "3.0.0":
                ApiEventListener = "afm";
                ConversationChangeMaid = "anv";
                ServiceFactory = "cvs";
                RedPacketsRpc = "abc";
                break;
            case "3.0.1":
                ApiEventListener = "afm";
                ConversationChangeMaid = "anx";
                ServiceFactory = "cvx";
                RedPacketsRpc = "abc";
                break;
            case "3.0.3":
                ApiEventListener = "afn";
                ConversationChangeMaid = "any";
                ServiceFactory = "cwa";
                RedPacketsRpc = "abd";
                break;
            case "3.1.0":
                ApiEventListener = "age";
                ConversationChangeMaid = "aoq";
                ServiceFactory = "cxg";
                RedPacketsRpc = "abt";
                break;
            case "3.1.1":
            case "3.1.2":
                ApiEventListener = "agi";
                ConversationChangeMaid = "apg";
                ServiceFactory = "cxt";
                RedPacketsRpc = "abx";
                break;
            case "3.2.0":
                ApiEventListener = "ajt";
                ConversationChangeMaid = "asv";
                ServiceFactory = "dce";
                RedPacketsRpc = "aff";
                break;
            case "3.3.0":
            case "3.3.1":
                ApiEventListener = "alm";
                ConversationChangeMaid = "avq";
                ServiceFactory = "dhp";
                RedPacketsRpc = "agr";
                break;
            case "3.3.3":
            case "3.3.5":
                ApiEventListener = "amx";
                ConversationChangeMaid = "axm";
                ServiceFactory = "dkk";
                RedPacketsRpc = "ahy";
                break;
            default:
                ApiEventListener = "amx";
                ConversationChangeMaid = "axm";
                ServiceFactory = "dkk";
                RedPacketsRpc = "ahy";
        }
    }

}
