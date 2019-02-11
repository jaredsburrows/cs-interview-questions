package codingbat.map2;

import java.util.HashMap;
import java.util.Map;

/**
 * http://codingbat.com/prob/p126332
 */
public final class Pairs {
    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<>();
        if (strings == null || strings.length == 0) {
            return map;
        }

        for (String string : strings) {
            map.put(String.valueOf(string.charAt(0)),
                String.valueOf(string.charAt(string.length() - 1)));
        }

        return map;
    }
}
