package codingbat.map2;

import java.util.HashMap;
import java.util.Map;

/**
 * http://codingbat.com/prob/p190862
 */
public final class WordMultiple {
    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();
        if (strings == null || strings.length == 0) {
            return map;
        }

        Map<String, Integer> counts = new HashMap<>();
        for (String string : strings) {
            counts.put(string, counts.getOrDefault(string, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            if (entry.getValue() > 1) {
                map.put(entry.getKey(), true);
            } else {
                map.put(entry.getKey(), false);
            }
        }

        return map;
    }
}
