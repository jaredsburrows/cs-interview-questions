package codingbat.warmup1;

/**
 * http://codingbat.com/prob/p154485
 */
public final class SumDouble {
    public int sumDouble(int a, int b) {
        if (a == b) {
            return 2 * (a + b);
        } else {
            return a + b;
        }
    }
}
