package leetcode;

/**
 * https://leetcode.com/problems/max-consecutive-ones
 *
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
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
            if (number == 1) {
                count++;
            } else {
                count = 0;
            }

            if (count > maxCount) {
                maxCount = count;
            }
        }

        return maxCount;
    }
}
