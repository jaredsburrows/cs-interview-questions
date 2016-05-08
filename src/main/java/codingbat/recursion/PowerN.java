package codingbat.recursion;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public class PowerN {

    /**
     * Given base and n that are both 1 or more, compute recursively (no loops) the value of base to the n power,
     * so powerN(3, 2) is 9 (3 squared).
     */
    public static int powerN(final int base, final int power) {
        if (base < 2) {
            return 1;
        }

        if (power < 1) {
            return 1;
        }

        return base * powerN(base, power - 1);
    }
}
