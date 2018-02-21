package codingbat;

/**
 * http://codingbat.com/prob/p192082
 */
public final class IcyHot {
    public boolean icyHot(int temp1, int temp2) {
        return (temp1 < 0 && temp2 > 100) || (temp2 < 0 && temp1 > 100);
    }
}
