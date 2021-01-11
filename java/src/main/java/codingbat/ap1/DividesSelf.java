package codingbat.ap1;

/**
 * https://codingbat.com/prob/p165941
 */
public final class DividesSelf {
    public boolean dividesSelf(int n) {
        int remainder = 0;
        int temp = 0;

        temp = n;

        while (n != 0) {
            remainder = n % 10;
            if (remainder == 0) {
                return false;
            }

            if (temp % remainder != 0) {
                return false;
            }
            n = n / 10;
        }

        return true;
    }
}
