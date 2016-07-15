package questions.stringarraymatrix;

import api.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public class TwoSum {

    // Time - O(N^2), Space - O(1)
    public static List<Pair<Integer, Integer>> getSums2(final int[] numbers, final int target) {

        final List<Pair<Integer, Integer>> answer = new ArrayList<>();

        for (final int first : numbers) {
            for (final int second : numbers) {
                if (first + second == target) {
                    final Pair<Integer, Integer> pair = new Pair<>(first, second);

                    answer.add(pair);
                }
            }
        }

        return answer;
    }

    // Time - O(N), Space - O(N)
    public static List<Pair<Integer, Integer>> getSums(final int[] numbers, final int target) {

        final List<Pair<Integer, Integer>> answer = new ArrayList<>();
        final Map<Integer, Integer> map = new HashMap<>();

        // O(N) - preprocessing
        for (int i = 0; i < numbers.length; i++) {
            final int key = numbers[i];
            if (map.containsKey(key)) {
                final int count = map.get(key) + 1;
                map.put(key, count);
            } else {
                map.put(key, 1);
            }
        }

        // O(N)
        for (final Map.Entry<Integer, Integer> entry : map.entrySet()) {
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
