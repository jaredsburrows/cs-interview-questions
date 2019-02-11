package codingbat.map2;

import java.util.HashMap;
import java.util.Map;

/**
 * http://codingbat.com/prob/p103593
 */
public final class WordAppend {
    public String wordAppend(String[] strings) {
        StringBuilder stringBuilder = new StringBuilder();
        if (strings == null || strings.length == 0) {
            return stringBuilder.toString();
        }

        Map<String, Integer> map = new HashMap<>();
        for (String string : strings) {
            map.put(string, map.getOrDefault(string, 0) + 1);

            if (map.get(string) % 2 == 0) {
                stringBuilder.append(string);
            }
        }

        return stringBuilder.toString();
    }
}
