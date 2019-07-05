package leetcode;

/**
 * https://leetcode.com/problems/rotate-image/
 */
public final class Problem48RotateImage {
    public void rotate(int[][] image) {
        if (image == null) {
            return;
        }

        // transpose
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = image[i][j];
                image[i][j] = image[j][i];
                image[j][i] = temp;
            }
        }

        // reverse
        for (int[] ints : image) {
            reverse(ints);
        }
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
