package codingbat;

/**
 * http://codingbat.com/prob/p154669
 */
public final class Factorial {
    public int factorial(int n) {
        if (n < 2) {
            return 1;
        }

        return n * factorial(n - 1);
    }
}
