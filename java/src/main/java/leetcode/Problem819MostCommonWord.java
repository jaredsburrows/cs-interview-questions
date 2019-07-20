package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * https://leetcode.com/problems/most-common-word/
 */
public final class Problem819MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {
        if (paragraph == null || paragraph.isEmpty()) {
            return "";
        }

        String[] sentence = paragraph.split("\\W+", -1);
        Map<String, Integer> map = new HashMap<>(sentence.length);
        Queue<Map.Entry<String, Integer>> queue = new PriorityQueue<>(
            (left, right) -> Integer.compare(right.getValue(), left.getValue()));

        for (String word : sentence) {
            String key = word.toLowerCase();
            if (key.isEmpty()) {
                continue;
            }

            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        for (String word : banned) {
            String key = word.toLowerCase();
            if (key.isEmpty()) {
                continue;
            }

            map.put(key, -1);
        }

        queue.addAll(map.entrySet());

        Map.Entry<String, Integer> entry = queue.poll();
        if (entry != null) {
            return entry.getKey() != null ? entry.getKey() : "";
        } else {
            return "";
        }
    }
}
