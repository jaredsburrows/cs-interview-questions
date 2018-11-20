package leetcode;

/**
 * https://leetcode.com/problems/missing-number
 */
public final class Problem268MissingNumber {
    // Time - O(N), Space - O(1)
    public int missingNumber(int[] nums) {
        int arraySum = 0;
        for (int num : nums) {
            arraySum += num;
        }

        return getSumNaturalNumbers(nums) - arraySum;
    }

    // Time - O(1), Space - O(1)
    private int getSumNaturalNumbers(int[] numbers) {
        final int length = numbers.length;
        return (length * (length + 1)) / 2;
    }
}
