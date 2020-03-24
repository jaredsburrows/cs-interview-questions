package leetcode;

/**
 * https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
 */
public final class Problem1304FindNUniqueIntegersSumUpToZero {
    // Pattern
    // n = 1, [0]
    // n = 2, [-1, 1]
    // n = 3, [-2, 0, 2]
    // n = 4, [-3, -1, 1, 2]
    // n = 5, [-4, -2, 0, 2, 4]
    public int[] sumZero(int n) {
        if (n <= 0) {
            return new int[0];
        }

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = i * 2 - n + 1;
        }

        return array;
    }
}
