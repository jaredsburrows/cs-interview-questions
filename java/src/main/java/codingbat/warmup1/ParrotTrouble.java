package codingbat.warmup1;

/**
 * https://codingbat.com/prob/p140449
 */
public final class ParrotTrouble {
    public boolean parrotTrouble(boolean talking, int hour) {
        return (hour < 7 || hour > 20) && talking;
    }
}
