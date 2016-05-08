package questions.searching;

/**
 * Search an element in an array where difference between adjacent elements is 1.
 *
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public class SearchAdjacentElements {

    // Time - O(N), Space - O(1)
    public static int search(final int array[], final int number) {
        final int length = array.length - 1;

        for (int i = 0; i < length; i++) {
            if (array[i] == number) {
                return i;
            }
        }

        return -1;
    }

    // Time - O(N), Space - O(1)
    // By moving the "index", there will be less iterations
    public static int search2(final int array[], final int number) {
        final int length = array.length - 1;

        int i = 0;
        while (i < length) {
            if (array[i] == number) {
                return i;
            }

            i = i + Math.abs(array[i] - number);
        }

        return -1;
    }
}
