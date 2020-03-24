package leetcode;

/**
 * https://leetcode.com/problems/armstrong-number/
 */
public final class Problem1134ArmstrongNumber {
    public boolean isArmstrong(int N) {
        int length = (int) (Math.log10((double) N) + 1);
        int copy = N;
        int sum = 0;

        while (N != 0) {
            int lastDigit = N % 10;

            sum += (int) Math.pow(lastDigit, length);

            N /= 10;
        }

        return copy == sum;
    }
}
