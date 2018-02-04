package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/roman-to-integer/description
 */
public final class Problem13RomanToInteger {
    // Time - O(N), Space - O(N)
    public int romanToInt(String s) {
        if (s == null) {
            return -1;
        }

        final Map<Character, Integer> map = new HashMap<>();
        map.put('M', 1000);
        map.put('D', 500);
        map.put('C', 100);
        map.put('L', 50);
        map.put('X', 10);
        map.put('V', 5);
        map.put('I', 1);

        int previous = 0;
        int result = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            final int current = map.get(s.charAt(i));
            if (current < previous) {
                result -= current;
            } else {
                result += current;
            }
            previous = current;
        }

        return result;
    }
}
