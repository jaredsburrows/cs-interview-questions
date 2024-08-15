package codingbat.map2;

import java.util.HashMap;
import java.util.Map;

/**
 * https://codingbat.com/prob/p168493
 */
public final class FirstChar {
    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();
        if (strings == null) {
            return map;
        }

        for (String string : strings) {
            String character = String.valueOf(string.charAt(0));
            map.put(character, map.getOrDefault(character, "") + string);
        }

        return map;
    }
}
