package leetcode;

/**
 * https://leetcode.com/problems/rotate-array/description
 */
public final class Problem189RotateArray {
    public static void rotate(int[] nums, int k) {
        if (nums == null || k < 0) {
            return;
        }

        if (k > nums.length) {
            k %= nums.length;
        }

        final int[] result = new int[nums.length];
        int j = 0;
        for (int i = k; i < nums.length; i++) {
            result[i] = nums[j++];
        }

        for (int i = 0; i < k; i++) {
            result[i] = nums[nums.length - k + i];
        }

        System.arraycopy(result, 0, nums, 0, nums.length);
    }
}
