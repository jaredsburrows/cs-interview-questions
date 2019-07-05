package leetcode;

/**
 * https://leetcode.com/problems/single-number-ii/
 */
public final class Problem137SingleNumberII {
    public int singleNumber(int[] nums) {
        int checker = 0;
        int checker2 = 0;

        for (int num : nums) {
            checker = (checker ^ num) & ~checker2;
            checker2 = (checker2 ^ num) & ~checker;
        }

        return checker;
    }
}
