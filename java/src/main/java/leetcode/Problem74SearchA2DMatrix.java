package leetcode;

/**
 * https://leetcode.com/problems/search-a-2d-matrix
 *
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class Problem74SearchA2DMatrix {
    // Time - O(N), Space - O(1)
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null) {
            return false;
        }

        // Rows
        int n = matrix.length;
        if (n == 0) {
            return false;
        }

        // Cols
        int m = matrix[0].length;
        if (m == 0) {
            return false;
        }

        int x = 0;
        int y = m - 1;

        while (x < n && y >= 0) {
            // Exact match
            if (matrix[x][y] == target) {
                return true;
            }

            if (matrix[x][y] < target) {
                x++;    // Move left
            } else if (matrix[x][y] > target) {
                y--;    // Move right
            }
        }

        return false;
    }
}
