package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * https://leetcode.com/problems/top-k-frequent-elements
 */
public final class Problem347TopKFrequentElements {
    public List<Integer> topKFrequent(int[] nums, int k) {
        final List<Integer> numbers = new ArrayList<>();
        if (nums == null || nums.length == 0 || k < 0) {
            return numbers;
        }

        final Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        final Queue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>(
            (left, right) -> right.getValue() - left.getValue());
        queue.addAll(map.entrySet());

        while (numbers.size() < k) {
            numbers.add(queue.poll().getKey());
        }

        return numbers;
    }
}
