package questions.math;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public class Pow {

    public static long pow(final int x, final int n) {
        if (n < 0) {
            return 0;
        }

        long product = x;

        for (int i = 1; i < n; i++) {
            product *= x;
        }

        return product;
    }
}
