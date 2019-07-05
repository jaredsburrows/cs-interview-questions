package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * https://leetcode.com/problems/find-the-difference/
 */
public final class Problem389FindTheDifference {
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            sMap.put(c, sMap.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }

        for (char c = 'a'; c <= 'z'; c++) {
            if (!Objects.equals(tMap.get(c), sMap.get(c))) {
                return c;
            }
        }

        return 'a';
    }
}
