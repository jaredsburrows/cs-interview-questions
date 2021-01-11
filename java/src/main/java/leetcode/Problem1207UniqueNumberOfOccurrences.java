package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * https://leetcode.com/problems/unique-number-of-occurrences/
 */
public final class Problem1207UniqueNumberOfOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        if (arr == null || arr.length == 0) {
            return false;
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        Set<Integer> check = new HashSet<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            if (!check.contains(value)) {
                check.add(value);
            } else {
                return false;
            }
        }

        return true;
    }

    public boolean uniqueOccurrences2(int[] arr) {
        if (arr == null || arr.length == 0) {
            return false;
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        return map.size() == new HashSet<>(map.values()).size();
    }
}
