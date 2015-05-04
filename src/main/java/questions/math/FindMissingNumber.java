package questions.math;

public class FindMissingNumber {

    // Time - O(N), Space - O(1)
    public int findMissing(int[] integers) {

        for (int i = 0; i < integers.length; i++) {
            int num = i + 1;
            if (integers[i] != num) {
                return num;
            }
        }

        return 0;
    }

    // Time - O(N), Space - O(1)
    public int findMissing2(int[] integers) {
        int sum = 0;

        for (final int integer : integers) {
            sum += integer;
        }

        return new NaturalNumbersSum().getSumNaturalNumbers(integers.length) - sum;
    }
}
