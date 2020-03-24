package leetcode;

import java.util.TreeSet;

/**
 * https://leetcode.com/problems/two-sum-less-than-k/
 */
public final class Problem1099TwoSumLessThanK {
    // Time - O(N LOG N)
    public int twoSumLessThanK(int[] A, int K) {
        if (A == null) {
            return -1;
        }

        int toReturn = -1;

        TreeSet<Integer> set = new TreeSet<>();
        for (int i : A) {
            Integer difference = set.lower(K - i);

            if (difference != null) {
                toReturn = Math.max(toReturn, i + difference);
            }

            set.add(i);
        }

        return toReturn;
    }
}
