package leetcode;

/**
 * https://leetcode.com/problems/perfect-number/
 */
public final class Problem507PerfectNumber {
    public boolean checkPerfectNumber(int num) {
        int sum = 1;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i + num / i;
            }
        }

        return sum == num && num != 1;
    }
}
