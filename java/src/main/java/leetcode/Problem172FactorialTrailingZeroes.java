package leetcode;

/**
 * https://leetcode.com/problems/factorial-trailing-zeroes
 */
public final class Problem172FactorialTrailingZeroes {
    public int trailingZeroes(int n) {
        int zeroes = 0;
        while (n > 4) {
            zeroes += n / 5;
            n /= 5;
        }

        return zeroes;
    }
}
