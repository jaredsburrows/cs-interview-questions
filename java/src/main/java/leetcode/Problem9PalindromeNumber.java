package leetcode;

/**
 * https://leetcode.com/problems/palindrome-number/description
 */
public final class Problem9PalindromeNumber {
    // Time - O(N), Space - O(1)
    public boolean isPalindrome(int x) {
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

    public boolean isPalindrome2(long number) {
        if (number < 0) {
            return false;
        }

        final long originalNumber = number;
        long reverseNumber = 0;

        while (number != 0) {
            final long moveDigit = reverseNumber * 10;
            final long lastDigit = number % 10;

            reverseNumber = moveDigit + lastDigit;

            number /= 10;
        }

        return originalNumber == reverseNumber;
    }
}
