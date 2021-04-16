package leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * https://leetcode.com/problems/squares-of-a-sorted-array/
 */
public final class Problem977SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }

        int[] toReturn = new int[nums.length];
        Queue<Integer> queue = new PriorityQueue<>(nums.length, Integer::compare);

        for (int num : nums) {
            queue.offer(num * num);
        }

        while (!queue.isEmpty()) {
            toReturn[nums.length - queue.size()] = queue.poll();
        }

        return toReturn;
    }

    public int[] sortedSquares2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }

        Queue<Integer> queue = new PriorityQueue<>(nums.length, Integer::compare);
        for (int num : nums) {
            queue.add((int) Math.pow(num, 2));
        }

        int i = 0;
        while (!queue.isEmpty()) {
            nums[i++] = queue.poll();
        }

        return nums;
    }

    public int[] sortedSquares3(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }

        Queue<Integer> queue = new PriorityQueue<>(nums.length, Integer::compare);
        for (int num : nums) {
            queue.add(num * num);
        }

        while (!queue.isEmpty()) {
            nums[nums.length - queue.size()] = queue.poll();
        }

        return nums;
    }

    public int[] sortedSquares4(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        Arrays.sort(nums);

        return nums;
    }
}
