package leetcode;

/**
 * https://leetcode.com/problems/regular-expression-matching
 */
public final class Problem10RegularExpressionMatching {
    public boolean isMatch(String s, String p) {
        if (s == null && p == null) {
            return true;
        }

        if (s == null || p == null) {
            return false;
        }

        if (p.isEmpty()) {
            return s.isEmpty();
        }

        final boolean firstMatch = !s.isEmpty() && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.');

        if (p.length() >= 2 && p.charAt(1) == '*') {
            return isMatch(s, p.substring(2)) || (firstMatch && isMatch(s.substring(1), p));
        } else {
            return firstMatch && isMatch(s.substring(1), p.substring(1));
        }
    }
}
