package codingbat.ap1;

/**
 * https://codingbat.com/prob/p140485
 */
public final class ScoresSpecial {
    public int scoresSpecial(int[] a, int[] b) {
        int max = -1;
        if (a.length == 0 && !(b.length == 0) && b[0] % 10 == 0) {
            return b[0];
        }

        if (a.length == 0 && !(b.length == 0)) {
            return 0;
        }

        for (int item : a) {
            for (int value : b) {
                int temp = item + value;
                if (temp >= max && temp % 10 == 0) {
                    max = temp;
                }

                if (value >= max && value % 10 == 0) {
                    max = value;
                }
            }

            if (item >= max && item % 10 == 0) {
                max = item;
            }
        }

        return max;
    }
}
