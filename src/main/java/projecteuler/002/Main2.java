@SuppressWarnings("WrongPackageStatement")
class Main2 {

    public static void main(final String[] args) {

        long a = 1, b = 1, sum = 0;

        while (sum < 4000000) {
            long next = a + b;
            b = a;
            a = next;
            sum += next % 2 == 0 ? next : 0;
        }

        System.out.println(sum);
    }
}
