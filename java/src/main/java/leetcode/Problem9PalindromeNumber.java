package leetcode;

/**
 * https://leetcode.com/problems/palindrome-number/description
 *
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class Problem9PalindromeNumber {
    // Time - O(N), Space - O(1)
    public static boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }

        int reverseNumber = 0;
        while (x > reverseNumber) {
            final int moveDigit = reverseNumber * 10;
            final int lastDigit = x % 10;

            reverseNumber = moveDigit + lastDigit;

            x /= 10;
        }

        return x == reverseNumber || x == reverseNumber / 10;
    }
}
