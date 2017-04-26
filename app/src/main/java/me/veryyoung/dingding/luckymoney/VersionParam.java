package me.veryyoung.dingding.luckymoney;

/**
 * Created by veryyoung on 16/9/25.
 */
public class VersionParam {

    public static String ApiEventListener = "ayj";
    public static String ConversationChangeMaid = "bme";
    public static String ServiceFactory = "dsp";
    public static String RedPacketsRpc = "asq";

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
            case "3.4.0":
                ApiEventListener = "asi";
                ConversationChangeMaid = "bdz";
                ServiceFactory = "dht";
                RedPacketsRpc = "ana";
                break;
            case "3.4.6":
                ApiEventListener = "arw";
                ConversationChangeMaid = "bfk";
                ServiceFactory = "dkv";
                RedPacketsRpc = "amj";
                break;
            case "3.4.8":
                ApiEventListener = "ayj";
                ConversationChangeMaid = "bme";
                ServiceFactory = "dsp";
                RedPacketsRpc = "asq";
                break;
            default:
                ApiEventListener = "ayj";
                ConversationChangeMaid = "bme";
                ServiceFactory = "dsp";
                RedPacketsRpc = "asq";
        }
    }

}
