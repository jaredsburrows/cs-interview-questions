package codingbat.recursion;

public final class PowerN {
    /**
     * Given base and n that are both 1 or more, compute recursively (no loops) the value of base to
     * the n power, so powerN(3, 2) is 9 (3 squared).
     */
    public static int powerN(int base, int power) {
        if (base < 2 || power < 1) {
            return 1;
        }

        return base * powerN(base, power - 1);
    }
}
