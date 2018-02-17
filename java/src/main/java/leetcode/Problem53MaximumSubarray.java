package leetcode;

/**
 * https://leetcode.com/problems/maximum-subarray
 */
public final class Problem53MaximumSubarray {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int max = nums[0];
        int temp = nums[0];

        for (int i = 1; i < nums.length; i++) {
            final int currentNumber = nums[i];
            temp = Math.max(temp + currentNumber, currentNumber);
            max = Math.max(max, temp);
        }

        return max;
    }
}
