package questions.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Subsets {

    public static <T extends Comparable<? super T>> List<ArrayList<T>> subsets(final List<T> data) {
        if (data == null) {
            return null;
        }

        final List<ArrayList<T>> subsets = new ArrayList<>();

        // Empty Set
        subsets.add(new ArrayList<>());

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

    public static <T> List<ArrayList<T>> subsets(final T[] data) {
        if (data == null) {
            return null;
        }

        final List<ArrayList<T>> subsets = new ArrayList<>();

        // Empty Set
        subsets.add(new ArrayList<>());

        // Order
        Arrays.sort(data);

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
}
