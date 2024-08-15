package codingbat.recursion1;

/**
 * https://codingbat.com/prob/p118230
 */
public final class NoX {
    public String noX(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }

        if ("x".equals(str.substring(0, 1))) {
            return noX(str.substring(1));
        } else {
            return str.charAt(0) + noX(str.substring(1));
        }
    }
}
