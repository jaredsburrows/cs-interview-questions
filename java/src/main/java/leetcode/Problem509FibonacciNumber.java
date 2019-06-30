package leetcode;

/**
 * https://leetcode.com/problems/fibonacci-number/
 */
public final class Problem509FibonacciNumber {
    public int fib(int N) {
        if (N < 2) {
            return N;
        }

        return fib(N - 1) + fib(N - 2);
    }
}
