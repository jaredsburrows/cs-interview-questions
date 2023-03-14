package codingbat.recursion1;

/**
 * https://codingbat.com/prob/p161124
 */
public final class CountAbc {
    public int countAbc(String str) {
        if (str == null || str.isEmpty() || str.length() < 3) {
            return 0;
        }

        if ("abc".equals(str.substring(0, 3)) || "aba".equals(str.substring(0, 3))) {
            return countAbc(str.substring(1)) + 1;
        } else {
            return countAbc(str.substring(1));
        }
    }
}
