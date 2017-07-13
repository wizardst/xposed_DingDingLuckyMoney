package me.veryyoung.dingding.luckymoney;

/**
 * Created by veryyoung on 16/9/25.
 */
public class VersionParam {

    public static String ApiEventListener = "bfe";
    public static String ConversationChangeMaid = "buk";
    public static String ServiceFactory = "eyl";
    public static String RedPacketsRpc = "ayt";

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
            case "3.4.10":
                ApiEventListener = "ayg";
                ConversationChangeMaid = "bmb";
                ServiceFactory = "dsp";
                RedPacketsRpc = "asn";
                break;
            case "3.5.0":
                ApiEventListener = "awm";
                ConversationChangeMaid = "bky";
                ServiceFactory = "ehb";
                RedPacketsRpc = "aqi";
                break;
            case "3.5.1":
                ApiEventListener = "bfe";
                ConversationChangeMaid = "buk";
                ServiceFactory = "eyl";
                RedPacketsRpc = "ayt";
                break;
            default:
                ApiEventListener = "bfe";
                ConversationChangeMaid = "buk";
                ServiceFactory = "eyl";
                RedPacketsRpc = "ayt";
        }
    }

}
