package questions;

public final class ReverseArray {
    // Time - O(N), Space - O(1)
    public static int[] reverse(int[] array, int start, int end) {
        if (array == null) {
            return new int[0];
        }

        if (array.length < 2) {
            return array;
        }

        while (start < end) {
            final int tmp = array[start];
            array[start] = array[end];
            array[end] = tmp;

            start++;
            end--;
        }

        return array;
    }
}
