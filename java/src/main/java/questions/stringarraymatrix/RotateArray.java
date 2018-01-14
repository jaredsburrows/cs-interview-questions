package questions.stringarraymatrix;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class RotateArray {
    // Start: 1,2,3,4,5,6, shift: 2
    // After:  5,6,1,2,3,4
    // Time - O(N), Space - O(1)
    public static int[] rotate(int[] array, int shift) {
        if (array == null || shift < 0) {
            return null;
        }

        // Adjust based on shift
        shift %= array.length;

        if (shift > array.length) {
            shift %= array.length;
        }

        final int[] result = new int[array.length];
        int j = 0;
        for (int i = shift; i < array.length; i++) {
            result[i] = array[j++];
        }

        System.arraycopy(array, array.length - shift, result, 0, shift);

        System.arraycopy(result, 0, array, 0, array.length);
        return array;
    }
}
