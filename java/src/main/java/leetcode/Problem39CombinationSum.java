package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/combination-sum/description/
 */
public final class Problem39CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        final List<List<Integer>> combinations = new ArrayList<>();
        if (candidates == null || candidates.length == 0 || target < 0) {
            return combinations;
        }

        Arrays.sort(candidates);

        combinationSum(combinations, new ArrayList<>(), candidates, target, 0);

        return combinations;
    }

    private void combinationSum(List<List<Integer>> combinations, List<Integer> current, int[] candidates, int target, int start) {
        if (target < 0) {
        } else if (target == 0) {
            combinations.add(new ArrayList<>(current));
        } else {
            for (int i = start; i < candidates.length; i++) {
                current.add(candidates[i]);
                combinationSum(combinations, current, candidates, target - candidates[i], i);
                current.remove(current.size() - 1);
            }
        }
    }
}
