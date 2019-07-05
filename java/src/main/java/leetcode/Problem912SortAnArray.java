package leetcode;

/**
 * https://leetcode.com/problems/sort-an-array/
 */
public final class Problem912SortAnArray {
    public int[] sortArray(int[] nums) {
        if (nums == null || nums.length < 2) {
            return nums;
        }

        merge(nums);

        return nums;
    }

    private static void merge(int[] in) {
        if (in == null || in.length < 2) {
            return;
        }

        int mid = in.length / 2;
        int[] left = new int[mid];
        int[] right = new int[in.length - mid];

        // copy left
        System.arraycopy(in, 0, left, 0, mid);
        // copy right
        System.arraycopy(in, mid, right, 0, in.length - mid);

        merge(left);
        merge(right);
        merge(left, right, in);
    }

    private static void merge(int[] a, int[] b, int[] all) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < a.length && j < b.length) { // merge back
            if (a[i] < b[j]) {
                all[k] = a[i];
                i++;
            } else {
                all[k] = b[j];
                j++;
            }
            k++;
        }

        while (i < a.length) { // left remaining
            all[k++] = a[i++];
        }

        while (j < b.length) { // right remaining
            all[k++] = b[j++];
        }
    }
}
