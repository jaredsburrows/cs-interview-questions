package questions.stringarraymatrix;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class MergeSortedArrays {
    // Time - O(N+M), Space - O(N+M)
    public static int[] merge(int[] left, int[] right) {
        if (left == null && right == null) {
            return new int[]{};
        }

        if (left == null) {
            return right;
        }

        if (right == null) {
            return left;
        }

        final int[] merge = new int[left.length + right.length];

        int leftIndex = 0;
        int rightIndex = 0;

        for (int i = 0; i < merge.length; i++) {
            if (leftIndex < left.length && rightIndex < right.length) {
                if (left[leftIndex] < right[rightIndex]) {
                    merge[i] = left[leftIndex++];
                } else {
                    merge[i] = right[rightIndex++];
                }
            } else if (leftIndex < left.length) {
                merge[i] = left[leftIndex++];
            } else {
                merge[i] = right[rightIndex++];
            }
        }

        return merge;
    }
}
