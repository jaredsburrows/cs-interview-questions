package leetcode;

/**
 * https://leetcode.com/problems/number-of-1-bits/
 */
public final class Problem191NumberOf1Bits {
    public int hammingWeight(int n) {
        int distance = 0;
        int currentValue = n;

        while (currentValue != 0) {
            distance++;
            currentValue &= currentValue - 1;
        }

        return distance;
    }
}
