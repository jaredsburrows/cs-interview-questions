package projecteuler;

public final class Number003 {
    public static boolean isPrime(long number) {
        if (number > 2 && (number & 1) == 0) {
            return false;
        }

        for (int i = 3; (i * i) <= number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static long getLargestPrimeFactor(long number) {
        for (long i = (long) Math.sqrt(number) + 1; i > 0; i -= 2) {
            if ((number % i) == 0 && isPrime(i)) {
                return i;
            }
        }

        return -1;
    }
}
