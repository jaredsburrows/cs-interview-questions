package codingbat;

import java.util.HashMap;
import java.util.Map;

/**
 * http://codingbat.com/prob/p134133
 */
public final class AllSwap {
    public String[] allSwap(String[] strings) {
        if (strings == null || strings.length == 0) {
            return new String[0];
        }

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            char key = strings[i].charAt(0);
            if (map.containsKey(key) && map.get(key) != -1) {
                swap(strings, map.get(key), i);
                map.put(key, -1);
            } else {
                map.put(key, i);
            }
        }

        return strings;
    }

    private void swap(String[] array, int left, int right) {
        String temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
