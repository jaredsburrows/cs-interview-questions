package questions.dynamicprogramming;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class MaxSubArray {

    public static int getMax(int[] array) {
        if (array == null) {
            return -1;
        }

        int tempSum = array[0];
        int maxSum = array[0];
        for (int i = 1; i < array.length - 1; i++) {
            tempSum = Math.max(tempSum + array[i], array[i]);
            maxSum = Math.max(tempSum, maxSum);
        }

        return maxSum;
    }

    public static int maxContSubArray(int[] array) {
        if (array == null) {
            return -1;
        }

        int tempSum = array[0];
        int maxSum = array[0];

        for (int i = 1; i < array.length; i++) {
            tempSum = Math.max(tempSum + array[i], array[i]);
            maxSum = Math.max(tempSum, maxSum);
        }

        return maxSum;
    }

    public static int maxNonContSubArray(int[] array) {
        if (array == null) {
            return -1;
        }

        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int a : array) {
            if (a >= 0) {
                sum += a;
            }

            if (a > max) {
                max = a;
            }
        }

        if (sum == 0) {
            sum = max;
        }

        return sum;
    }
}
