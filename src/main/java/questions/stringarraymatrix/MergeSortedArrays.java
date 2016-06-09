package questions.stringarraymatrix;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public class MergeSortedArrays {

    public static int[] merge(final int[] arrayA, final int[] arrayB) {
        if (arrayA == null && arrayB == null) {
            return null;
        }

        if (arrayA == null) {
            return arrayB;
        }

        if (arrayB == null) {
            return arrayA;
        }

        int[] merge = new int[arrayA.length + arrayB.length];

        int indexA = 0;
        int indexB = 0;

        for (int i = 0; i < merge.length; i++) {
            if (indexA < arrayA.length && indexB < arrayB.length) {
                if (arrayA[indexA] < arrayB[indexB]) {
                    merge[i] = arrayA[indexA++];
                } else {
                    merge[i] = arrayB[indexB++];
                }
            } else if (indexA < arrayA.length) {
                merge[i] = arrayA[indexA++];
            } else {
                merge[i] = arrayB[indexB++];
            }
        }

        return merge;
    }
}
