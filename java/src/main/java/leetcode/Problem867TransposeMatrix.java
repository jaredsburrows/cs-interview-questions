package leetcode;

/**
 * https://leetcode.com/problems/transpose-matrix/
 */
public final class Problem867TransposeMatrix {
    public int[][] transpose(int[][] A) {
        if (A == null || A.length == 0 || A[0].length == 0) {
            return new int[0][];
        }

        int[][] matrix = new int[A[0].length][A.length];

        for (int i = 0; i < A[0].length; i++) {
            for (int j = 0; j < A.length; j++) {
                matrix[i][j] = A[j][i];
            }
        }

        return matrix;
    }
}
