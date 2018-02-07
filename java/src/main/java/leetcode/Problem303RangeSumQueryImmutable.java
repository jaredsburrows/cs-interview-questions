package leetcode;

/**
 * https://leetcode.com/problems/range-sum-query-immutable/description/
 */
@SuppressWarnings("ClassCanBeStatic")
public final class Problem303RangeSumQueryImmutable {
    public class NumArray {
        private final int[] nums;

        public NumArray(int[] nums) {
            for (int i = 1; i < nums.length; i++) {
                nums[i] += nums[i - 1];
            }

            this.nums = nums;
        }

        public int sumRange(int i, int j) {
            if (i == 0) {
                return nums[j];
            }

            return nums[j] - nums[i - 1];
        }
    }
}
