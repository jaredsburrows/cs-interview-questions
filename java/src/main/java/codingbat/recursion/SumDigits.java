package codingbat.recursion;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class SumDigits {

    /**
     * Given a non-negative int n, return the sum of its digits recursively (no loops). Note that mod (%) by 10 yields
     * the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
     */
    public static int sumDigits(final int number) {
        if (number <= 0) {
            return 0;
        }

        final int lastDigit = number % 10;
        final int nextNumber = number / 10;

        return lastDigit + sumDigits(nextNumber);
    }
}
