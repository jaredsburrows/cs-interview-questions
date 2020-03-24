package leetcode;

/**
 * https://leetcode.com/problems/check-if-it-is-a-straight-line/
 */
public final class Problem1232CheckIfItIsAStraightLine {
    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates == null) {
            return false;
        }

        if (coordinates.length < 3) {
            return true;
        }

        for (int i = 2; i < coordinates.length; i++) {
            int y2y1 = coordinates[i - 1][1] - coordinates[i - 2][1];
            int x2x1 = coordinates[i - 1][0] - coordinates[i - 2][0];
            if (x2x1 == 0) {
                return false;
            }

            int y3y1 = coordinates[i][1] - coordinates[i - 2][1];
            int x3x1 = coordinates[i][0] - coordinates[i - 2][0];
            if (x3x1 == 0) {
                return false;
            }

            if (y2y1 / x2x1 != y3y1 / x3x1) {
                return false;
            }
        }

        return true;
    }
}
