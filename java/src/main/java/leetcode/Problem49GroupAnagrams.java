package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/group-anagrams
 */
public final class Problem49GroupAnagrams {
    // Time - O(N*LOG(K)), Space - O(N)
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> strings = new ArrayList<>();
        if (strs == null || strs.length == 0) {
            return strings;
        }

        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] unSorted = s.toCharArray();
            Arrays.sort(unSorted);
            String sorted = new String(unSorted);
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }

            map.get(sorted).add(s);
        }

        strings.addAll(map.values());
        return strings;
    }
}
