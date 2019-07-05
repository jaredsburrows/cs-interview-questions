package leetcode;

/**
 * https://leetcode.com/problems/house-robber/
 */
public final class Problem198HouseRobber {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int even = 0;
        int odd = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                even += nums[i];
                even = even > odd ? even : odd;
            } else {
                odd += nums[i];
                odd = even > odd ? even : odd;
            }
        }

        return even > odd ? even : odd;
    }
}
