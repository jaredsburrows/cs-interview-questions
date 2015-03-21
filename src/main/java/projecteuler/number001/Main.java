package projecteuler.number001;

public class Main {

    public static int getMultiplesOf3And5ON() {
        // O(N) solution
        int sum = 0;
        for (int i = 3; i < 1000; i++) {
            if ((i % 3) == 0 || (i % 5) == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static double getSumTerms(final int difference, final int number) {
        return (number * (number + difference)) / (difference * 2.0);
    }

    public static int getMultiplesOf3And5() {
        return (int) (getSumTerms(3, 999) + getSumTerms(5, 995) - getSumTerms(15, 990));
    }

    public static void main(final String[] args) {

        System.out.println(getMultiplesOf3And5ON());

        // O(1) solution
        // Sn   = (n/2) * (a1 + an)
        //      = ((an/a1)/2.0) * (a1 + an)
        //      = (an * (an + a1))/(a1 * 2.0)
        // LCM of 3 and 5 = 15
        // 3    - 999   ->  999 % 3     = 0
        // 5    - 995   ->  995 % 5     = 0
        // 15   - 990   ->  990 % 15    = 0

        System.out.println(getMultiplesOf3And5());
    }
}
