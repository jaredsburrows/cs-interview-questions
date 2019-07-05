package leetcode;

/**
 * https://leetcode.com/problems/sort-colors/
 */
public final class Problem75SortColors {
    public void sortColors(int[] nums) {
        int zero = 0;
        int one = 0;
        int two = 0;

        for (int num : nums) {
            if (num == 0) {
                zero++;
            }

            if (num == 1) {
                one++;
            }

            if (num == 2) {
                two++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i < zero + one + two) {
                nums[i] = 2;
            }

            if (i < zero + one) {
                nums[i] = 1;
            }

            if (i < zero) {
                nums[i] = 0;
            }
        }
    }
}
