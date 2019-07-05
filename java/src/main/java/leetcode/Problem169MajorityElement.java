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
            Integer count = map.get(number);
            if (count != null) {
                map.put(number, count + 1);
            } else {
                map.put(number, 1);
            }

            count = map.get(number);
            if (count != null && count > majority) {
                return number;
            }
        }

        return -1;
    }
}
