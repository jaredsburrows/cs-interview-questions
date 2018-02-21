package codingbat;

import java.util.Map;

/**
 * http://codingbat.com/prob/p107259
 */
public final class MapAB {
    public Map<String, String> mapAB(Map<String, String> map) {
        if (map == null) {
            return null;
        }

        if (map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a") + map.get("b"));
        }

        return map;
    }
}
