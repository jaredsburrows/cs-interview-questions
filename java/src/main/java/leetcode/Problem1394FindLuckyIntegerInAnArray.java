package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/find-lucky-integer-in-an-array/
 */
public final class Problem1394FindLuckyIntegerInAnArray {
    public int findLucky(int[] arr) {
        int toReturn = -1;
        if (arr == null || arr.length == 0) {
            return toReturn;
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int i : map.keySet()) {
            if (i == map.get(i)) {
                toReturn = Math.max(toReturn, i);
            }
        }

        return toReturn;
    }

    public int findLucky2(int[] arr) {
        int toReturn = -1;
        if (arr == null || arr.length == 0) {
            return toReturn;
        }

        int[] nums = new int[501];
        for (int i : arr) {
            nums[i]++;
        }

        for (int i : nums) {
            if (i == nums[i] && i != 0) {
                toReturn = Math.max(toReturn, i);
            }
        }

        return toReturn;
    }

    // fastest
    public int findLucky3(int[] arr) {
        int toReturn = -1;
        if (arr == null || arr.length == 0) {
            return toReturn;
        }

        int[] nums = new int[501];
        for (int i : arr) {
            nums[i]++;
        }

        for (int value : arr) {
            if (value == nums[value]) {
                toReturn = Math.max(toReturn, value);
            }
        }

        return toReturn;
    }
}
