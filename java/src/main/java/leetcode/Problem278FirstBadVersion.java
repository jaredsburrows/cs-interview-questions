package leetcode;

/**
 * https://leetcode.com/problems/first-bad-version
 */
@SuppressWarnings("unused")
public final class Problem278FirstBadVersion {
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;

        while (start < end) {
            final int mid = start + (end - start) / 2;

            if (isBadVersion(mid)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    // stub - part of question
    private boolean isBadVersion(int mid) {
        return false;
    }
}
