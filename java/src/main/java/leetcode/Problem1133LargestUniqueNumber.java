package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/largest-unique-number/
 */
public final class Problem1133LargestUniqueNumber {
    public int largestUniqueNumber(int[] A) {
        if (A == null) {
            return -1;
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : A) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int toReturn = -1;
        for (int num : A) {
            if (map.get(num) == 1 && num > toReturn) {
                toReturn = num;
            }
        }

        return toReturn;
    }
}
