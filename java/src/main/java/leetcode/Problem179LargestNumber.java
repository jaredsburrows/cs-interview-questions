package leetcode;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * https://leetcode.com/problems/largest-number
 */
public final class Problem179LargestNumber {
    public String largestNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return "";
        }

        final Queue<String> queue = new PriorityQueue<>(nums.length,
            (left, right) -> Long.valueOf(right + left).compareTo(Long.valueOf(left + right))
        );

        for (int num : nums) {
            queue.offer(String.valueOf(num));
        }

        final StringBuilder stringBuilder = new StringBuilder(nums.length);
        while (!queue.isEmpty()) {
            stringBuilder.append(queue.poll());
        }

        final String result = stringBuilder.toString();
        return result.startsWith("0") ? "0" : result;
    }
}
