package leetcode;

/**
 * https://leetcode.com/problems/compare-version-numbers
 */
public final class Problem165CompareVersionNumbers {
    public int compareVersion(String version1, String version2) {
        if (version1 == null) {
            return -1;
        }

        if (version2 == null) {
            return 1;
        }

        if (version1.equals(version2)) {
            return 0;
        }

        final String[] left = version1.split("\\.");
        final String[] right = version2.split("\\.");
        final int length = Math.max(left.length, right.length);

        for (int i = 0; i < length; i++) {
            final Integer v1 = i < left.length ? Integer.valueOf(left[i]) : 0;
            final Integer v2 = i < right.length ? Integer.valueOf(right[i]) : 0;
            final int compare = v1.compareTo(v2);
            if (compare != 0) {
                return compare;
            }
        }

        return 0;
    }
}
