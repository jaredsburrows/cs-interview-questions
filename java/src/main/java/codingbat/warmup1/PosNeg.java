package codingbat.warmup1;

/**
 * http://codingbat.com/prob/p159227
 */
public final class PosNeg {
    public boolean posNeg(int a, int b, boolean negative) {
        if (negative && a < 0 && b < 0) {
            return true;
        }

        if (!negative
            && ((a > 0 && b < 0)
            || (a < 0 && b > 0))) {
            return true;
        }
        return false;
    }
}
