package questions.sorting;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public class QuickSort {

    public static void sort(final int[] numbers, final int low, final int high) {
        if (numbers == null || numbers.length == 0) {
            return;
        }

        if (low >= high) {
            return;
        }

        int i = low;
        int j = high;
        int pivot = numbers[(low + (high - low)) / 2];

        while (i <= j) {
            while (numbers[i] < pivot) {
                i++;
            }

            while (numbers[j] > pivot) {
                j--;
            }

            if (i <= j) {
                final int temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;

                i++;
                j--;
            }
        }

        if (low < j) {
            sort(numbers, low, j);
        }

        if (high > i) {
            sort(numbers, i, high);
        }
    }

    public static int[] sort2(final int[] numbers, final int left, final int right) {
        sort(numbers, left, right);
        return numbers;
    }
}
