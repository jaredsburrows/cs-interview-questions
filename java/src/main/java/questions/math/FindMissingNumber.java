package questions.math;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class FindMissingNumber {

    // Time - O(N), Space - O(1)
    public static int findMissing(int[] integers) {

        for (int i = 0; i < integers.length; i++) {
            int num = i + 1;
            if (integers[i] != num) {
                return num;
            }
        }

        return 0;
    }

    // Time - O(N), Space - O(1)
    public static int findMissing2(int[] integers) {
        int sum = 0;

        for (int integer : integers) {
            sum += integer;
        }

        return NaturalNumbersSum.getSumNaturalNumbers(integers.length) - sum;
    }
}
