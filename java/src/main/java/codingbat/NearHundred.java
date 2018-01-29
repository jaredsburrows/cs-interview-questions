package codingbat;

/**
 * http://codingbat.com/prob/p184004
 */
public final class NearHundred {
    public boolean nearHundred(int n) {
        return (Math.abs(100 - n) <= 10 || Math.abs(200 - n) <= 10);
    }
}
