package leetcode;

/**
 * https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
 */
public final class Problem1342NumberOfStepsToReduceANumberToZero {
    public int numberOfSteps(int num) {
        if (num <= 0) {
            return 0;
        }

        int count = 0;

        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num--;
            }
            count++;
        }

        return count;
    }
}
