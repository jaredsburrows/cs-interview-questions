package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * https://leetcode.com/problems/random-pick-index/
 */
@SuppressWarnings("ClassCanBeStatic") // Leetcode is not static
public final class Problem398RandomPickIndex {
    class Solution {
        private final int[] nums;
        private final Map<Integer, List<Integer>> map = new HashMap<>();
        private Random random = new Random();

        public Solution(int[] nums) {
            this.nums = nums;

            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(nums[i])) {
                    List<Integer> numbers = map.get(nums[i]);
                    numbers.add(i);
                    map.put(nums[i], numbers);
                } else {
                    List<Integer> numbers = new ArrayList<>();
                    numbers.add(i);
                    map.put(nums[i], numbers);
                }
            }
        }

        public int pick(int target) {
            List<Integer> list = map.get(target);
            return list.get(random.nextInt(list.size()));
        }
    }
}
