package questions.stringarraymatrix;

public class MergeSortedArrays {

    public int[] merge(final int[] a, final int[] b) {
        if (a == null && b == null) {
            return null;
        }

        if (a == null) {
            return b;
        }

        if (b == null) {
            return a;
        }

        int[] merge = new int[a.length + b.length];

        int aIndex = 0;
        int bIndex = 0;

        for (int i = 0; i < merge.length; i++) {
            if (aIndex < a.length && bIndex < b.length) {
                if (a[aIndex] < b[bIndex]) {
                    merge[i] = a[aIndex++];
                } else {
                    merge[i] = b[bIndex++];
                }
            } else if (aIndex < a.length) {
                merge[i] = a[aIndex++];
            } else {
                merge[i] = b[bIndex++];
            }
        }

        return merge;
    }
}
