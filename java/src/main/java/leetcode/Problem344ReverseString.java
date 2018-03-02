package leetcode;

/**
 * https://leetcode.com/problems/reverse-string
 */
public final class Problem344ReverseString {
    // Time - O(N), Space - O(N)
    public String reverseString(String s) {
        if (s == null) {
            return "";
        }

        final char[] array = s.toCharArray();

        reverse(array);

        return String.valueOf(array);
    }

    private void reverse(char[] str) {
        for (int i = 0; i < str.length / 2; i ++) {
            swap(str, i, str.length - i - 1);
        }
    }

    private void swap(char[] array, int left, int right) {
        final char temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
