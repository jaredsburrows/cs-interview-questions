package projecteuler;

public class Number003 {

    public static boolean isPrime(final long n) {
        if ((n > 2) && (n & 1) == 0) {
            return false;
        }

        for (int i = 3; (i * i) <= n; i += 2) {
            if ((n % i) == 0) {
                return false;
            }
        }

        return true;
    }

    public static long getLargestPrimeFactor(final long number) {
        for (long i = (long) Math.sqrt(number) + 1; i > 0; i -= 2) {
            if (((number % i) == 0) && isPrime(i)) {
                return i;
            }
        }

        return -1;
    }
}
