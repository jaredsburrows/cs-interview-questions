package leetcode;

/**
 * https://leetcode.com/problems/plus-one
 */
public final class Problem66PlusOne {
    // Time - O(N), Space - O(N)
    public int[] plusOne(int[] digits) {
        if (digits == null || digits.length == 0) {
            return new int[0];
        }

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] toReturn = new int[digits.length + 1];
        toReturn[0] = 1;
        return toReturn;
    }
}
