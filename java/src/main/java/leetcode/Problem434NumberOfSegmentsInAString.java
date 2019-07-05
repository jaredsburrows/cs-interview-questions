package leetcode;

/**
 * https://leetcode.com/problems/number-of-segments-in-a-string/
 */
public final class Problem434NumberOfSegmentsInAString {
    public int countSegments(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        s = s.trim();
        return s.isEmpty() ? 0 : s.split("\\s+", -1).length;
    }
}
