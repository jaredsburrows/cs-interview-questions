package questions.stringarraymatrix;

public class RotateArray {

    // Time O(N) - Space O(1)
    public static int[] rotate(final int[] array, int shift) {
        if (array == null || shift < 0) {
            return null;
        }

        // adjust based on shift
        shift %= array.length;

        int length = array.length - shift;

        // reverse non-shift elements
        reverse(array, 0, length - 1);

        // reverse shift elements
        reverse(array, length, array.length - 1);

        // reverse the entire array
        reverse(array, 0, array.length - 1);

        return array;
    }

    // Time O(N) - Space O(1)
    private static void reverse(int[] array, int start, int end) {
        if (array == null || array.length < 2) {
            return;
        }

        while (start < end) {
            int tmp = array[start];
            array[start] = array[end];
            array[end] = tmp;

            start++;
            end--;
        }
    }
}
