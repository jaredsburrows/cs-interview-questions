package questions;

public final class MergeSort {
    public static int[] mergeSortIndex2(int[] numbers, int low, int high) {
        mergeSortIndex(numbers, low, high);
        return numbers;
    }

    public static void mergeSortIndex(int[] numbers, int left, int right) {
        if (numbers == null) {
            return;
        }

        if (right > left) {
            final int middle = (left + right) / 2;
            mergeSortIndex(numbers, left, middle);
            mergeSortIndex(numbers, middle + 1, right);
            mergeSortIndex(numbers, left, middle + 1, right);
        }
    }

    private static void mergeSortIndex(int[] numbers, int left, int mid, int right) {
        final int[] array = new int[right + left + 1];
        final int leftEnd = mid - 1;
        final int numElements = right - left + 1;
        int index = left;

        while (left <= leftEnd && mid <= right) {
            if (numbers[left] <= numbers[mid]) {
                array[index++] = numbers[left++];
            } else {
                array[index++] = numbers[mid++];
            }
        }

        while (left <= leftEnd) {
            array[index++] = numbers[left++];
        }

        while (mid <= right) {
            array[index++] = numbers[mid++];
        }

        for (int i = 0; i < numElements; i++) {
            numbers[right] = array[right];
            right--;
        }
    }

    public static int[] mergeSortArray2(int[] numbers) {
        mergeSortArray(numbers);
        return numbers;
    }

    public static void mergeSortArray(int[] numbers) {
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

        mergeSortArray(left);
        mergeSortArray(right);
        mergeSortArray(numbers, left, right);
    }

    private static void mergeSortArray(int[] numbers, int[] low, int[] high) {
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
