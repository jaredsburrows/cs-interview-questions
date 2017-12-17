package questions.stringarraymatrix;

import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class MergeSortedLists {

    // Time - O(N*M), Space - O(N)
    public static List<Integer> merge(List<List<Integer>> numbers) {

        if (numbers == null) {
            return null;
        }

        if (numbers.isEmpty()) {
            return new ArrayList<>();
        }

        final List<Integer> sortedList = new ArrayList<>();

        for (List<Integer> number : numbers) {
            final List<Integer> mergedList = merge(number, sortedList);

            sortedList.clear();

            sortedList.addAll(mergedList);
        }

        return sortedList;
    }

    // Time - O(N), Space - O(N)
    private static List<Integer> merge(List<Integer> left, List<Integer> right) {

        if (left == null) {
            left = new ArrayList<>();
        }

        if (right == null) {
            right = new ArrayList<>();
        }

        final List<Integer> sortedList = new ArrayList<>();

        int lengthLeft = left.size();
        int lengthRight = right.size();
        int indexLeft = 0;
        int indexRight = 0;

        while (indexLeft < lengthLeft && indexRight < lengthRight) {
            if (left.get(indexLeft) < right.get(indexRight)) {
                sortedList.add(left.get(indexLeft));
                indexLeft++;
            } else {
                sortedList.add(right.get(indexRight));
                indexRight++;
            }
        }

        while (indexLeft < lengthLeft) {
            sortedList.add(left.get(indexLeft));
            indexLeft++;
        }

        while (indexRight < lengthRight) {
            sortedList.add(right.get(indexRight));
            indexRight++;
        }

        return sortedList;
    }
}
