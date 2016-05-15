package questions.searching;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public class BinarySearch {

    // Time - O(LGN)
    public static int search(final int[] array, final int number) {

        int low = array[0];
        int high = array[array.length - 1];

        while (low <= high) {
            final int mid = (low + high) / 2;

            if (array[mid] == number) {
                return mid;
            } else if (array[mid] < number) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}
