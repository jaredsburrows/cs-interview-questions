package codingbat.warmup1;

/**
 * https://codingbat.com/prob/p182873
 */
public final class Makes10 {
    public boolean makes10(int a, int b) {
        return (a == 10 || b == 10) || a + b == 10;
    }
}
