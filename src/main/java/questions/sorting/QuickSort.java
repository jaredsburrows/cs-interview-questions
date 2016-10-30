package questions.sorting;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class QuickSort {

    public static void sortHelper(final int[] array, final int low, final int high) {
        if (array == null || array.length == 0) {
            return;
        }

        if (low >= high) {
            return;
        }

        int left = low;
        int right = high;
        int pivot = array[(low + (high - low)) / 2];

        while (left <= right) {
            while (array[left] < pivot) {
                left++;
            }

            while (array[right] > pivot) {
                right--;
            }

            if (left <= right) {
                final int temp = array[left];
                array[left] = array[right];
                array[right] = temp;

                left++;
                right--;
            }
        }

        if (low < right) {
            sortHelper(array, low, right);
        }

        if (high > left) {
            sortHelper(array, left, high);
        }
    }

    public static int[] sort(final int[] array, final int low, final int high) {
        sortHelper(array, low, high);
        return array;
    }

    public static void swap(final int[] array, final int left, final int right) {
        final int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }

    public static int partition(final int[] array, int low, int high) {
        int pivot = array[low];

        while (low < high) {
            while (array[low] < pivot) {
                low++;
            }

            while (array[high] > pivot) {
                high--;
            }

            swap(array, low, high);
        }

        return low;
    }

    public static void sortHelper2(final int[] array, final int low, final int high) {
        if (array == null || array.length == 0) {
            return;
        }

        if (low >= high) {
            return;
        }

        final int pivot = partition(array, low, high);
        sortHelper2(array, low, pivot);
        sortHelper2(array, pivot + 1, high);
    }

    public static int[] sort2(final int[] array, final int low, final int high) {
        sortHelper(array, low, high);
        return array;
    }
}
