package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/4sum/description
 */
public final class Problem184Sum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        final List<List<Integer>> sums = new ArrayList<>();
        if (nums == null || nums.length < 4) {
            return sums;
        }

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 3; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j != i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                int k = j + 1;
                int l = nums.length - 1;

                while (k < l) {
                    if (nums[i] + nums[j] + nums[k] + nums[l] < target) {
                        k++;
                    } else if (nums[i] + nums[j] + nums[k] + nums[l] > target) {
                        l--;
                    } else {
                        final List<Integer> sum = new ArrayList<>();
                        sum.add(nums[i]);
                        sum.add(nums[j]);
                        sum.add(nums[k]);
                        sum.add(nums[l]);
                        sums.add(sum);

                        k++;
                        l--;

                        while (k < l && nums[k] == nums[k - 1]) {
                            k++;
                        }

                        while (k < l && nums[l] == nums[l + 1]) {
                            l--;
                        }
                    }
                }
            }
        }

        return sums;
    }
}
