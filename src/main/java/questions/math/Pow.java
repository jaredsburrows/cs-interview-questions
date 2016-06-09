package questions.math;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public class Pow {

    public static long pow(final int number, final int exponent) {
        if (exponent < 0) {
            return 0;
        }

        long product = number;

        for (int i = 1; i < exponent; i++) {
            product *= number;
        }

        return product;
    }
}
