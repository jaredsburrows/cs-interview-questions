package leetcode;

/**
 * https://leetcode.com/problems/max-consecutive-ones
 * https://leetcode.com/explore/learn/card/array-and-string/205/array-two-pointer-technique/1301/
 */
public final class Problem485MaxConsecutiveOnes {
    // Time - O(N), Space - O(1)
    public int findMaxConsecutiveOnes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int count = 0;
        int maxCount = -1;

        for (int number : nums) {
            count = number == 1 ? count + 1 : 0;

            maxCount = Math.max(count, maxCount);
        }

        return maxCount;
    }
}
