package codingbat.recursion;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class AllStar {
    /**
     * Given a string, compute recursively a new string where all the adjacent chars are now separated
     * by a "*".
     */
    public static String allStar(String str) {
        if (str == null || str.isEmpty() || str.length() == 1) {
            return str;
        }

        final int nextLength = str.length() - 1;
        final String nextString = str.substring(0, nextLength);
        final String addStar = "*" + str.charAt(nextLength);

        return allStar(nextString) + addStar;
    }
}
