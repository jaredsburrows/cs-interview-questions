package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * https://leetcode.com/problems/word-pattern
 */
public final class Problem290WordPattern {
    public boolean wordPattern(String pattern, String str) {
        if (pattern == null || str == null || pattern.isEmpty() || str.isEmpty()) {
            return false;
        }

        final String[] words = str.split("\\s+", -1);
        if (words.length != pattern.length()) {
            return false;
        }

        final Map<Object, Integer> map = new HashMap<>();
        for (Integer i = 0; i < words.length; i++) {
            if (!Objects.equals(map.put(pattern.charAt(i), i), map.put(words[i], i))) {
                return false;
            }
        }

        return true;
    }
}
