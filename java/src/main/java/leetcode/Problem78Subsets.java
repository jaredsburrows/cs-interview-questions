package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * https://leetcode.com/problems/subsets/description/
 */
public final class Problem78Subsets {
    // recursion
    public List<List<Integer>> subsets(int[] nums) {
        final List<List<Integer>> subsets = new ArrayList<>();

        if (nums == null || nums.length == 0) {
            return subsets;
        }

        Arrays.sort(nums);

        subsets(subsets, new ArrayList<>(), nums, 0);

        return subsets;
    }

    // backtrack
    private void subsets(List<List<Integer>> subsets, List<Integer> subset, int[] nums, int start) {
        subsets.add(new ArrayList<>(subset));

        for (int i = start; i < nums.length; i++) {
            subset.add(nums[i]);
            subsets(subsets, subset, nums, i + 1);
            subset.remove(subset.size() - 1);
        }
    }

    // iteration
    public <T extends Comparable<? super T>> List<List<T>> subsets2(List<T> data) {
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

    public <T> List<List<T>> subsets3(T[] data) {
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
