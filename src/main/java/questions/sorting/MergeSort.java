package questions.sorting;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public class MergeSort {

    public static void mergeSort(final int[] numbers, final int low, final int high) {
        if (numbers == null) {
            return;
        }

        if (high < low) {
            return;
        }

        final int middle = (low + high) / 2;

        mergeSort(numbers, low, middle);
        mergeSort(numbers, middle + 1, high);
        merge(numbers, low, middle, high);
    }

    public static int[] mergeSort2(final int[] numbers, final int low, final int high) {
        mergeSort(numbers, low, high);
        return numbers;
    }

    private static void merge(final int[] numbers, final int low, final int middle, final int high) {
        int[] helper = new int[high - low + 1];

        for (int i = low; i <= high; ++i) {
            helper[i - low] = numbers[i];
        }

        int i = low, j = middle + 1, k = low;

        while (i <= middle && j <= high) {
            if (helper[i - low] < helper[j - low]) {
                numbers[k] = helper[i - low];
                i++;
            } else {
                numbers[k] = helper[j - low];
                j++;
            }
            k++;
        }

        if (i > middle) {
            for (; j <= high; ++j) {
                numbers[k] = helper[j - low];
                k++;
            }
        } else {
            for (; i <= middle; ++i) {
                numbers[k] = helper[i - low];
                k++;
            }
        }
    }

    public static void sort(final int[] numbers) {
        if (numbers == null) {
            return;
        }

        final int length = numbers.length;

        if (length < 2) {
            return;
        }

        final int mid = length / 2;
        final int[] left = new int[mid];
        final int[] right = new int[length - mid];

        System.arraycopy(numbers, 0, left, 0, mid);
        System.arraycopy(numbers, mid, right, 0, length - mid);

        sort(left);
        sort(right);

        merge(numbers, left, right);
    }

    public static int[] sort2(final int[] numbers) {
        sort(numbers);
        return numbers;
    }

    private static void merge(final int[] numbers, final int[] low, final int[] high) {
        final int leftLength = low.length;
        final int rightLength = high.length;
        int indexLeft = 0;
        int indexRight = 0;
        int index = 0;

        // Merge arrays
        while (indexLeft < leftLength && indexRight < rightLength) {
            if (low[indexLeft] <= high[indexRight]) {
                numbers[index] = low[indexLeft];
                indexLeft++;
            } else {
                numbers[index] = high[indexRight];
                indexRight++;
            }
            index++;
        }

        while (indexLeft < leftLength) {
            numbers[index] = low[indexLeft];

            indexLeft++;
            index++;
        }

        while (indexRight < rightLength) {
            numbers[index] = high[indexRight];

            indexRight++;
            index++;
        }
    }
}
