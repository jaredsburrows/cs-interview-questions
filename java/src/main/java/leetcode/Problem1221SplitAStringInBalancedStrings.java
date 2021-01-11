package leetcode;

/**
 * https://leetcode.com/problems/split-a-string-in-balanced-strings/
 */
public final class Problem1221SplitAStringInBalancedStrings {
    public int balancedStringSplit(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        int maxSplit = 0;
        int counter = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'R') {
                counter++;
            }

            if (c == 'L') {
                counter--;
            }

            if (counter == 0) {
                maxSplit++;
            }
        }

        return maxSplit;
    }
}
