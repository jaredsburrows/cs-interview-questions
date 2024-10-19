package leetcode;

import java.util.Objects;

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

        if (Objects.equals(version1, version2)) {
            return 0;
        }

        String[] left = version1.split("\\.", -1);
        String[] right = version2.split("\\.", -1);
        int length = Math.max(left.length, right.length);

        for (int i = 0; i < length; i++) {
            Integer v1 = i < left.length ? Integer.parseInt(left[i]) : 0;
            Integer v2 = i < right.length ? Integer.parseInt(right[i]) : 0;
            int compare = v1.compareTo(v2);
            if (compare != 0) {
                return compare;
            }
        }

        return 0;
    }
}
