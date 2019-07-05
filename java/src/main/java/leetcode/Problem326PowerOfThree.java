package leetcode;

/**
 * https://leetcode.com/problems/power-of-three/
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/102/math/745/
 */
public final class Problem326PowerOfThree {
    public boolean isPowerOfThree(int n) {
        while ((n % 3) == 0 && n > 1) {
            n = n / 3;
        }

        return n == 1;
    }
}
