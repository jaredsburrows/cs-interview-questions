package codingbat.ap1;

/**
 * https://codingbat.com/prob/p148138
 */
public final class SumHeights {
    public int sumHeights(int[] heights, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += Math.abs(heights[i] - heights[i + 1]);
        }
        return sum;
    }
}
