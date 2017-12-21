package me.veryyoung.dingding.luckymoney;

/**
 * Created by veryyoung on 16/9/25.
 */
public class VersionParam {

    public static String ApiEventListener = "bkf";
    public static String ConversationChangeMaid = "cbj";
    public static String ServiceFactory = "ftg";
    public static String RedPacketsRpc = "bcq";
    public static String MessageDs = "fhe";

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
                MessageDs = "cuw";
                break;
            case "3.3.3":
            case "3.3.5":
                ApiEventListener = "amx";
                ConversationChangeMaid = "axm";
                ServiceFactory = "dkk";
                RedPacketsRpc = "ahy";
                MessageDs = "cwz";
                break;
            case "3.4.0":
                ApiEventListener = "asi";
                ConversationChangeMaid = "bdz";
                ServiceFactory = "dht";
                RedPacketsRpc = "ana";
                MessageDs = "cuy";
                break;
            case "3.4.6":
                ApiEventListener = "arw";
                ConversationChangeMaid = "bfk";
                ServiceFactory = "dkv";
                RedPacketsRpc = "amj";
                MessageDs = "cxw";
                break;
            case "3.4.8":
                ApiEventListener = "ayj";
                ConversationChangeMaid = "bme";
                ServiceFactory = "dsp";
                RedPacketsRpc = "asq";
                MessageDs = "dey";
                break;
            case "3.4.10":
                ApiEventListener = "ayg";
                ConversationChangeMaid = "bmb";
                ServiceFactory = "dsp";
                RedPacketsRpc = "asn";
                MessageDs = "dey";
                break;
            case "3.5.0":
                ApiEventListener = "awm";
                ConversationChangeMaid = "bky";
                ServiceFactory = "ehb";
                RedPacketsRpc = "aqi";
                MessageDs = "dtk";
                break;
            case "3.5.1":
                ApiEventListener = "bfe";
                ConversationChangeMaid = "buk";
                ServiceFactory = "eyl";
                RedPacketsRpc = "ayt";
                MessageDs = "ekb";
                break;
            case "3.5.2":
            case "3.5.2.20":
                ApiEventListener = "biu";
                ConversationChangeMaid = "byf";
                ServiceFactory = "ezn";
                RedPacketsRpc = "bce";
                MessageDs = "eli";
                break;
            case "3.5.3":
                ApiEventListener = "bls";
                ConversationChangeMaid = "cbj";
                ServiceFactory = "fdy";
                RedPacketsRpc = "bfb";
                MessageDs = "ept";
                break;
            case "3.5.6":
                ApiEventListener = "blv";
                ConversationChangeMaid = "cbs";
                ServiceFactory = "ffk";
                RedPacketsRpc = "bfb";
                MessageDs = "erf";
                break;
            case "4.0.0":
            case "4.0.1":
            case "4.0.2":
                ApiEventListener = "bon";
                ConversationChangeMaid = "cfl";
                ServiceFactory = "fkd";
                RedPacketsRpc = "bhb";
                MessageDs = "ewd";
                break;
            case "4.1.0":
            case "4.1.5":
                ApiEventListener = "bsv";
                ConversationChangeMaid = "ckf";
                ServiceFactory = "fou";
                RedPacketsRpc = "blf";
                MessageDs = "fcu";
                break;
            case "4.2.0":
                ApiEventListener = "bkf";
                ConversationChangeMaid = "cbj";
                ServiceFactory = "ftg";
                RedPacketsRpc = "bcq";
                MessageDs = "fhe";
                break;
            default:
                ApiEventListener = "bkf";
                ConversationChangeMaid = "cbj";
                ServiceFactory = "ftg";
                RedPacketsRpc = "bcq";
                MessageDs = "fhe";
        }
    }

}
