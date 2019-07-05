package leetcode;

/**
 * https://leetcode.com/problems/counting-bits/submissions/
 */
public final class Problem338CountingBits {
    public int[] countBits(int num) {
        int[] numbers = new int[num + 1];

        for (int i = 0; i <= num; i++) {
            numbers[i] = countOnes(i);
        }

        return numbers;
    }

    private int countOnes(int num) {
        int count = 0;
        while (num > 0) {
            if ((num % 2) == 1) {
                count++;
            }

            num = num / 2;
        }

        return count;
    }
}
