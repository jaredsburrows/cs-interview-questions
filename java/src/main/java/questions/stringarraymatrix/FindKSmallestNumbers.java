package questions.stringarraymatrix;

import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class FindKSmallestNumbers {

    /**
     * Return smallest K numbers from N sorted list of M sorted integers.
     */
    // Time - O(N*M)
    public static List<Integer> getSmallestNumbers(final List<List<Integer>> numbers, final int target) {

        final List<Integer> toReturn = new ArrayList<>(target);
        final int length = numbers.size() - 1;
        final int[] indexes = new int[length];
        int min = numbers.get(0).get(0);

        // O(N)
        for (int i = 0; i < target; i++) {
            // O(M)
            for (int j = 0; j < length; j++) {
                // O(1)
                final List<Integer> currentList = numbers.get(j);
                final int currentIndex = indexes[j];
                final int currentInteger = currentList.get(currentIndex);
                if (currentInteger < min) {
                    min = currentInteger;
                    indexes[j] = indexes[j] + 1;
                }
            }

            toReturn.add(min);
        }

        return toReturn;
    }
}
