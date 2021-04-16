package leetcode;

/**
 * https://leetcode.com/problems/maximum-ascending-subarray-sum/submissions/
 */
public final class Problem1800MaximumAscendingSubarraySum {
    public int maxAscendingSum(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int max = nums[0];
        int temp = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int currentNumber = nums[i];
            if (currentNumber <= nums[i - 1]) {
                temp = currentNumber;
            } else {
                temp += currentNumber;
            }
            max = Math.max(max, temp);
        }

        return max;
    }
}
