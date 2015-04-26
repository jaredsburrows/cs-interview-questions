package projecteuler.number2;

public class Number2 {

    public long getEvenFibonacciNumbers(long n) {
        long a = 1, b = 1, sum = 0;

        while (sum < n) {
            long next = a + b;
            b = a;
            a = next;
            sum += (next % 2) == 0 ? next : 0;
        }

        return sum;
    }
}
