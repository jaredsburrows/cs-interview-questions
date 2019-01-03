package questions;

public final class AGMonochrome {
    // summation black/white monochrome -> summation
    public void Monochrome(int[][] array) {
        if (array == null || array.length == 0 || array[0].length == 0) {
            return;
        }

        int rows = array.length;
        int cols = array[0].length;

        for (int i = 1; i < rows; i++) {
            array[i][0] = array[i - 1][0] + array[i][0];
        }

        for (int i = 1; i < cols; i++) {
            array[0][i] = array[0][i - 1] + array[0][i];
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                array[i][j] =  array[i - 1][j] + array[i][j - 1] + array[i][j] - array[i - 1][j - 1];
            }
        }
    }
}
