package leetcode;

/**
 * https://leetcode.com/problems/sum-of-square-numbers/
 */
public final class Problem633SumOfSquareNumbers {
    public boolean judgeSquareSum(int c) {
        int limit = (int) Math.sqrt(c);
        for (int i = 0; i <= limit; i++) {
            double sqrt = Math.sqrt(c - i * i);
            if (Math.floor(sqrt) == sqrt) {
                return true;
            }
        }

        return false;
    }
}
