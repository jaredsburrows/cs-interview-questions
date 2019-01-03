package leetcode;

/**
 * https://leetcode.com/problems/palindrome-number
 */
public final class Problem9PalindromeNumber {
    // Time - O(N), Space - O(1)
    public boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }

        int reverseNumber = 0;
        while (x > reverseNumber) {
            int moveDigit = reverseNumber * 10;
            int lastDigit = x % 10;

            reverseNumber = moveDigit + lastDigit;

            x /= 10;
        }

        return x == reverseNumber || x == reverseNumber / 10;
    }

    // Time - O(N), Space - O(1)
    public boolean isPalindrome2(long number) {
        if (number < 0) {
            return false;
        }

        long originalNumber = number;
        long reverseNumber = 0;

        while (number != 0) {
            long moveDigit = reverseNumber * 10;
            long lastDigit = number % 10;

            reverseNumber = moveDigit + lastDigit;

            number /= 10;
        }

        return originalNumber == reverseNumber;
    }
}
