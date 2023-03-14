package codingbat.map1;

import java.util.HashMap;
import java.util.Map;

/**
 * https://codingbat.com/prob/p115011
 */
public final class MapAB2 {
    public Map<String, String> mapAB2(Map<String, String> map) {
        if (map == null) {
            return new HashMap<>();
        }

        if (map.containsKey("a")
            && map.containsKey("b")
            && map.get("a").equals(map.get("b"))) {
            map.remove("a");
            map.remove("b");
        }

        return map;
    }
}
