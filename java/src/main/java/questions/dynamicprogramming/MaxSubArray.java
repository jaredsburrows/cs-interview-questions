package questions.dynamicprogramming;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class MaxSubArray {
    public static int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int max = nums[0];
        int temp = nums[0];

        for (int i = 1; i < nums.length; i++) {
            final int currentNumber = nums[i];
            temp = Math.max(temp + currentNumber, currentNumber);
            max = Math.max(max, temp);
        }

        return max;
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
