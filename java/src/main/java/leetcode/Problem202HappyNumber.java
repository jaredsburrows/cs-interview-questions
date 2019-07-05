package leetcode;

/**
 * https://leetcode.com/problems/happy-number/
 * https://leetcode.com/explore/learn/card/hash-table/183/combination-with-other-algorithms/1131/
 */
public final class Problem202HappyNumber {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        while (slow > 1) {
            slow = product(slow);
            if (slow == 1) {
                return true;
            }

            fast = product(product(fast));
            if (fast == 1) {
                return true;
            }

            if (slow == fast) {
                return false;
            }
        }

        return n == 1;
    }

    private int product(int n) {
        int sum = 0;
        while (n > 0) {
            sum += (n % 10) * (n % 10);
            n /= 10;
        }
        return sum;
    }
}
