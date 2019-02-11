package codingbat.recursion1;

/**
 * http://codingbat.com/prob/p170371
 */
public final class CountX {
    public int countX(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        if ("x".equals(str.substring(str.length() - 1))) {
            return countX(str.substring(0, str.length() - 1)) + 1;
        } else {
            return countX(str.substring(0, str.length() - 1));
        }
    }
}
