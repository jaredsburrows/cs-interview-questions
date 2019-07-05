package leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/count-primes/
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/102/math/744/
 */
public final class Problem204CountPrimes {
    public int countPrimes(int n) {
        if (n <= 0) {
            return 0;
        }

        int count = 0;
        boolean[] primes = new boolean[n];

        Arrays.fill(primes, 1, n, true);

        for (int i = 2; i <= Math.sqrt(n - 1); i++) {
            if (primes[i]) {
                for (int j = i * 2; j < n; j += i) {
                    primes[j] = false;
                }
            }
        }

        for (int i = 2; i < n; i++) {
            if (primes[i]) {
                count++;
            }
        }

        return count;
    }
}
