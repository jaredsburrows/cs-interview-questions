package leetcode;

/**
 * https://leetcode.com/problems/reverse-string-ii
 *
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class Problem541ReverseStringII {
    // Time - O(N), Space - O(N)
    public static String reverseStr(String s, int k) {
        if (s == null) {
            return null;
        }

        final char[] array = s.toCharArray();
        int length = array.length;
        if (!(array.length % 2 == 0)) {
            length = length - 1;
        }

        for (int i = 0; i < length; i += 2 * k) {
            final char temporary = array[i];
            array[i] = array[i + k - 1];
            array[i + k - 1] = temporary;
        }

        return String.valueOf(array);
    }
}
