package codingbat.recursion;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public class Factorial {

    /**
     * Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1. Compute the result
     * recursively (without loops).
     */
    public static long factorial(final long number) {
        if (number < 2) {
            return 1;
        }

        return number * factorial(number - 1);
    }
}
