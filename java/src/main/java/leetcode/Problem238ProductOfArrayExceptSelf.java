package leetcode;

/**
 * https://leetcode.com/problems/product-of-array-except-self
 */
public final class Problem238ProductOfArrayExceptSelf {
    // Time - O(1), Space - (1)
    public int[] productExceptSelf(int[] nums) {
        if (nums == null) {
            return new int[0];
        }

        int product = 1;
        for (int num : nums) {
            product *= num;
        }

        for (int i = 1; i < nums.length; i++) {

        }

        return nums;
    }
}
