package codingbat.map2;

import java.util.HashMap;
import java.util.Map;

/**
 * https://codingbat.com/prob/p125327
 */
public final class WordLen {
    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        if (strings == null) {
            return map;
        }

        for (String string : strings) {
            map.put(string, string.length());
        }

        return map;
    }
}
