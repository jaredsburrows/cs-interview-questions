package leetcode;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/
 */
public final class Problem1337TheKWeakestRowsInAMatrix {
    public int[] kWeakestRows(int[][] mat, int k) {
        if (mat == null || mat.length == 0 || k < 0) {
            return new int[0];
        }

        Queue<AbstractMap.SimpleEntry<Integer, Integer>> queue = new PriorityQueue<>(
            (left, right) -> left.getValue().equals(right.getValue()) ? left.getKey()
                - right.getKey()
                : left.getValue() - right.getValue());
        int[] array = new int[k];

        for (int i = 0; i < mat.length; i++) {
            queue.offer(new AbstractMap.SimpleEntry<Integer, Integer>(i, countOnes(mat[i])));
        }

        for (int i = 0; i < k; i++) {
            AbstractMap.SimpleEntry<Integer, Integer> value = queue.poll();
            if (value != null) {
                array[i] = value.getKey();
            }
        }

        return array;
    }

    public int[] kWeakestRows2(int[][] mat, int k) {
        if (mat == null || mat.length == 0 || k < 0) {
            return new int[0];
        }

        Map<Integer, Integer> map = new HashMap<>();
        Queue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>(
            (left, right) -> left.getValue().equals(right.getValue()) ? left.getKey()
                - right.getKey()
                : left.getValue() - right.getValue());
        int[] array = new int[k];

        for (int i = 0; i < mat.length; i++) {
            map.put(i, countOnes(mat[i]));
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            queue.offer(entry);
        }

        for (int i = 0; i < k; i++) {
            Map.Entry<Integer, Integer> value = queue.poll();
            if (value != null) {
                array[i] = value.getKey();
            }
        }

        return array;
    }

    private int countOnes(int[] row) {
        if (row == null || row.length == 0) {
            return 0;
        }

        int low = 0;
        int high = row.length;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (row[mid] == 1) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }

    public int[] kWeakestRows3(int[][] mat, int k) {
        if (mat == null || mat.length == 0 || k < 0) {
            return new int[0];
        }

        Map<Integer, Integer> map = new HashMap<>();
        Queue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>(
            (left, right) -> left.getValue().equals(right.getValue()) ? left.getKey()
                - right.getKey()
                : left.getValue() - right.getValue());
        int[] array = new int[k];
        int rowLength = mat.length;
        int colLength = mat[0].length;

        for (int i = 0; i < rowLength; i++) {
            int count = 0;
            for (int j = 0; j < colLength; j++) {
                if (mat[i][j] == 1) {
                    count++;
                }
                map.put(i, count);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            queue.offer(entry);
        }

        for (int i = 0; i < k; i++) {
            Map.Entry<Integer, Integer> value = queue.poll();

            if (value != null) {
                array[i] = value.getKey();
            }
        }

        return array;
    }
}
