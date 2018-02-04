package leetcode;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/description
 */
public final class Problem26RemoveDuplicatesFromSortedArray {
    // Time - O(N), Space - O(1)
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) {
                nums[count++] = nums[i];
            }
        }

        return count;
    }
}
