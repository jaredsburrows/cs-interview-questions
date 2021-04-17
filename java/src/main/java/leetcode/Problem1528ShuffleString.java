package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/shuffle-string/
 */
public final class Problem1528ShuffleString {
    public String restoreString(String s, int[] indices) {
        if (s == null || s.isEmpty()) {
            return "";
        }

        if (indices == null || indices.length == 0) {
            return s;
        }

        Map<Integer, Character> map = new HashMap<>();
        char[] toReturn = new char[indices.length];

        for (int i = 0; i < indices.length; i++) {
            map.put(indices[i], s.charAt(i));
        }

        for (int i = 0; i < indices.length; i++) {
            toReturn[i] = map.get(i);
        }

        return new String(toReturn);
    }

    public String restoreString2(String s, int[] indices) {
        if (s == null || s.isEmpty()) {
            return "";
        }

        if (indices == null || indices.length == 0) {
            return s;
        }

        char[] toReturn = new char[indices.length];

        for (int i = 0; i < indices.length; i++) {
            toReturn[indices[i]] = s.charAt(i);
        }

        return new String(toReturn);
    }
}
