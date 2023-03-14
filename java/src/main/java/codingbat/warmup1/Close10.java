package codingbat.warmup1;

/**
 * https://codingbat.com/prob/p172021
 */
public final class Close10 {
    public int close10(int a, int b) {
        int left = Math.abs(a - 10);
        int right = Math.abs(b - 10);

        if (left == right) {
            return 0;
        } else if (left > right) {
            return b;
        } else {
            return a;
        }
    }
}
