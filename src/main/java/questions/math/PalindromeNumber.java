package questions.math;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public class PalindromeNumber {

    public static boolean isPalindrome(long number) {
        if (number < 0) {
            return false;
        }

        final long originalNumber = number;
        long reverseNumber = 0;

        while (number != 0) {
            reverseNumber = (reverseNumber * 10) + (number % 10);
            number /= 10;
        }

        return originalNumber == reverseNumber;
    }
}
