package leetcode;

/**
 * https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
 */
public final class Problem1281SubtractTheProductAndSumOfDigitsOfAnInteger {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;

        while (n != 0) {
            int lastDigit = n % 10;

            product *= lastDigit;
            sum += lastDigit;

            n /= 10;
        }

        return product - sum;
    }
}
