package leetcode;

/**
 * https://leetcode.com/problems/duplicate-zeros/
 */
public final class Problem1089DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }

        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] == 0 && i + 1 < arr.length) {
                System.arraycopy(arr, i, arr, i + 1, arr.length - i - 1);
            }
        }

        if (arr[0] == 0) {
            System.arraycopy(arr, 0, arr, 1, arr.length - 1);
        }
    }
}
