package codingbat;

public final class PowerN {
    public int powerN(int base, int power) {
        if (base < 2 || power < 1) {
            return 1;
        }

        return base * powerN(base, power - 1);
    }
}
