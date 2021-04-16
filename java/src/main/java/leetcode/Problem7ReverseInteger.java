package leetcode;

/**
 * https://leetcode.com/problems/reverse-integer
 */
public final class Problem7ReverseInteger {
    // Time - O(N), Space - O(1), using longs
    public int reverse(int x) {
        long reverseNumber = 0;

        while (x != 0) {
            // Get last digit, 3 -> 2 -> 1
            long lastDigit = x % 10;

            // Move digit, 0 -> 30 + 2 -> 300 + 20
            long moveDigit = reverseNumber * 10;

            // Keep track of reversed number, 3 -> 32 -> 321
            reverseNumber = lastDigit + moveDigit;

            // Remove last digit, 12 -> 1 -> 0
            x /= 10;
        }

        if (reverseNumber >= Integer.MAX_VALUE || reverseNumber <= Integer.MIN_VALUE) {
            return 0;
        }

        return (int) reverseNumber;
    }

    // Time - O(N), Space - O(1), no long used
    public int reverse2(int x) {
        int toReturn = 0;

        while (x != 0) {
            // Get last digit, 3 -> 2 -> 1
            int lastDigit = x % 10;

            // Move digit, 0 -> 30 + 2 -> 300 + 20
            int moveDigit = toReturn * 10;

            // Keep track of reversed number, 3 -> 32 -> 321
            int newResult = moveDigit + lastDigit;

            // Handle integer overflow
            if (((newResult - lastDigit) / 10) != toReturn) {
                return 0;
            }

            // Update
            toReturn = newResult;

            // Remove last digit, 12 -> 1 -> 0
            x /= 10;
        }

        return toReturn;
    }
}
