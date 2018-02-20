package leetcode;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii
 */
public final class Problem80RemoveDuplicatesFromSortedArrayII {
    // Time - O(N), Space - O(1)
    public int removeDuplicates(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (count < 2 || num > nums[count - 2]) {
                nums[count++] = num;
            }
        }

        return count;
    }
}
