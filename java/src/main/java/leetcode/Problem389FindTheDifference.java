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
            if (sMap.containsKey(c)) {
                final Integer count = sMap.get(c);
                sMap.put(c, count + 1);
            } else {
                sMap.put(c, 1);
            }
        }

        for (char c : t.toCharArray()) {
            if (tMap.containsKey(c)) {
                Integer count = tMap.get(c);
                tMap.put(c, count + 1);
            } else {
                tMap.put(c, 1);
            }
        }

        for (char c = 'a'; c <= 'z'; c++) {
            if (!Objects.equals(tMap.get(c), sMap.get(c))) {
                return c;
            }
        }

        return 'a';
    }
}
