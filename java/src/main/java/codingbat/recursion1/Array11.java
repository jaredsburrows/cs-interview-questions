package codingbat.recursion1;

/**
 * https://codingbat.com/prob/p135988
 */
public final class Array11 {
    public int array11(int[] nums, int index) {
        if (nums.length == 0 || nums.length == index) {
            return 0;
        }

        if (nums[index] == 11) {
            return array11(nums, index + 1) + 1;
        } else {
            return array11(nums, index + 1);
        }
    }
}
