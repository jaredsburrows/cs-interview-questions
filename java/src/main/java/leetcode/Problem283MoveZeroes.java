package leetcode;

/**
 * https://leetcode.com/problems/move-zeroes
 */
public final class Problem283MoveZeroes {
    public void moveZeroes(int[] nums) {
        if (nums == null) {
            return;
        }

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[count++] = nums[i];
            }
        }

        for (int i = count; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
