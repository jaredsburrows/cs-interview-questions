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

        final int length = array.length - 1;
        final int shiftLength = length - shift;

        // Reverse non-shift elements
        ReverseArray.reverse(array, 0, shiftLength);            // 4,3,2,1,|5,6

        // Reverse shift elements
        ReverseArray.reverse(array, shiftLength + 1, length);   // 4,3,2,1,|6,5

        // Reverse the entire array
        ReverseArray.reverse(array, 0, length);                 // 5,6|,1,2,3,4

        return array;
    }
}
