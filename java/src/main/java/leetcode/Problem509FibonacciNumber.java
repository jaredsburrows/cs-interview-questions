package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/fibonacci-number/
 * https://leetcode.com/explore/featured/card/recursion-i/255/recursion-memoization/1661/
 */
public final class Problem509FibonacciNumber {
    public int fib(int N) {
        if (N < 2) {
            return N;
        }

        return fib(N - 1) + fib(N - 2);
    }

    private final Map<Integer, Integer> cache = new HashMap<>();

    // memoization
    public int fib2(int N) {
        if (cache.containsKey(N)) {
            return cache.get(N);
        }

        int result;
        if (N < 2) {
            result = N;
        } else {
            result = fib2(N - 1) + fib2(N - 2);
        }

        // keep the result in cache.
        cache.put(N, result);
        return result;
    }
}
