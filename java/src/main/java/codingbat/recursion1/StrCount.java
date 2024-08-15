package codingbat.recursion1;

/**
 * https://codingbat.com/prob/p186177
 */
public final class StrCount {
    public int strCount(String str, String sub) {
        if (str == null
            || str.isEmpty()
            || sub == null
            || sub.isEmpty()
            || str.length() < sub.length()) {
            return 0;
        }

        if (str.startsWith(sub)) {
            return strCount(str.substring(sub.length()), sub) + 1;
        } else {
            return strCount(str.substring(1), sub);
        }
    }
}
