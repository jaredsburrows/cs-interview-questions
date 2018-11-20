package leetcode;

/**
 * https://leetcode.com/problems/repeated-string-match
 */
public final class Problem686RepeatedStringMatch {
    // Time - O(N), Space - O(N)
    public int repeatedStringMatch(String A, String B) {
        if (A == null || B == null) {
            return -1;
        }

        final StringBuilder stringBuilder = new StringBuilder();
        int count = 0;

        while (stringBuilder.length() < B.length()) {
            stringBuilder.append(A);
            count++;
        }

        if (stringBuilder.toString().contains(B)) {
            return count;
        }

        if (stringBuilder.append(A).toString().contains(B)) {
            return count + 1;
        }

        return -1;
    }
}
