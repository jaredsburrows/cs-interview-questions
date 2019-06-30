package leetcode;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * https://leetcode.com/problems/squares-of-a-sorted-array/
 */
public final class Problem977SquaresOfASortedArray {
    public int[] sortedSquares(int[] A) {
        if (A == null || A.length == 0) {
            return new int[0];
        }

        int[] toReturn = new int[A.length];
        Queue<Integer> queue = new PriorityQueue<>(A.length, Integer::compare);

        for (int number : A) {
            queue.offer(number * number);
        }

        while (!queue.isEmpty()) {
            toReturn[A.length - queue.size()] = queue.poll();
        }

        return toReturn;
    }
}
