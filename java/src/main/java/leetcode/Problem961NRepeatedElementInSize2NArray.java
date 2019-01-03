package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/n-repeated-element-in-size-2n-array/
 */
public final class Problem961NRepeatedElementInSize2NArray {
    // Time - O(N), Space - O(1)
    public int repeatedNTimes(int[] A) {
        if (A == null || A.length == 0) {
            return -1;
        }

        for (int i = 2; i < A.length; i++) {
            if (A[i] == A[i - 1] || A[i] == A[i - 2]) {
                return A[i];
            }
        }

        return A[0];
    }

    // Time - O(N), Space - O(N)
    public int repeatedNTimes2(int[] A) {
        if (A == null || A.length == 0) {
            return -1;
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : A) {
            int currentCount = map.getOrDefault(num, 0) + 1;
            if (currentCount == A.length / 2) {
                return num;
            }

            map.put(num, currentCount);
        }

        return A[0];
    }
}
