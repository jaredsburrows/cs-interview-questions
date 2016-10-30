package projecteuler;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class Number002 {

    public static long getEvenFibonacciNumbers(final long number) {
        long first = 1;
        long second = 1;
        long sum = 0;

        while (sum < number) {
            long next = first + second;
            second = first;
            first = next;

            if (next % 2 == 0) {
                sum += next;
            }
        }

        return sum;
    }
}
