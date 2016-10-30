package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution.
 * https://leetcode.com/problems/two-sum/
 *
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class TwoSum {

    // Time - O(N^2), Space - O(1)
    public static int[] twoSum(final int[] nums, final int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};
    }

    // Time - O(N), Space - O(N)
    public static int[] twoSum2(final int[] nums, final int target) {

        final Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            final int difference = target - nums[i];
            final Integer value = map.get(difference);

            if (map.containsKey(difference) && value != null && value != i) {
                return new int[]{i, value};
            }
        }

        return new int[]{};
    }

    // Time - O(N), Space - O(N)
    public static int[] twoSum3(final int[] nums, final int target) {

        final Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            final int key = nums[i];
            final int difference = target - key;

            if (map.containsKey(difference)) {
                final int value = map.get(difference);
                return new int[]{value, i};
            }
            map.put(key, i);
        }

        return new int[]{};
    }
}
