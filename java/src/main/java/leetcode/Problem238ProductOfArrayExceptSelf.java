package leetcode;

/**
 * https://leetcode.com/problems/product-of-array-except-self
 */
public final class Problem238ProductOfArrayExceptSelf {
    // Input:  [1,2,3,4]
    // 1 - a[0] = 2 * 3 * 4 = 24
    // 2 - a[1] = 1 * 3 * 4 = 12
    // 3 - a[2] = 1 * 2 * 4 = 8
    // 4 - a[3] = 1 * 2 * 3 = 6
    // Output: [24,12,8,6]
    // Time - O(1), Space - (1)
    public int[] productExceptSelf(int[] nums) {
        if (nums == null) {
            return new int[0];
        }

        int[] array = new int[nums.length];
        int left = 1;
        int right = 1;

        for (int i = 0; i < nums.length; i++) {
            array[i] = 1;
        }

        for (int i = 1; i < nums.length; i++) {

        }

        for (int i = 1; i < nums.length; i++) {

        }

        return array;
    }
}
