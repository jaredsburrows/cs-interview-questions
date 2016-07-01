package questions.stringarraymatrix;

import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public class MergeSortedLists {

    // Time - O(N*M), Space - O(N)
    public static List<Integer> merge(final List<List<Integer>> numbers) {

        if (numbers == null) {
            return null;
        }

        if (numbers.isEmpty()) {
            return new ArrayList<>();
        }

        final List<Integer> sortedList = new ArrayList<>();

        for (final List<Integer> number : numbers) {
            final List<Integer> mergedList = merge(number, sortedList);

            sortedList.clear();

            sortedList.addAll(mergedList);
        }

        return sortedList;
    }

    // Time - O(N), Space - O(N)
    static List<Integer> merge(List<Integer> left, List<Integer> right) {

        if (left == null) {
            left = new ArrayList<>();
        }

        if (right == null) {
            right = new ArrayList<>();
        }

        final List<Integer> sortedList = new ArrayList<>();

        int lengthLeft = left.size();
        int lengthRight = right.size();
        int i = 0;
        int j = 0;

        while (i < lengthLeft && j < lengthRight) {
            if (left.get(i) < right.get(j)) {
                sortedList.add(left.get(i));
                i++;
            } else {
                sortedList.add(right.get(j));
                j++;
            }
        }

        while (i < lengthLeft) {
            sortedList.add(left.get(i));
            i++;
        }

        while (j < lengthRight) {
            sortedList.add(right.get(j));
            j++;
        }

        return sortedList;
    }
}
