package codingbat.warmup1;

/**
 * http://codingbat.com/prob/p101887
 */
public final class IntMax {
    public int intMax(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else if (c > a && c > b) {
            return c;
        } else {
            return 0;
        }
    }
}
