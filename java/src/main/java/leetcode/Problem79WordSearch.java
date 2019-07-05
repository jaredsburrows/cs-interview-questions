package leetcode;

/**
 * https://leetcode.com/problems/word-search/
 */
public final class Problem79WordSearch {
    public boolean exist(char[][] board, String word) {
        if (board == null || word == null) {
            return false;
        }

        int rowLength = board.length;
        int colLength = board[0].length;

        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                if (canMove(board, rowLength, colLength, word, i, j, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean canMove(char[][] board, int rowLength, int colLength, String word, int x, int y,
        int index) {
        if (x < 0 || y < 0 || x >= rowLength || y >= colLength) {
            return false;
        }

        if (board[x][y] == word.charAt(index)) {
            char temp = board[x][y];
            board[x][y] = '#';

            if (index == word.length() - 1) {
                return true;
            } else if (canMove(board, rowLength, colLength, word, x - 1, y, index + 1)
                || canMove(board, rowLength, colLength, word, x + 1, y, index + 1)
                || canMove(board, rowLength, colLength, word, x, y - 1, index + 1)
                || canMove(board, rowLength, colLength, word, x, y + 1, index + 1)) {
                return true;
            }

            board[x][y] = temp;
        }

        return false;
    }
}
