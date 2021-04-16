package leetcode;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * https://leetcode.com/problems/third-maximum-number/
 */
public final class Problem414ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        Queue<Integer> queue = new PriorityQueue<>();
        for (int num : nums) {
            if (!queue.contains(num)) {
                queue.add(num);
                if (queue.size() > 3) {
                    queue.poll();
                }
            }
        }

        while (queue.size() == 2) {
            queue.poll();
        }

        Integer toReturn = queue.peek();
        return toReturn != null ? toReturn : 0;
    }
}
