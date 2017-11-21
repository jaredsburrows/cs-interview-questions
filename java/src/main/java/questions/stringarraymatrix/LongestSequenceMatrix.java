package questions.stringarraymatrix;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class LongestSequenceMatrix {

    /**
     * Given NxN matrix, 1..n - all numbers are unique
     * Find largest sequence of consecutive numbers.
     */
    public static int getLongestSequence(final int[][] matrix) {
        if (matrix == null) {
            return -1;
        }

        int row = 0;
        int col = 0;
        int rowLength = matrix.length - 1;

        int largestSequence = -1;
        int positions = matrix.length * matrix.length;
        int count = 1; // start with 1

        while (positions != 0) {
            // find next highest "n"
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] == positions) {
                        positions = matrix[i][j];
                        row = i;
                        col = j;
                    }
                }
            }

            // start at row col of "n"
            while (true) {
                int current = matrix[row][col];
                if ((row + 1) <= rowLength && (current - 1) == matrix[row + 1][col]) {
                    // go right x
                    row++;
                    count++;
                    positions--;
                } else if ((row - 1) >= 0 && (current - 1) == matrix[row - 1][col]) {
                    // go right x
                    row--;
                    count++;
                    positions--;
                } else if ((col + 1) <= rowLength && (current - 1) == matrix[row][col + 1]) {
                    // go up y
                    col++;
                    count++;
                    positions--;
                } else if ((col - 1) >= 0 && (current - 1) == matrix[row][col - 1]) {
                    // go down y
                    col--;
                    count++;
                    positions--;
                } else {
                    // is nothing is -1, stop
                    if (count > largestSequence) {
                        largestSequence = count;
                    }
                    count = 0;
                    positions--;
                    break;
                }
            }
        }

        return largestSequence;
    }
}
