package questions.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public class Subsets {

    public static <T extends Comparable<? super T>> List<ArrayList<T>> subsets(final List<T> data) {
        if (data == null) {
            return null;
        }

        final List<ArrayList<T>> subsets = new ArrayList<>();

        // Empty Set
        subsets.add(new ArrayList<T>());

        // Order
        Collections.sort(data);

        for (final T obj : data) {
            final int subsetSize = subsets.size();

            for (int j = 0; j < subsetSize; j++) {

                final ArrayList<T> temp = new ArrayList<>(subsets.get(j));

                temp.add(obj);

                subsets.add(temp);
            }
        }

        return subsets;
    }

    public static <T> List<List<T>> subsets2(final T[] data) {
        if (data == null) {
            return null;
        }

        final List<List<T>> subsets = new ArrayList<>();

        // Empty Set
        subsets.add(new ArrayList<T>());

        // Order
        Arrays.sort(data);

        for (final T obj : data) {
            final int subsetSize = subsets.size();

            for (int j = 0; j < subsetSize; j++) {

                final List<T> temp = new ArrayList<>(subsets.get(j));

                temp.add(obj);

                subsets.add(temp);
            }
        }

        return subsets;
    }
}
