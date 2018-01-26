package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/find-all-duplicates-in-an-array
 *
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class Problem442FindAllDuplicatesInAnArray {
    // Time - O(N), Space - O(1)
    public static List<Integer> findDuplicates(int[] nums) {
        final List<Integer> duplicates = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return duplicates;
        }

        for (int i = 0; i < nums.length; i++) {
            final int number = nums[i];
            final int index = Math.abs(number) - 1;

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
