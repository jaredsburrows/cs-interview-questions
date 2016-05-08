package questions.math;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public class TrailingZeros {

    public static long getTrailingZeros(long number) {

        long numZeros = 0;

        while (number != 0) {
            long temp = number % 10;
            number /= 10;
            if (temp == 0) {
                numZeros++;
            } else {
                break;
            }
        }

        return numZeros;
    }
}
