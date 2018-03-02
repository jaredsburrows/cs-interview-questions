package leetcode;

/**
 * https://leetcode.com/problems/sqrtx
 */
public final class Problem69Sqrt {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        long low = 0;
        long high = x / 2L + 1L;

        while (low <= high) {
            final long mid = low + (high - low) / 2;

            if (mid * mid == x) {
                return (int) mid;
            } else if (mid * mid < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return (int) high;
    }
}
