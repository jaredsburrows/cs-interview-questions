package questions.sorting;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class Partition {

    public static void swap(final int[] array, final int left, final int right) {
        final int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }

    public static void part(final int[] array, final int pivotIndex) {
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

    public static void part(final int[] array) {
        part(array, 0);
    }

    public static int[] partition(final int[] array, final int pivotIndex) {
        part(array, pivotIndex);
        return array;
    }

    public static int[] partition(final int[] array) {
        partition(array, 0);
        return array;
    }
}
