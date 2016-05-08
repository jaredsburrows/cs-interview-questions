package questions.math;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public class NumberLength {

    // Time - O(N), Space - O(1)
    public static int getIntegerLength(int n) {

        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }

        return count;
    }

    // Time - O(1), Space - O(1)
    // http://stackoverflow.com/a/3069580/950427
    public static int lenHelper(int x) {
        if (x >= 1000000000) {
            return 10;
        }
        if (x >= 100000000) {
            return 9;
        }
        if (x >= 10000000) {
            return 8;
        }
        if (x >= 1000000) {
            return 7;
        }
        if (x >= 100000) {
            return 6;
        }
        if (x >= 10000) {
            return 5;
        }
        if (x >= 1000) {
            return 4;
        }
        if (x >= 100) {
            return 3;
        }
        if (x >= 10) {
            return 2;
        }
        return 1;
    }

    public static double getIntegerLogLength(final int n) {
        return Math.floor(Math.log10(Math.abs(n))) + 1;
    }
}
