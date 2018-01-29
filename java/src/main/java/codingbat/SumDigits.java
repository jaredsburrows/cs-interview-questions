package codingbat;

public final class SumDigits {
    public int sumDigits(int number) {
        if (number <= 0) {
            return 0;
        }

        final int lastDigit = number % 10;
        final int nextNumber = number / 10;

        return lastDigit + sumDigits(nextNumber);
    }
}
