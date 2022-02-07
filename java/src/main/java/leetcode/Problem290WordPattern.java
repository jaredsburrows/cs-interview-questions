package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * https://leetcode.com/problems/word-pattern
 */
public final class Problem290WordPattern {
    // Time - O(N), Space - O(N)
    public boolean wordPattern(String pattern, String s) {
        if (pattern == null || s == null || pattern.isEmpty() || s.isEmpty()) {
            return false;
        }

        String[] words = s.split("\\s+", -1);
        if (words.length != pattern.length()) {
            return false;
        }

        Map<Object, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (!Objects.equals(map.put(pattern.charAt(i), i), map.put(words[i], i))) {
                return false;
            }
        }

        return true;
    }
}
