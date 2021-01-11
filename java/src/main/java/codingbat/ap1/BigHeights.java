package codingbat.ap1;

/**
 * https://codingbat.com/prob/p197710
 */
public final class BigHeights {
    public int bigHeights(int[] heights, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += Math.abs(heights[i + 1] - heights[i]) >= 5 ? 1 : 0;
        }
        return sum;
    }
}
