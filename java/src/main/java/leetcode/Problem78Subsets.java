package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/subsets/description
 *
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class Problem78Subsets {
    public static List<List<Integer>> subsets(int[] nums) {
        final List<List<Integer>> subsets = new ArrayList<>();

        if (nums == null || nums.length == 0) {
            return subsets;
        }

        // Empty subset
        subsets.add(new ArrayList<>());

        for (int number : nums) {
            final int subsetSize = subsets.size();

            for (int i = 0; i < subsetSize; i++) {
                final List<Integer> subset = new ArrayList<>(subsets.get(i));
                subset.add(number);

                subsets.add(subset);
            }
        }

        return subsets;
    }
}
