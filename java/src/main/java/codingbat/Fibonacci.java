package codingbat;

public final class Fibonacci {
    public long fibonacci(long number) {
        if (number < 2) {
            return number;
        }

        return fibonacci(number - 1) + fibonacci(number - 2);
    }
}
