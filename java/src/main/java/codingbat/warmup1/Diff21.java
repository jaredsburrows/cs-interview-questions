package codingbat.warmup1;

/**
 * http://codingbat.com/prob/p116624
 */
public final class Diff21 {
    public int diff21(int n) {
        int difference = Math.abs(21 - n);
        return n < 22 ? difference : difference * 2;
    }
}
