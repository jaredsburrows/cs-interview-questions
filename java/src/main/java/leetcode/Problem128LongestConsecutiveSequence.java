package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/longest-consecutive-sequence/
 */
public final class Problem128LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int length = 0;
        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int current = num;
                while (set.contains(current)) {
                    current++;
                }

                int currentLength = current - num;
                if (currentLength > length) {
                    length = currentLength;
                }
                length = Math.max(length, current - num);
            }
        }

        return length;
    }
}
