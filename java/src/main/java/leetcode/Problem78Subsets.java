package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/subsets/description
 *
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class Problem78Subsets {
    // recursion
    public static List<List<Integer>> subsets(int[] nums) {
        final List<List<Integer>> subsets = new ArrayList<>();

        if (nums == null || nums.length == 0) {
            return subsets;
        }

        Arrays.sort(nums);

        subsets(subsets, new ArrayList<>(), nums, 0);

        return subsets;
    }

    // backtrack
    private static void subsets(List<List<Integer>> subsets, List<Integer> subset, int[] nums, int start) {
        subsets.add(new ArrayList<>(subset));

        for (int i = start; i < nums.length; i++) {
            subset.add(nums[i]);
            subsets(subsets, subset, nums, i + 1);
            subset.remove(subset.size() - 1);
        }
    }

    // iteration
    public static List<List<Integer>> subsets2(int[] nums) {
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
