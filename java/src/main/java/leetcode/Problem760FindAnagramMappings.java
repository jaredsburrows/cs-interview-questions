package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/find-anagram-mappings/description
 */
public final class Problem760FindAnagramMappings {
    public int[] anagramMappings(int[] A, int[] B) {
        if (A == null || B == null || A.length == 0 || B.length == 0) {
            return new int[0];
        }

        final Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < B.length; i++) {
            map.put(B[i], i);
        }

        for (int i = 0; i < A.length; i++) {
            B[i] = map.get(A[i]);
        }

        return B;
    }
}
