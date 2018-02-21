package codingbat;

/**
 * http://codingbat.com/prob/p159227
 */
public final class PosNeg {
    public boolean posNeg(int a, int b, boolean negative) {
        if (negative && a < 0 && b < 0) {
            return true;
        }

        if (!negative) {
            if (a > 0 && b < 0) {
                return true;
            }
            if (a < 0 && b > 0) {
                return true;
            }
        }
        return false;
    }
}
