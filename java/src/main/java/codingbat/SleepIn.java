package codingbat;

/**
 * http://codingbat.com/prob/p187868
 */
public final class SleepIn {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }
}
