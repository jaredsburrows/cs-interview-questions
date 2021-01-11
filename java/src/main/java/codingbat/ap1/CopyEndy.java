package codingbat.ap1;

/**
 * https://codingbat.com/prob/p130124
 */
public final class CopyEndy {
    public int[] copyEndy(int[] nums, int count) {
        int[] test = new int[count];
        int copy = 0;
        for (int num : nums) {
            if ((num >= 0 && num <= 10) || (num >= 90 && num <= 100)) {
                test[copy++] = num;
                if (copy == count) {
                    break;
                }
            }
        }

        return test;
    }
}
