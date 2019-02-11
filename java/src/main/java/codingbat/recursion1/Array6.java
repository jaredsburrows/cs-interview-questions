package codingbat.recursion1;

/**
 * http://codingbat.com/prob/p108997
 */
public final class Array6 {
    public boolean array6(int[] nums, int index) {
        if (nums == null || nums.length == 0 || nums.length == index) {
            return false;
        }

        return nums[index] == 6 || array6(nums, index + 1);
    }
}
