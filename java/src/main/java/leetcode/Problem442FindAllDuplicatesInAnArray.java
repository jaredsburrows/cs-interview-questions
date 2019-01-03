package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/find-all-duplicates-in-an-array
 */
public final class Problem442FindAllDuplicatesInAnArray {
    // Time - O(N), Space - O(N)
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return duplicates;
        }

        for (int i = 0; i < nums.length; i++) {
            int number = nums[i];
            int index = Math.abs(number) - 1;

            // Mark all integers as negative
            nums[index] = -nums[index];

            // Add duplicates that are not negative
            if (nums[index] > 0) {
                duplicates.add(Math.abs(number));
            }
        }

        return duplicates;
    }
}
