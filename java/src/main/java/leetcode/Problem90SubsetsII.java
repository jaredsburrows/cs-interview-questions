package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * https://leetcode.com/problems/subsets-ii
 */
public final class Problem90SubsetsII {
    // iteration
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<>());

        int startIndex = 0, endIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            startIndex = 0;
            // If the current element is a duplicate, then startIndex is updated to endIndex,
            // so new subsets are only created from the last set of subsets that include the current number.
            if (i > 0 && nums[i] == nums[i - 1]) {
                startIndex = endIndex + 1;
            }
            endIndex = subsets.size() - 1;

            for (int j = startIndex; j <= endIndex; j++) {
                List<Integer> subset = new ArrayList<>(subsets.get(j));
                subset.add(nums[i]);
                subsets.add(subset);
            }
        }

        return subsets;
    }
}
