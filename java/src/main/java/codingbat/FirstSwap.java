package codingbat;

import java.util.HashMap;
import java.util.Map;

/**
 * http://codingbat.com/prob/p150113
 */
public final class FirstSwap {
    public String[] firstSwap(String[] strings) {
        if (strings == null || strings.length == 0) {
            return new String[0];
        }

        final Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            final char key = strings[i].charAt(0);
            if (map.containsKey(key)) {
                final int value = map.get(key);
                if (value == -1) {
                    continue;
                }

                swap(strings, value, i);
                map.put(key, -1);
            } else {
                map.put(key, i);
            }
        }

        return strings;
    }

    private void swap(String[] array, int left, int right) {
        final String temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
