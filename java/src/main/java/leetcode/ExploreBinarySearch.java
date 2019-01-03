package leetcode;

/**
 * https://leetcode.com/explore/learn/card/binary-search/138/background/1038/
 */
public final class ExploreBinarySearch {
    // Time - O(LOG(N)), Space - O(1)
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int current = nums[mid];

            if (current == target) {
                return mid;
            } else if (current < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}
