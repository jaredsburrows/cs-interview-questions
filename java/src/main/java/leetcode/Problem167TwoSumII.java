package leetcode;

/**
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 * https://leetcode.com/explore/learn/card/array-and-string/205/array-two-pointer-technique/1153/
 */
public final class Problem167TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        if (numbers == null || numbers.length == 0) {
            return new int[0];
        }

        int i = 0;
        int j = numbers.length - 1;

        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum == target) {
                return new int[] {i + 1, j + 1};
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }

        return new int[0];
    }
}
