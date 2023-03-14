package codingbat.map1;

import java.util.HashMap;
import java.util.Map;

/**
 * https://codingbat.com/prob/p197888
 */
public final class MapBully {
    public Map<String, String> mapBully(Map<String, String> map) {
        if (map == null) {
            return new HashMap<>();
        }

        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }

        return map;
    }
}
