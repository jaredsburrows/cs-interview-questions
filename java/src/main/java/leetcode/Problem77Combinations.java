package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/combinations
 */
public final class Problem77Combinations {
    // Space - O(N)
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> combinations = new ArrayList<>();

        if (n <= 0 || k <= 0 || n < k) {
            return combinations;
        }

        List<Integer> current = new ArrayList<>();

        combine(combinations, current, n, k, 1, 0);

        return combinations;
    }

    // backtrack
    private void combine(List<List<Integer>> combinations, List<Integer> current, int n, int k, int start, int length) {
        if (k == length) {
            combinations.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i <= n; i++) {
            current.add(i);
            combine(combinations, current, n, k, i + 1, length + 1);
            current.remove(current.size() - 1);
        }
    }
}
