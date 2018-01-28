package questions;

public final class Partition {
    public static void swap(int[] array, int left, int right) {
        final int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }

    public static void part(int[] array, int pivotIndex) {
        if (array == null || array.length == 0) {
            return;
        }

        if (pivotIndex < 0) {
            return;
        }

        int low = 0;
        int high = array.length - 1;
        int pivot = array[pivotIndex];

        while (low < high) {
            while (array[low] < pivot) {
                low++;
            }

            while (array[high] > pivot) {
                high--;
            }

            swap(array, low, high);
        }
    }

    public static void part(int[] array) {
        part(array, 0);
    }

    public static int[] partition(int[] array, int pivotIndex) {
        part(array, pivotIndex);
        return array;
    }

    public static int[] partition(int[] array) {
        partition(array, 0);
        return array;
    }
}
