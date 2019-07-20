package leetcode;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * https://leetcode.com/problems/shuffle-an-array/
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/98/design/670/
 */
@SuppressWarnings("ClassCanBeStatic") // Leetcode is not static
public final class Problem384ShuffleAnArray {
    final class Solution {
        private final Random random = new Random();
        private final int[] nums;

        public Solution(int[] nums) {
            this.nums = nums;
        }

        /** Resets the array to its original configuration and return it. */
        public int[] reset() {
            return nums;
        }

        /** Returns a random shuffling of the array. */
        public int[] shuffle() {
            int[] copy = new int[nums.length];
            System.arraycopy(nums, 0, copy, 0, copy.length);
            for (int i = 0; i < copy.length; i++) {
                swap(copy, i, ThreadLocalRandom.current().nextInt(copy.length - i) + i);
            }
            return copy;
        }

        private void swap(int[] array, int i, int j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
