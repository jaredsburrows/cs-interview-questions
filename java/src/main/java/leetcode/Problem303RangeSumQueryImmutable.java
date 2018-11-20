package leetcode;

/**
 * https://leetcode.com/problems/range-sum-query-immutable
 */
@SuppressWarnings("ClassCanBeStatic")
public final class Problem303RangeSumQueryImmutable {
    public final class NumArray {
        private final int[] nums;

        // Time - O(N), Space - O(1)
        public NumArray(int[] nums) {
            for (int i = 1; i < nums.length; i++) {
                nums[i] += nums[i - 1];
            }

            this.nums = nums;
        }

        // Time - O(1), Space - O(1)
        public int sumRange(int i, int j) {
            if (i == 0) {
                return nums[j];
            }

            return nums[j] - nums[i - 1];
        }
    }
}
