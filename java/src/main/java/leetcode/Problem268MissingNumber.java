package leetcode;

/**
 * https://leetcode.com/problems/missing-number
 */
public final class Problem268MissingNumber {
    public int missingNumber(int[] nums) {
        int arraySum = 0;
        for (int num : nums) {
            arraySum += num;
        }

        return getSumNaturalNumbers(nums) - arraySum;
    }

    private int getSumNaturalNumbers(int[] numbers) {
        final int length = numbers.length;
        return (length * (length + 1)) / 2;
    }
}
