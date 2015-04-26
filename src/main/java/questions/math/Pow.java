package questions.math;

public class Pow {

    public long pow(int x, int n) {
        if (n < 0) {
            return 0;
        }

        long product = x;

        for (int i = 1; i < n; i++) {
            product *= x;
        }

        return product;
    }

}
