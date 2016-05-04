package questions.dynamicprogramming;

public class MaxSubArray {

    public static int getMax(final int[] array) {
        if (array == null) {
            return -1;
        }

        int tempMax = array[0];
        int max = array[0];
        for (final int anArray : array) {
            tempMax = Math.max(tempMax + anArray, anArray);
            max = Math.max(tempMax, max);
        }

        return max;
    }
}
