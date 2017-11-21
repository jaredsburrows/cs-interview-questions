package leetcode;

/**
 * https://leetcode.com/problems/single-number
 *
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class Problem136SingleNumber {
    // Time - O(N), Space - O(1)
    public static int singleNumber(int[] nums) {
        if (nums == null) {
            return 0;
        }

        int check = 0;

        for (int num : nums) {
            check ^= num;
        }

        return check;
    }
}
