package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/contains-duplicate/
 * https://leetcode.com/explore/learn/card/hash-table/183/combination-with-other-algorithms/1112/
 */
public final class Problem217ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }

        Set<Integer> set = new HashSet<>();
        for (int number : nums) {
            if (! set.add(number)) {
                return true;
            }
        }

        return false;
    }
}
