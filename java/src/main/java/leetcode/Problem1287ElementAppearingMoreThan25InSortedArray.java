package leetcode;

/**
 * https://leetcode.com/problems/element-appearing-more-than-25-in-sorted-array/
 */
public final class Problem1287ElementAppearingMoreThan25InSortedArray {
    public int findSpecialInteger(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        int length = arr.length;

        if (length < 2) {
            return arr[0];
        }

        int percent25 = length / 4;
        int count = 1;
        for (int i = 1; i < length; i++) {
            if (arr[i - 1] == arr[i]) {
                if (++count > percent25) {
                    return arr[i - 1];
                }
            } else {
                count = 1;
            }
        }

        return -1;
    }
}
