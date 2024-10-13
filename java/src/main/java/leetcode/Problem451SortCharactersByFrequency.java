package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * https://leetcode.com/problems/sort-characters-by-frequency/
 */
public final class Problem451SortCharactersByFrequency {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        Queue<Map.Entry<Character, Integer>> queue = new PriorityQueue<>(
            (left, right) -> Integer.compare(right.getValue(), left.getValue()));
        queue.addAll(map.entrySet());

        StringBuilder stringBuilder = new StringBuilder(s.length());
        while (!queue.isEmpty()) {
            Map.Entry<Character, Integer> entry = queue.poll();
            char c = entry.getKey();
            int count = entry.getValue();

            stringBuilder.append(String.valueOf(c).repeat(Math.max(0, count)));
        }

        return stringBuilder.toString();
    }
}
