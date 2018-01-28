package questions;

public final class Pow {
    public static long pow(int number, int exponent) {
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
