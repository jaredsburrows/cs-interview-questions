package questions.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class Subsets {
    public static <T extends Comparable<? super T>> List<List<T>> subsets(List<T> data) {
        final List<List<T>> subsets = new ArrayList<>();

        if (data == null || data.isEmpty()) {
            return subsets;
        }

        // Empty Set
        subsets.add(new ArrayList<>());

        // Order
        Collections.sort(data); // not needed

        for (T obj : data) {
            final int subsetSize = subsets.size();

            for (int j = 0; j < subsetSize; j++) {
                // Save off original size before we add to 'subsets'
                final List<T> subset = new ArrayList<>(subsets.get(j));

                subset.add(obj);

                subsets.add(subset);
            }
        }

        return subsets;
    }

    public static <T> List<List<T>> subsets2(T[] data) {
        final List<List<T>> subsets = new ArrayList<>();

        if (data == null || data.length == 0) {
            return subsets;
        }

        // Empty Set
        subsets.add(new ArrayList<>());

        // Order
        Arrays.sort(data); // not needed

        for (T obj : data) {
            // Save off original size before we add to 'subsets'
            final int subsetSize = subsets.size();

            for (int j = 0; j < subsetSize; j++) {
                final List<T> subset = new ArrayList<>(subsets.get(j));
                subset.add(obj);

                subsets.add(subset);
            }
        }

        return subsets;
    }
}
