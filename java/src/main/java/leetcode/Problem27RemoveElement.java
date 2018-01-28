package leetcode;

/**
 * https://leetcode.com/problems/remove-element/description
 */
public final class Problem27RemoveElement {
    // Time - O(N), Space - O(1)
    public static int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count++] = nums[i];
            }
        }

        return count;
    }
}
