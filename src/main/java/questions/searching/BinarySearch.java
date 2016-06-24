package questions.searching;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public class BinarySearch {

    // Time - O(LGN), Space - O(1)
    public static int search(final int[] array, final int target) {

        int low = array[0];
        int high = array[array.length - 1];

        while (low <= high) {
            final int mid = low + (high - low) / 2;
            final int current = array[mid];

            if (current == target) {
                return mid;
            } else if (current < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}
