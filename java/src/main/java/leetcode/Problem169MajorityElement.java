package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/majority-element/
 */
public final class Problem169MajorityElement {
    public int majorityElement(final int[] nums) {
        int majority = nums.length / 2;
        Map<Integer, Integer> map = new HashMap<>();

        for (int number : nums) {
            map.put(number, map.getOrDefault(number, 0) + 1);

            if (map.getOrDefault(number, 0) > majority) {
                return number;
            }
        }

        return -1;
    }
}
