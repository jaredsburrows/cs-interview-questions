package codingbat.ap1;

/**
 * https://codingbat.com/prob/p134174
 */
public final class CopyEvens {
    public int[] copyEvens(int[] nums, int count) {
        int[] array = new int[count];
        int evens = 0;

        for (int num : nums) {
            if (evens < count && num % 2 == 0) {
                array[evens] = num;
                evens++;
            }
        }

        return array;
    }
}
