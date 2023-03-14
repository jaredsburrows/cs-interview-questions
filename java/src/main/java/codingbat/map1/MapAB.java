package codingbat.map1;

import java.util.HashMap;
import java.util.Map;

/**
 * https://codingbat.com/prob/p107259
 */
public final class MapAB {
    public Map<String, String> mapAB(Map<String, String> map) {
        if (map == null) {
            return new HashMap<>();
        }

        if (map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a") + map.get("b"));
        }

        return map;
    }
}
