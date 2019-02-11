package codingbat.recursion1;

/**
 * http://codingbat.com/prob/p120015
 */
public final class Fibonacci {
    public int fibonacci(int n) {
        if (n < 1) {
            return 0;
        }

        if (n < 2) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
