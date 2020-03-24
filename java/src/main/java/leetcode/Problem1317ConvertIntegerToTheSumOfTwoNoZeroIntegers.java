package leetcode;

/**
 * https://leetcode.com/problems/convert-integer-to-the-sum-of-two-no-zero-integers/
 */
public final class Problem1317ConvertIntegerToTheSumOfTwoNoZeroIntegers {
    public int[] getNoZeroIntegers(int n) {
        if (n < 2) {
            return new int[0];
        }

        for (int i = 1; i <= n / 2; i++) {
            int diff = n - i;
            if (!String.valueOf(i).contains("0")
                && !String.valueOf(diff).contains("0")) {
                return new int[] {i, diff};
            }
        }

        return new int[0];
    }
}
