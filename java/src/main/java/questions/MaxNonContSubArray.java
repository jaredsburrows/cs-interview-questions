package questions;

public final class MaxNonContSubArray {
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
