package leetcode;

/**
 * https://leetcode.com/problems/longest-increasing-path-in-a-matrix/
 */
public final class Problem329LongestIncreasingPathInAMatrix {
    private final int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    private int[][] memo;

    public int longestIncreasingPath(int[][] matrix) {
        int longestPath = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;
        memo = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int dfs = dfs(matrix, i, j);
                longestPath = Math.max(longestPath, dfs);
            }
        }

        return longestPath;
    }

    private int dfs(int[][] matrix, int row, int col) {
        if (memo[row][col] != 0) {
            return memo[row][col];
        }

        int longestPath = 1;

        for (int[] dir : directions) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];

            if (newRow >= 0 && newRow < matrix.length &&
                newCol >= 0 && newCol < matrix[0].length &&
                matrix[newRow][newCol] > matrix[row][col]) {
                int dfs = dfs(matrix, newRow, newCol) + 1;
                longestPath = Math.max(longestPath, dfs);
            }
        }

        memo[row][col] = longestPath;

        return longestPath;
    }
}
