package codingbat.recursion1;

/**
 * https://codingbat.com/prob/p163932
 */
public final class SumDigits {
    public int sumDigits(int n) {
        if (n <= 0) {
            return 0;
        }

        return sumDigits(n / 10) + n % 10;
    }
}
