package leetcode;

/**
 * https://leetcode.com/problems/ugly-number/
 */
public final class Problem263UglyNumber {
    public boolean isUgly(int num) {
        if (num < 1) {
            return false;
        }

        for (int i = 2; i < 6; i++) {
            while (num % i == 0) {
                num /= i;
            }
        }

        return num == 1;
    }
}
