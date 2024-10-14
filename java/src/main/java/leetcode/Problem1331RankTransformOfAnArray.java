package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

/**
 * https://leetcode.com/problems/rank-transform-of-an-array/
 */
public final class Problem1331RankTransformOfAnArray {
    public int[] arrayRankTransform(int[] arr) {
        Set<Integer> sortedSet = new TreeSet<>();
        for (int num : arr) {
            sortedSet.add(num);
        }

        Map<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;
        for (int num : sortedSet) {
            rankMap.put(num, rank++);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rankMap.get(arr[i]);
        }

        return arr;
    }

    public int[] arrayRankTransform2(int[] arr) {
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
            map.computeIfAbsent(entry, k -> map.size() + 1);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }

        return arr;
    }
}
