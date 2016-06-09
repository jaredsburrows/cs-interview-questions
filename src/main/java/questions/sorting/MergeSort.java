package questions.sorting;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public class MergeSort {

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

    private static void merge(final int[] numbers, final int[] left, final int[] right) {
        final int leftLength = left.length;
        final int rightLength = right.length;
        int indexLeft = 0;
        int indexRight = 0;
        int index = 0;

        // Merge arrays
        while (indexLeft < leftLength && indexRight < rightLength) {
            if (left[indexLeft] <= right[indexRight]) {
                numbers[index] = left[indexLeft];
                indexLeft++;
            } else {
                numbers[index] = right[indexRight];
                indexRight++;
            }
            index++;
        }

        while (indexLeft < leftLength) {
            numbers[index] = left[indexLeft];

            indexLeft++;
            index++;
        }

        while (indexRight < rightLength) {
            numbers[index] = right[indexRight];

            indexRight++;
            index++;
        }
    }
}
