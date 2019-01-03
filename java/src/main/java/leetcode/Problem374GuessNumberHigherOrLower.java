package leetcode;

/**
 * https://leetcode.com/problems/guess-number-higher-or-lower
 */
public final class Problem374GuessNumberHigherOrLower {
    public int guessNumber(int n) {
        int low = 1;
        int high = n;

        while (low < high) {
            final int mid = low + (high - low) / 2;

            if (guess(mid) == 1) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }

    // stub - part of question
    private int guess(int n) {
        return -1;
    }
}
