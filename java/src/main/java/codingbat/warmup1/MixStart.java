package codingbat.warmup1;

/**
 * https://codingbat.com/prob/p151713
 */
public final class MixStart {
    public boolean mixStart(String str) {
        return str != null && str.length() >= 3 && str.startsWith("ix", 1);
    }
}
