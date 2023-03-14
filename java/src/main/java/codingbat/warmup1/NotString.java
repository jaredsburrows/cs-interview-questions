package codingbat.warmup1;

/**
 * https://codingbat.com/prob/p191914
 */
public final class NotString {
    public String notString(String str) {
        if (str.startsWith("not")) {
            return str;
        } else {
            return "not " + str;
        }
    }
}
