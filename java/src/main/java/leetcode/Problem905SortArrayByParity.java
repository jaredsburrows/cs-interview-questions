package leetcode;

/**
 * https://leetcode.com/problems/sort-array-by-parity
 */
public final class Problem905SortArrayByParity {
    // Space - O(1)
    public int[] sortArrayByParity(int[] A) {
        if (A == null || A.length == 0) {
            return new int[0];
        }

        if (A.length < 2) {
            return A;
        }

        int low = 0;
        int high = A.length - 1;

        while (low < high) {
            while (low < high && A[low] % 2 == 0) {
                low++;
            }

            while (low < high && A[high] % 2 != 0) {
                high--;
            }

            swap(A, low, high);
            low++;
            high--;
        }

        return A;
    }

    // Time - O(1), Space - O(1)
    private void swap(int[] A, int left, int right) {
        final int temp = A[left];
        A[left] = A[right];
        A[right] = temp;
    }
}
