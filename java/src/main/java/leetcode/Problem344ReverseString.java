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
        int i = 0;
        int j = array.length - 1;

        while (i < j) {
            swap(array, i, j);

            i++;
            j--;
        }

        return String.valueOf(array);
    }

    private void swap(char[] array, int left, int right) {
        final char temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
