package codingbat.recursion1;

/**
 * http://codingbat.com/prob/p158888
 */
public final class PowerN {
    public int powerN(int base, int n) {
        if (base <= 0) {
            return 0;
        }

        if (n <= 0) {
            return 1;
        }

        return powerN(base, n - 1) * base;
    }
}
