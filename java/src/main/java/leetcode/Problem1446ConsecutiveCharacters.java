package leetcode;

/**
 * https://leetcode.com/problems/consecutive-characters/
 */
public final class Problem1446ConsecutiveCharacters {
    public int maxPower(String s) {
        if (s == null || s.isEmpty()) {
            return -1;
        }

        int max = 0;
        int count = 0;
        char prev = ' ';
        for (char c : s.toCharArray()) {
            if (c != prev) {
                max = Math.max(count, max);
                count = 1;
                prev = c;
            } else {
                count++;
            }
        }
        return Math.max(count, max);
    }
}
