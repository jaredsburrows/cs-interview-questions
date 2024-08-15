package codingbat.recursion1;

/**
 * https://codingbat.com/prob/p104029
 */
public final class StringClean {
    public String stringClean(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }

        if (str.length() >= 2 && str.substring(0, 1).equals(str.substring(1, 2))) {
            return stringClean(str.substring(1));
        } else {
            return str.charAt(0) + stringClean(str.substring(1));
        }
    }
}
