package leetcode;

/**
 * https://leetcode.com/problems/reverse-words-in-a-string-ii
 */
public final class Problem541ReverseWordsInAStringII {
    public void reverseWords(char[] str) {
        if (str == null || str.length == 0) {
            return;
        }

        reverse(str, 0, str.length - 1);

        int start = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i] == ' ') {
                reverse(str, start, i - 1);
                start = i + 1;
            }
        }

        reverse(str, start, str.length - 1);
    }

    private void reverse(char[] str, int left, int right) {
        while (left < right) {
            swap(str, left, right);

            left++;
            right--;
        }
    }

    private void swap(char[] str, int left, int right) {
        final char temp = str[left];
        str[left] = str[right];
        str[right] = temp;
    }
}
