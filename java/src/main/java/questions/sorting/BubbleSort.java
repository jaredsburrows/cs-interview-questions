package questions.sorting;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class BubbleSort {

    public static void sortDescending(final int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 1; j < numbers.length - 1; j++) {
                if (numbers[j - 1] < numbers[j]) {
                    final int temp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }

    public static int[] sortDescending2(final int[] numbers) {
        sortDescending(numbers);
        return numbers;
    }

    public static void sort(final int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    final int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }

    public static int[] sort2(final int[] numbers) {
        sort(numbers);
        return numbers;
    }
}
