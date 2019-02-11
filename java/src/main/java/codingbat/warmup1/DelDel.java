package codingbat.warmup1;

/**
 * http://codingbat.com/prob/p100905
 */
public final class DelDel {
    public String delDel(String str) {
        if (str == null) {
            return "";
        }

        if (str.length() >= 4 && str.substring(1, 4).equals("del")) {
            return str.charAt(0) + str.substring(4);
        } else {
            return str;
        }
    }
}
