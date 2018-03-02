package codingbat;

import java.util.HashMap;
import java.util.Map;

/**
 * http://codingbat.com/prob/p115012
 */
public final class MapAB3 {
    public Map<String, String> mapAB3(Map<String, String> map) {
        if (map == null) {
            return new HashMap<>();
        }

        if (map.containsKey("a") && !map.containsKey("b")) {
            map.put("b", map.get("a"));
        } else if (map.containsKey("b") && !map.containsKey("a")) {
            map.put("a", map.get("b"));
        }

        return map;
    }
}
