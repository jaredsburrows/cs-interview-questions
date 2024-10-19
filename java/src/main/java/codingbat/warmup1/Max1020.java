package codingbat.warmup1;

/**
 * https://codingbat.com/prob/p177372
 */
public final class Max1020 {
    public int max1020(int a, int b) {
        if ((a <= 20 && a >= 10) && (b <= 20 && b >= 10)) {
            return Math.max(a, b);
        } else if (!(a <= 20 && a >= 10) && (b <= 20 && b >= 10)) {
            return b;
        } else if (a <= 20 && a >= 10) {
            return a;
        }
        return 0;
    }
}
