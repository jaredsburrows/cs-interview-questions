package leetcode;

/**
 * https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/
 */
public final class Problem1523CountOddNumbersInAnIntervalRange {
    public int countOdds(int low, int high) {
        if (low < 0 || high < 0 || low > high) {
            return -1;
        }

        if (low % 2 != 0 && high % 2 != 0) {
            return (high - low) / 2 + 1;
        } else {
            return (high - low + 1) / 2;
        }
    }
}
