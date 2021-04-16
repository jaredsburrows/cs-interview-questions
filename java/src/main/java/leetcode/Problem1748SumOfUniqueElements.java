package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/sum-of-unique-elements/
 */
public final class Problem1748SumOfUniqueElements {
    public int sumOfUnique(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : nums) {
            if (map.get(num) == 1) {
                sum += num;
            }
        }

        return sum;
    }

    public int sumOfUnique2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) == 1) {
                sum += num;
            } else if (map.get(num) == 2) {
                sum -= num;
            }
        }

        return sum;
    }
}
