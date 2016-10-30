package questions.math;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class NumberLength {

    // Time - O(N), Space - O(1)
    public static int getIntegerLength(int number) {

        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }

        return count;
    }

    // Time - O(1), Space - O(1)
    // http://stackoverflow.com/a/3069580/950427
    public static int lenHelper(final int number) {
        if (number >= 1000000000) {
            return 10;
        }

        if (number >= 100000000) {
            return 9;
        }

        if (number >= 10000000) {
            return 8;
        }

        if (number >= 1000000) {
            return 7;
        }

        if (number >= 100000) {
            return 6;
        }

        if (number >= 10000) {
            return 5;
        }

        if (number >= 1000) {
            return 4;
        }

        if (number >= 100) {
            return 3;
        }

        if (number >= 10) {
            return 2;
        }

        return 1;
    }

    public static double getIntegerLogLength(final int number) {
        return Math.floor(Math.log10(Math.abs(number))) + 1;
    }
}
