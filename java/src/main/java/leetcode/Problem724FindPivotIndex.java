package leetcode;

/**
 * https://leetcode.com/problems/find-pivot-index
 */
public final class Problem724FindPivotIndex {
    public int pivotIndex(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int sum = 0;
        int left = 0;

        for (int num : nums) {
            sum += num;
        }

        for (int i = 0; i < nums.length; i++) {
            if (i != 0) {
                left += nums[i - 1];
            }

            if (sum - left - nums[i] == left) {
                return i;
            }
        }

        return -1;
    }
}
