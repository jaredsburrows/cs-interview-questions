package questions;

public final class QuickSort {
    public static void sortHelper(int[] array, int low, int high) {
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
                swap(array, left, right);

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

    public static int[] sort(int[] array, int low, int high) {
        sortHelper(array, low, high);
        return array;
    }

    private static void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }

    public static int partition(int[] array, int low, int high) {
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

    public static void sortHelper2(int[] array, int low, int high) {
        if (array == null || array.length == 0) {
            return;
        }

        if (low >= high) {
            return;
        }

        int pivot = partition(array, low, high);
        sortHelper2(array, low, pivot);
        sortHelper2(array, pivot + 1, high);
    }

    public static int[] sort2(int[] array, int low, int high) {
        sortHelper(array, low, high);
        return array;
    }
}
