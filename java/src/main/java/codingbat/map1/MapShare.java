package codingbat.map1;

import java.util.HashMap;
import java.util.Map;

/**
 * http://codingbat.com/prob/p148813
 */
public final class MapShare {
    public Map<String, String> mapShare(Map<String, String> map) {
        if (map == null) {
            return new HashMap<>();
        }

        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
        }

        map.remove("c");

        return map;
    }
}
