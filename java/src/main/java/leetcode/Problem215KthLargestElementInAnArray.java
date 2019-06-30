package leetcode;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * https://leetcode.com/problems/kth-largest-element-in-an-array
 */
public final class Problem215KthLargestElementInAnArray {
    // Time - O(N), Space - O(N)
    public int findKthLargest(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 0) {
            return -1;
        }

        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : nums) {
            queue.add(num);
        }

        int count = 0;
        Integer number = 0;
        while (count < k) {
            number = queue.poll();
            count++;
        }

        return number == null ? 0 : number;
    }
}
