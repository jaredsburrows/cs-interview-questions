package leetcode;

/**
 * https://leetcode.com/problems/max-consecutive-ones
 */
public final class Problem485MaxConsecutiveOnes {
    // Time - O(N), Space - O(1)
    public static int findMaxConsecutiveOnes(int[] nums) {
        if (nums == null) {
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
