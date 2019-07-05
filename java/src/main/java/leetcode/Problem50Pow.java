package leetcode;

/**
 * https://leetcode.com/problems/powx-n
 * https://leetcode.com/explore/learn/card/recursion-i/256/complexity-analysis/2380/
 */
public final class Problem50Pow {
    // recursion
    public double myPow(double x, int n) {
        if (n < 0) {
            x = 1 / x;

            if (n == Integer.MIN_VALUE) {
                return x * myPow(x, Integer.MAX_VALUE);
            } else {
                n = -n;
            }
        }

        if (n == 0) {
            return 1;
        }

        return n % 2 == 0 ? myPow(x * x, n / 2) : x * myPow(x * x, n / 2);
    }
}
