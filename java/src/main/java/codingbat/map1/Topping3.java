package codingbat.map1;

import java.util.HashMap;
import java.util.Map;

/**
 * https://codingbat.com/prob/p128461
 */
public final class Topping3 {
    public Map<String, String> topping3(Map<String, String> map) {
        if (map == null) {
            return new HashMap<>();
        }

        if (map.containsKey("potato")) {
            map.put("fries", map.get("potato"));
        }

        if (map.containsKey("salad")) {
            map.put("spinach", map.get("salad"));
        }

        return map;
    }
}
