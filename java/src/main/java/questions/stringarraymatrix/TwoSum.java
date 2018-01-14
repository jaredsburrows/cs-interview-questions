package questions.stringarraymatrix;

import api.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class TwoSum {
    // Time - O(N^2), Space - O(1)
    public static List<Pair<Integer, Integer>> twoSum2(int[] numbers, int target) {
        final List<Pair<Integer, Integer>> answer = new ArrayList<>();

        for (int first : numbers) {
            for (int second : numbers) {
                if (first + second == target) {
                    final Pair<Integer, Integer> pair = new Pair<>(first, second);

                    answer.add(pair);
                }
            }
        }

        return answer;
    }

    // Time - O(N), Space - O(N)
    public static List<Pair<Integer, Integer>> twoSum(int[] numbers, int target) {
        final List<Pair<Integer, Integer>> answer = new ArrayList<>();
        final Map<Integer, Integer> map = new HashMap<>();

        // O(N) - preprocessing
        for (int key : numbers) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        // O(N)
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            final int key = entry.getKey();
            final int difference = target - key;

            // key + difference = target
            if (map.containsKey(difference) && map.get(difference) > 0) {
                final Pair<Integer, Integer> pair = new Pair<>(key, difference);

                answer.add(pair);

                // decrement count
                final int count = map.get(key) - 1;
                map.put(key, count);
            }
        }

        return answer;
    }
}
