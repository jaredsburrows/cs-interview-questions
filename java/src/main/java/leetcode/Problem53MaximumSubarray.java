package leetcode;

/**
 * https://leetcode.com/problems/maximum-subarray
 */
public final class Problem53MaximumSubarray {
    // Time - O(N), Space - O(1)
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            // Handle null or empty input gracefully
            return 0;
        }

        // Initialize max and currentSum to the first element
        int max = nums[0];
        int currentSum = nums[0];

        // Loop through the array from the second element
        for (int i = 1; i < nums.length; i++) {
            // Decide whether to extend the current subarray or start fresh
            currentSum = Math.max(currentSum + nums[i], nums[i]);

            // Update the maximum subarray sum
            max = Math.max(max, currentSum);
        }

        return max; // Return the largest subarray sum
    }

    // Leet code - less variables for, no libraries
    public int maxSubArray2(int[] nums) {
        int max = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = (currentSum > 0) ? currentSum + nums[i] : nums[i];

            if (currentSum > max) {
                max = currentSum;
            }
        }

        return max;
    }
}
