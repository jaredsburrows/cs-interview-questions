package codingbat.warmup1;

/**
 * https://codingbat.com/prob/p100905
 */
public final class DelDel {
    public String delDel(String str) {
        if (str == null) {
            return "";
        }

        if (str.length() >= 4 && str.startsWith("del", 1)) {
            return str.charAt(0) + str.substring(4);
        } else {
            return str;
        }
    }
}
