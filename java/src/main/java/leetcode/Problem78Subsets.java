package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * https://leetcode.com/problems/subsets
 */
public final class Problem78Subsets {
    // iteration
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();

        subsets.add(new ArrayList<>());

        for (int num : nums) {
            List<List<Integer>> temp = new ArrayList<>();

            for (List<Integer> array : subsets) {
                List<Integer> subset = new ArrayList<>(array);
                subset.add(num);

                temp.add(subset);
            }
            subsets.addAll(temp);
        }

        return subsets;
    }

    // iteration
    public <T extends Comparable<? super T>> List<List<T>> subsetsLists(List<T> nums) {
        List<List<T>> subsets = new ArrayList<>();

        if (nums == null || nums.isEmpty()) {
            return subsets;
        }

        // Empty Set
        subsets.add(new ArrayList<>());

        // Order
        Collections.sort(nums); // not needed

        for (T obj : nums) {
            int subsetSize = subsets.size();

            for (int j = 0; j < subsetSize; j++) {
                // Save off original size before we add to 'subsets'
                List<T> subset = new ArrayList<>(subsets.get(j));

                subset.add(obj);

                subsets.add(subset);
            }
        }

        return subsets;
    }

    // iteration
    public <T extends Comparable<? super T>> List<List<T>> subsetsArray(T[] nums) {
        List<List<T>> subsets = new ArrayList<>();

        if (nums == null || nums.length == 0) {
            return subsets;
        }

        // Empty Set
        subsets.add(new ArrayList<>());

        // Order
        Arrays.sort(nums); // not needed

        for (T obj : nums) {
            // Save off original size before we add to 'subsets'
            int subsetSize = subsets.size();

            for (int j = 0; j < subsetSize; j++) {
                List<T> subset = new ArrayList<>(subsets.get(j));
                subset.add(obj);

                subsets.add(subset);
            }
        }

        return subsets;
    }

    // recursion
    public List<List<Integer>> subsetsRecursion(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();

        if (nums == null || nums.length == 0) {
            return subsets;
        }

        subsetRecursion(subsets, new ArrayList<>(), nums, 0);

        return subsets;
    }

    // backtrack
    private static void subsetRecursion(List<List<Integer>> subsets, List<Integer> subset, int[] nums, int start) {
        subsets.add(new ArrayList<>(subset));

        for (int i = start; i < nums.length; i++) {
            subset.add(nums[i]);
            subsetRecursion(subsets, subset, nums, i + 1);
            subset.remove(subset.size() - 1);
        }
    }
}
