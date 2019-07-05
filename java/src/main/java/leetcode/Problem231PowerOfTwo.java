package leetcode;

/**
 * https://leetcode.com/problems/power-of-two/
 */
public final class Problem231PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        while ((n % 2) == 0 && n > 1) {
            n = n / 2;
        }

        return n == 1;
    }
}
