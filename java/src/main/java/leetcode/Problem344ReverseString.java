package leetcode;

/**
 * https://leetcode.com/problems/reverse-string
 */
public final class Problem344ReverseString {
    // Time - O(N), Space - O(N)
    public static String reverseString(String s) {
        if (s == null) {
            return "";
        }

        final char[] array = s.toCharArray();
        int i = 0;
        int j = array.length - 1;

        while (i < j) {
            final char temporary = array[i];
            array[i] = array[j];
            array[j] = temporary;

            i++;
            j--;
        }

        return String.valueOf(array);
    }
}
