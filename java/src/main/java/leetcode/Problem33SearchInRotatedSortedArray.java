package leetcode;

/**
 * https://leetcode.com/problems/search-in-rotated-sorted-array
 */
public final class Problem33SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0 || target < 0) {
            return -1;
        }

        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        int rot = low;
        low = 0;
        high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int realMid = (mid + rot) % nums.length;
            if (nums[realMid] == target) {
                return realMid;
            } else if (nums[realMid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}
