@SuppressWarnings("WrongPackageStatement")
class Main3 {

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

    public static void main(final String[] args) {

        final long number = 600851475143L;

        for (long i = (long)Math.sqrt(number) + 1; i > 0; i -= 2) {
            if (((number % i) == 0) && isPrime(i)) {
                System.out.println(i);
                break;
            }
        }
    }
}
