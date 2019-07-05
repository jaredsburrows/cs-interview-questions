package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/4sum-ii
 */
public final class Problem4544SumII {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        if (A == null || A.length == 0
            || B == null || B.length == 0
            || C == null || C.length == 0
            || D == null || D.length == 0) {
            return 0;
        }

        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int i : A) {
            for (int j : B) {
                int key = i + j;
                map.put(key, map.getOrDefault(i + j, 0) + 1);
            }
        }

        for (int i : C) {
            for (int j : D) {
                count += map.getOrDefault(-i - j, 0);
            }
        }

        return count;
    }
}
