package codingbat.warmup1;

/**
 * https://codingbat.com/prob/p165701
 */
public final class LoneTeen {
    public boolean loneTeen(int a, int b) {
        return ((a > 19 || a < 13)
            || (b > 19 || b < 13))
            && ((a <= 19 && a >= 13)
            || (b <= 19 && b >= 13));
    }
}
