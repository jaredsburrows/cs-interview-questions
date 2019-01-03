package leetcode;

/**
 * https://leetcode.com/problems/range-sum-query-2d-immutable
 */
public final class Problem304RangeSumQuery2DImmutable {
    public static class NumMatrix {
        private int[][] array;

        public NumMatrix(int[][] matrix) {
            if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
                return;
            }

            int rows = matrix.length;
            int cols = matrix[0].length;

            array = new int[rows + 1][cols + 1];

            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= cols; j++) {
                    array[i][j] = matrix[i - 1][j - 1]
                        + array[i - 1][j]               // bottom left
                        + array[i][j - 1]               // top right
                        - array[i - 1][j - 1];          // top left
                }
            }
        }

        // Time - O(1), Space - O(1)
        public int sumRegion(int row1, int col1, int row2, int col2) {
            if (array == null || array.length == 0 || array[0].length == 0) {
                return 0;
            }

            return array[row2 + 1][col2 + 1]    // bottom right
                - array[row2 + 1][col1]         // left side
                - array[row1][col2 + 1]         // top side
                + array[row1][col1];            // add back intersection
        }
    }
}
