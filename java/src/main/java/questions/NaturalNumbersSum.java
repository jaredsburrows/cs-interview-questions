package questions;

public final class NaturalNumbersSum {
    // Time - O(1), Space - O(1)
    public static int getSumNaturalNumbers(int number) {
        return (number * (number + 1)) / 2;
    }

    // Time - O(N), Space - O(1)
    public static int getSumNaturalNumbers2(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }

        return sum;
    }

    // Time - O(1), Space - O(1)
    public static int getSumNaturalNumbers(int[] numbers) {
        int length = numbers.length;
        return (length * (length + 1)) / 2;
    }
}
