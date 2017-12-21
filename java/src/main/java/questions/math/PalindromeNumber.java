package questions.math;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class PalindromeNumber {
    public static boolean isPalindrome(long number) {
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
