package leetcode;

/**
 * https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
 */
public final class Problem1295FindNumbersWithEvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int count = 0;
        for (int num : nums) {
            int length = (int) (Math.log10(num) + 1);
            if (length % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public int findNumbers2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int count = 0;
        for (int num : nums) {
            if (num >= 10 && num < 100) {
                count++;
            } else if (num >= 1000 && num < 10000) {
                count++;
            } else if (num >= 100000 && num < 1000000) {
                count++;
            }
        }

        return count;
    }
}
