package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * https://leetcode.com/problems/rank-transform-of-an-array/
 */
public final class Problem1331RankTransformOfAnArray {
    public int[] arrayRankTransform(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new int[0];
        }

        Queue<Integer> queue = new PriorityQueue<>();
        for (int i : arr) {
            queue.add(i);
        }

        Map<Integer, Integer> map = new HashMap<>();
        while (!queue.isEmpty()) {
            Integer entry = queue.poll();
            if (map.get(entry) == null) {
                map.put(entry, map.size() + 1);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }

        return arr;
    }
}
