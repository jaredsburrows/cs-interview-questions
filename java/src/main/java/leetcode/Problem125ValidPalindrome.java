package leetcode;

/**
 * https://leetcode.com/problems/valid-palindrome
 */
public final class Problem125ValidPalindrome {
    // Time - O(N), Space - O(1)
    public boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }

        if (s.isEmpty() || s.length() < 2) {
            return true;
        }

        s = s.toLowerCase();

        final char[] array = s.toCharArray();
        int i = 0;
        int j = array.length - 1;

        while (i < j) {
            while (i < j && !Character.isLetterOrDigit(array[i])) {
                i++;
            }

            while (i < j && !Character.isLetterOrDigit(array[j])) {
                j--;
            }

            if (i >= j) {
                break;
            }

            if (array[i] != array[j]) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}
