package codingbat.ap1;

/**
 * https://codingbat.com/prob/p157900
 */
public final class SumHeights2 {
    public int sumHeights2(int[] heights, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += heights[i + 1] - heights[i] > 0
                ? Math.abs(heights[i] - heights[i + 1]) * 2
                : Math.abs(heights[i] - heights[i + 1]);
        }
        return sum;
    }
}
