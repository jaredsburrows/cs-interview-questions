package codingbat;

import java.util.Map;

/**
 * http://codingbat.com/prob/p197888
 */
public final class MapBully {
    public Map<String, String> mapBully(Map<String, String> map) {
        if (map == null) {
            return null;
        }

        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }

        return map;
    }
}
