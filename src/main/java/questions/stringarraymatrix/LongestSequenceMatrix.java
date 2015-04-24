package questions.stringarraymatrix;

public class LongestSequenceMatrix {

    /**
     * Given NxN matrix, 1..n - all numbers are unique
     * Find largest sequence of consecutive numbers.
     */
    public static int getLongestSequence(int[][] matrix) {
        if (matrix == null) {
            return -1;
        }

        int row = 0;
        int col = 0;

        int max = -1;
        int length = matrix.length - 1;
        int n = matrix.length * matrix.length;
        int count = 1; // start with 1

        while (n != 0) {
            // find next highest "n"
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] == n) {
                        n = matrix[i][j];
                        row = i;
                        col = j;
                    }
                }
            }

            // start at row col of "n"
            while (true) {
                int current = matrix[row][col];
                if ((row + 1) <= length && ((current - 1) == matrix[row + 1][col])) {
                    // go right x
                    row++;
                    count++;
                    n--;
                } else if ((row - 1) >= 0 && ((current - 1) == matrix[row - 1][col])) {
                    // go right x
                    row--;
                    count++;
                    n--;
                } else if ((col + 1) <= length && ((current - 1) == matrix[row][col + 1])) {
                    // go up y
                    col++;
                    count++;
                    n--;
                } else if ((col - 1) >= 0 && ((current - 1) == matrix[row][col - 1])) {
                    // go down y
                    col--;
                    count++;
                    n--;
                } else {
                    // is nothing is -1, stop
                    if (count > max) {
                        max = count;
                    }
                    count = 0;
                    n--;
                    break;
                }
            }
        }

        return max;
    }
}
