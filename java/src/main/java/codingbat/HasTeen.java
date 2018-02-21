package codingbat;

/**
 * http://codingbat.com/prob/p178986
 */
public final class HasTeen {
    public boolean hasTeen(int a, int b, int c) {
        return (a <= 19 && a >= 13) || (b <= 19 && b >= 13) || (c <= 19 && c >= 13);
    }
}
