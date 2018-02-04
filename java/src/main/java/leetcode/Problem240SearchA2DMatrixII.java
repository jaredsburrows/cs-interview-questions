package leetcode;

/**
 * https://leetcode.com/problems/search-a-2d-matrix-ii
 */
public final class Problem240SearchA2DMatrixII {
    // Time - O(N), Space - O(1)
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int n = matrix.length;
        int m = matrix[0].length;

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
