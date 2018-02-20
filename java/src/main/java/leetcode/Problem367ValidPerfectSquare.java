package leetcode;

/**
 * https://leetcode.com/problems/valid-perfect-square
 * https://leetcode.com/explore/learn/card/binary-search/137/conclusion/978/
 */
public final class Problem367ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        int low = 1;
        int high = num;

        while (low <= high) {
            final long mid = (long) (low + high) >>> 1;
            if (mid * mid == num) {
                return true;
            } else if (mid * mid < num) {
                low = (int) mid + 1;
            } else {
                high = (int) mid - 1;
            }
        }

        return false;
    }
}
