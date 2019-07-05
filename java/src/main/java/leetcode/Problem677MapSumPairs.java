package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/map-sum-pairs
 * https://leetcode.com/explore/learn/card/trie/148/practical-application-i/1058/
 */
public final class Problem677MapSumPairs {
    // Time - O(N), Space - O(N)
    public static class MapSum {
        private final Map<String, Integer> map = new HashMap<>();

        public void insert(String key, int val) {
            map.put(key, val);
        }

        public int sum(String prefix) {
            int sum = 0;
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getKey().startsWith(prefix)) {
                    sum += entry.getValue();
                }
            }

            return sum;
        }
    }
}
