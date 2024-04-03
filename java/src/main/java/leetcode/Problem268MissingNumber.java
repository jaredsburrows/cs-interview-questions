package leetcode;

import java.util.Set;
import java.util.TreeSet;

/**
 * https://leetcode.com/problems/missing-number
 */
public final class Problem268MissingNumber {
    // Runtime 0ms - 100%
    // Time - O(N), Space - O(1)
    public int missingNumber(int[] nums) {
        int arraySum = 0;
        for (int num : nums) {
            arraySum += num;
        }

        return getSumNaturalNumbers(nums) - arraySum;
    }

    // Time - O(1), Space - O(1)
    private int getSumNaturalNumbers(int[] numbers) {
        int length = numbers.length;
        return (length * (length + 1)) / 2;
    }

    // Runtime 18ms - 5.01%
    public int missingNumber2(int[] nums) {
        Set<Integer> set = new TreeSet<>();
        int count = 0;
        for (int i : nums) {
            set.add(i);
        }

        for (int i : set) {
            if (count != i) {
                return count;
            } else {
                count++;
            }
        }

        return count;
    }
}
