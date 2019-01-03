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
            swap(array, start, end);

            start++;
            end--;
        }

        return array;
    }

    private static void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
