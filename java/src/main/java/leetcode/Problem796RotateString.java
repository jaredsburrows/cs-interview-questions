package leetcode;

/**
 * https://leetcode.com/problems/rotate-string
 */
public final class Problem796RotateString {
    // Time - O(N), Space - O(1)
    public boolean rotateString(String A, String B) {
        if (A == null && B == null) {
            return true;
        }

        if ((A == null || B == null) || A.length() != B.length()) {
            return false;
        }

        final String rotated = A + A;
        return rotated.contains(B);
    }
}
