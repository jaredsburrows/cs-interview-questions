package coderbyte;

/**
 * https://www.coderbyte.com/editor/guest:First%20Factorial:Java
 */
public final class FirstFactorial {
    public static int FirstFactorial(int num) {
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }

        return fact;
    }
}
