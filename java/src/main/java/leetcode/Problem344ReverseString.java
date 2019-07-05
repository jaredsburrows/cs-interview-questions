package leetcode;

/**
 * https://leetcode.com/problems/reverse-string
 * https://leetcode.com/explore/featured/card/recursion-i/250/principle-of-recursion/1440/
 * https://leetcode.com/explore/learn/card/array-and-string/205/array-two-pointer-technique/1183/
 */
public final class Problem344ReverseString {
    // Time - O(N), Space - O(N)
    public String reverseString(String s) {
        if (s == null) {
            return "";
        }

        char[] array = s.toCharArray();

        reverse(array);

        return String.valueOf(array);
    }

    // Time - O(N), Space - O(1) - iteration
    private static void reverse(char[] str) {
        for (int i = 0; i < str.length / 2; i ++) {
            swap(str, i, str.length - i - 1);
        }
    }

    // recursion
    public void reverseString2(char[] s) {
        if (s == null || s.length == 0) {
            return;
        }

        reverse2(s, 0, s.length - 1);
    }

    private static void reverse2(char[] array, int left, int right) {
        if (left >= right) {
            return;
        }

        swap(array, left, right);

        reverse2(array, left + 1, right - 1);
    }

    // Time - O(1), Space - O(1)
    private static void swap(char[] array, int left, int right) {
        char temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
