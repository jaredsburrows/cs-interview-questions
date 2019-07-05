package leetcode;

/**
 * https://leetcode.com/problems/unique-paths/
 */
public final class Problem62UniquePaths {
    public int uniquePaths(int m, int n) {
        if (m == 0 || n == 0) {
            return 0;
        }

        if (m == 1 || n == 1) {
            return 1;
        }

        int[][] grid = new int[m][n];

        for (int i = 0; i < m; i++) {
            grid[i][0] = 1;
        }

        for (int i = 0; i < n; i++) {
            grid[0][i] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                grid[i][j] = grid[i - 1][j] + grid[i][j - 1];
            }
        }

        return grid[m - 1][n - 1];
    }
}
