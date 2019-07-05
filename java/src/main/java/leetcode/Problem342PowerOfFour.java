package leetcode;

/**
 * https://leetcode.com/problems/power-of-four/
 */
public final class Problem342PowerOfFour {
    public boolean isPowerOfFour(int num) {
        while ((num % 4) == 0 && num > 1) {
            num = num / 4;
        }

        return num == 1;
    }
}
