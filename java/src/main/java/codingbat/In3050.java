package codingbat;

/**
 * http://codingbat.com/prob/p132134
 */
public final class In3050 {
    public boolean in3050(int a, int b) {
        return ((a <= 40 && a >= 30)
            && (b <= 40 && b >= 30))
            || ((a <= 50 && a >= 40)
            && (b <= 50 && b >= 40));
    }
}
