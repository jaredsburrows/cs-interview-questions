package codingbat.warmup1;

/**
 * https://codingbat.com/prob/p181646
 */
public final class MonkeyTrouble {
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return (aSmile && bSmile) || (!aSmile && !bSmile);
    }
}
