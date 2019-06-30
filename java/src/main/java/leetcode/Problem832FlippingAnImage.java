package leetcode;

/**
 * https://leetcode.com/problems/flipping-an-image/
 */
public final class Problem832FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] A) {
        if (A == null || A.length == 0) {
            return new int[0][0];
        }

        int rows = A.length;
        int cols = A[0].length;

        for (int[] ints : A) {
            reverse(ints);
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                A[i][j] = A[i][j] == 0 ? 1: 0;
            }
        }

        return A;
    }

    private static void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i ++) {
            swap(array, i, array.length - i - 1);
        }
    }

    private static void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
