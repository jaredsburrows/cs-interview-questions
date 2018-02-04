package leetcode;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * https://leetcode.com/problems/kth-largest-element-in-an-array/description
 */
public final class Problem215KthLargestElementInAnArray {
    // Time - O(N), Space - O(N)
    public int findKthLargest(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 0) {
            return -1;
        }

        final Queue<Integer> queue = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for (int num : nums) {
            queue.add(num);
        }

        int count = 0;
        int number = 0;
        while (count < k) {
            number = queue.poll();
            count++;
        }

        return number;
    }
}
