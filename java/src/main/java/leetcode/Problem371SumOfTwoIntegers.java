package leetcode;

/**
 * https://leetcode.com/problems/sum-of-two-integers
 */
public final class Problem371SumOfTwoIntegers {
    // Time - O(N), Space - O(1)
    public static int getSum(int a, int b) {
        while (b != 0) {
            // carry contains common bits of a and b
            final int carry = a & b;

            // sum of a and b bits where at least one of the bits is not set
            a ^= b;

            // shifted by 1 for required sum
            b = carry << 1;
        }

        return a;
    }
}
