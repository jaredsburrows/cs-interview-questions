package codingbat;

import java.util.HashMap;
import java.util.Map;

/**
 * http://codingbat.com/prob/p152303
 */
public final class Word0 {
    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        if (strings == null || strings.length == 0) {
            return map;
        }

        for (String string : strings) {
            map.put(string, 0);
        }

        return map;
    }
}
