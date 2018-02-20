package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * https://leetcode.com/problems/top-k-frequent-words
 */
public final class Problem692TopKFrequentWords {
    public List<String> topKFrequent(String[] words, int k) {
        final List<String> strings = new ArrayList<>();
        if (words == null || words.length == 0 || k < 0) {
            return strings;
        }

        final Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        final Queue<Map.Entry<String, Integer>> queue = new PriorityQueue<>(
            (left, right) -> {
                final int value = Integer.compare(right.getValue(), left.getValue());
                return value == 0 ? left.getKey().compareTo(right.getKey()) : value;
            });
        queue.addAll(map.entrySet());

        int count = 0;
        while (count < k) {
            final Map.Entry<String, Integer> entry = queue.poll();
            strings.add(entry.getKey());
            count++;
        }

        return strings;
    }
}
