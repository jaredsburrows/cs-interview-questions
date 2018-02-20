package leetcode;

/**
 * https://leetcode.com/problems/find-minimum-in-rotated-sorted-array
 * https://leetcode.com/explore/learn/card/binary-search/126/template-ii/949/
 */
public final class Problem153FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            final int mid = low + (high - low) / 2;
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        int rot = low;
        int min = nums[rot];
        low = 0;
        high = nums.length - 1;

        while (low <= high) {
            final int mid = low + (high - low) / 2;
            final int realMid = (mid + rot) % nums.length;
            if (nums[realMid] < min) {
                min = Math.min(min, nums[realMid]);
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return min;
    }
}
