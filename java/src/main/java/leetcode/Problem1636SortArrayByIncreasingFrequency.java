package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * https://leetcode.com/problems/sort-array-by-increasing-frequency/
 */
public final class Problem1636SortArrayByIncreasingFrequency {
    public int[] frequencySort(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }

        int[] toReturn = new int[nums.length];
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Queue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>(
            (left, right) -> left.getValue().equals(right.getValue()) ? Integer.compare(
                right.getKey(), left.getKey())
                : Integer.compare(left.getValue(), right.getValue()));
        queue.addAll(map.entrySet());

        int index = 0;
        while (!queue.isEmpty()) {
            Map.Entry<Integer, Integer> entry = queue.poll();
            int num = entry.getKey();
            int frequency = entry.getValue();

            for (int i = 0; i < frequency; i++) {
                toReturn[index++] = num;
            }
        }

        return toReturn;
    }

    public int[] frequencySort2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }

        int[] toReturn = new int[nums.length];
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Queue<Integer> queue = new PriorityQueue<>(
            (left, right) -> Objects.equals(map.get(left), map.get(right)) ? Integer.compare(right,
                left)
                : Integer.compare(map.get(left), map.get(right)));
        for (int num : nums) {
            queue.add(num);
        }

        int index = 0;
        while (!queue.isEmpty()) {
            toReturn[index++] = queue.remove();
        }

        return toReturn;
    }
}
