package codingbat.map1;

import java.util.HashMap;
import java.util.Map;

/**
 * https://codingbat.com/prob/p136950
 */
public final class MapAB4 {
    public Map<String, String> mapAB4(Map<String, String> map) {
        if (map == null) {
            return new HashMap<>();
        }

        if (map.containsKey("a") && map.containsKey("b")) {
            if (map.get("a").length() != map.get("b").length()) {
                if (map.get("a").length() > map.get("b").length()) {
                    map.put("c", map.get("a"));
                } else {
                    map.put("c", map.get("b"));
                }
            } else {
                map.put("a", "");
                map.put("b", "");
            }
        }
        return map;
    }
}
