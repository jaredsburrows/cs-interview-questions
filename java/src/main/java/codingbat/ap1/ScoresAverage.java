package codingbat.ap1;

/**
 * https://codingbat.com/prob/p123837
 */
public final class ScoresAverage {
    public int scoresAverage(int[] scores) {
        int sum = 0;
        int sum2 = 0;
        int length = scores.length / 2;
        for (int i = 0; i < scores.length; i++) {
            if (i < length) {
                sum += scores[i];
            }
            if (i >= length) {
                sum2 += scores[i];
            }
        }

        return sum > sum2 ? sum / length : sum2 / length;
    }
}
