package leetcode;

/**
 * https://leetcode.com/problems/number-of-islands/description/
 * https://leetcode.com/explore/learn/card/queue-stack/231/practical-application-queue/1374/
 * https://leetcode.com/explore/learn/card/queue-stack/232/practical-application-stack/1380/
 */
public final class Problem200NumberOfIslands {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int rowLength = grid.length;
        int colLength = grid[0].length;
        int count = 0;

        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                if (grid[i][j] == '1') {
                    numIslands(grid, rowLength, colLength, i, j);
                    count++;
                }
            }
        }

        return count;
    }

    private static void numIslands(char[][] grid, int rowLength, int colLength, int x, int y) {
        if (x < 0 || y < 0 || x >= rowLength || y >= colLength || grid[x][y] != '1') {
            return;
        }

        grid[x][y] = '0';

        numIslands(grid, rowLength, colLength, x + 1, y);
        numIslands(grid, rowLength, colLength, x - 1, y);
        numIslands(grid, rowLength, colLength, x, y + 1);
        numIslands(grid, rowLength, colLength, x, y - 1);
    }
}
