package leetcode;

/**
 * https://leetcode.com/problems/longest-increasing-path-in-a-matrix/
 */
public final class Problem1219PathWithMaximumGold {
    private final int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public int getMaximumGold(int[][] grid) {
        int maxGold = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] != 0) {
                    int dfs = dfs(grid, i, j);
                    maxGold = Math.max(maxGold, dfs);
                }
            }
        }

        return maxGold;
    }

    private int dfs(int[][] grid, int row, int col) {
        int goldCollected = grid[row][col];
        grid[row][col] = 0;

        int maxGold = 0;

        for (int[] dir : directions) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];

            if (newRow >= 0 && newRow < grid.length &&
                newCol >= 0 && newCol < grid[0].length &&
                grid[newRow][newCol] > 0) {
                int dfs = dfs(grid, newRow, newCol);
                maxGold = Math.max(maxGold, dfs);
            }
        }

        grid[row][col] = goldCollected;
        return goldCollected + maxGold;
    }
}
