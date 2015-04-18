package questions.stringarraymatrix;

public class RotateArray {

    // before: 1,2,3,4,5,6, shift: 2
    // after:  5,6,1,2,3,4
    // Time - O(N), Space - O(1)
    public static int[] rotate(final int[] array, int shift) {
        if (array == null || shift < 0) {
            return null;
        }

        // adjust based on shift
        shift %= array.length;

        int shiftLength = array.length - shift;
        int actualLength = array.length - 1;

        // reverse non-shift elements
        ReverseArray.reverse(array, 0, shiftLength - 1);         // 4,3,2,1,|5,6

        // reverse shift elements
        ReverseArray.reverse(array, shiftLength, actualLength);  // 4,3,2,1,|6,5

        // reverse the entire array
        ReverseArray.reverse(array, 0, actualLength);            // 5,6|,1,2,3,4

        return array;
    }
}
