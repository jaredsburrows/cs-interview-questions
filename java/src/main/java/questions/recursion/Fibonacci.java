package questions.recursion;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class Fibonacci {
    public static long fibonacci(long number) {
        if (number < 2) {
            return number;
        }

        return fibonacci(number - 1) + fibonacci(number - 2);
    }
}
