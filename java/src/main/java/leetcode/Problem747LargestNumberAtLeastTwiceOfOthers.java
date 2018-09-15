package leetcode;

/**
 * https://leetcode.com/problems/largest-number-at-least-twice-of-others
 */
public final class Problem747LargestNumberAtLeastTwiceOfOthers {
    public int dominantIndex(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        if (nums.length == 1) {
            return 0;
        }

        int max = nums[0];
        int maxIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }

        boolean big = true;
        for (int num : nums) {
            if ((num + num > max) && (num != max)) {
                big = false;
                break;
            }
        }

        return big ? maxIndex : -1;
    }
}
