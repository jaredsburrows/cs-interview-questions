package codingbat;

import java.util.Map;

/**
 * http://codingbat.com/prob/p182712
 */
public final class Topping1 {
    public Map<String, String> topping1(Map<String, String> map) {
        if (map == null) {
            return null;
        }

        if (map.containsKey("ice cream")) {
            map.put("ice cream", "cherry");
        }

        map.put("bread", "butter");

        return map;
    }
}
