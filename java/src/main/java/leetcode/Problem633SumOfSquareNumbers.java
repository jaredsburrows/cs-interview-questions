package leetcode;

/**
 * https://leetcode.com/problems/sum-of-square-numbers/
 */
public final class Problem633SumOfSquareNumbers {
    public boolean judgeSquareSum(int c) {
        for (int i = 0; i <= Math.sqrt(c); i++) {
            double sqrt = Math.sqrt(c - i * i);
            if (Math.floor(sqrt) == sqrt) {
                return true;
            }
        }

        return false;
    }
}
