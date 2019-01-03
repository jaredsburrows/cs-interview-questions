package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/jewels-and-stones
 */
public final class Problem771JewelsAndStones {
    // Time - O(N), Space - O(N)
    public int numJewelsInStones(String J, String S) {
        if (J == null || S == null || J.isEmpty()) {
            return -1;
        }

        if (S.isEmpty()) {
            return 0;
        }

        Map<Character, Integer> jewels = new HashMap<>();
        for (int i = 0; i < J.length(); i++) {
            jewels.put(J.charAt(i), jewels.getOrDefault(J.charAt(i), 0) + 1);
        }

        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            if (jewels.containsKey(S.charAt(i))) {
                count++;
            }
        }

        return count;
    }
}
