package codingbat.warmup1;

/**
 * http://codingbat.com/prob/p112564
 */
public final class Or35 {
    public boolean or35(int n) {
        return n > 0 && ((n % 3) == 0 || (n % 5) == 0);
    }
}
