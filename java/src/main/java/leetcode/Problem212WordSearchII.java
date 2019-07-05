package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * https://leetcode.com/problems/word-search-ii/
 */
public final class Problem212WordSearchII {
    public List<String> findWords(char[][] board, String[] words) {
        Set<String> foundWords = new HashSet<>();

        if (board == null || words == null) {
            return new ArrayList<>();
        }

        int rowLength = board.length;
        int colLength = board[0].length;
        char[][] copy = new char[rowLength][colLength];

        for (String s : words) {
            resetBoard(board, copy);
            for (int i = 0; i < rowLength; i++) {
                for (int j = 0; j < colLength; j++) {
                    if (canMove(copy, rowLength, colLength, s, i, j, 0)) {
                        foundWords.add(s);
                    }
                }
            }
        }

        return new ArrayList<>(foundWords);
    }

    private void resetBoard(char[][] board, char[][] myInt) {
        for (int i = 0; i < board.length; i++) {
            char[] aMatrix = board[i];
            int aLength = aMatrix.length;
            myInt[i] = new char[aLength];
            System.arraycopy(aMatrix, 0, myInt[i], 0, aLength);
        }
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
