package codingbat.ap1;

/**
 * https://codingbat.com/prob/p194530
 */
public final class ScoresClump {
    public boolean scoresClump(int[] scores) {
        for (int i = 0; i < scores.length; i++) {
            if (i + 2 < scores.length && scores[i + 2] - scores[i] <= 2) {
                return true;
            }
        }
        return false;
    }
}
