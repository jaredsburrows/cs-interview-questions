package leetcode;

/**
 * https://leetcode.com/problems/reverse-string-ii
 */
public final class Problem541ReverseStringII {
    // Time - O(N), Space - O(N)
    public String reverseStr(String s, int k) {
        if (s == null) {
            return "";
        }

        final char[] array = s.toCharArray();
        int length = array.length;
        if (!(array.length % 2 == 0)) {
            length--;
        }

        for (int i = 0; i < length; i += 2 * k) {
            swap(array, i, i + k - 1);
        }

        return String.valueOf(array);
    }

    // Time - O(1), Space - O(1)
    private void swap(char[] array, int left, int right) {
        final char temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
