package codingbat;

import java.util.Map;

/**
 * http://codingbat.com/prob/p196458
 */
public final class Topping2 {
    public Map<String, String> topping2(Map<String, String> map) {
        if (map == null) {
            return null;
        }

        if (map.containsKey("ice cream")) {
            map.put("yogurt", map.get("ice cream"));
        }

        if (map.containsKey("spinach")) {
            map.put("spinach", "nuts");
        }

        return map;
    }
}
