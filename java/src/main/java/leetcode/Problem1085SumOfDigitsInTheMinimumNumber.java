package leetcode;

/**
 * https://leetcode.com/problems/sum-of-digits-in-the-minimum-number/
 */
public final class Problem1085SumOfDigitsInTheMinimumNumber {
    public int sumOfDigits(int[] A) {
        if (A == null || A.length == 0) {
            return -1;
        }

        int min = A[0];
        for (int nums : A) {
            min = Math.min(min, nums);
        }

        int sum = 0;
        while (min != 0) {
            sum += min % 10;
            min /= 10;
        }

        return sum % 2 == 0 ? 1 : 0;
    }
}
