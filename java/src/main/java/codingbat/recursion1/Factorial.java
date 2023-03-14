package codingbat.recursion1;

/**
 * https://codingbat.com/prob/p154669
 */
public final class Factorial {
    public int factorial(int n) {
        if (n < 2) {
            return 1;
        }

        return factorial(n - 1) * n;
    }
}
