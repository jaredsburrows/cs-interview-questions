@SuppressWarnings("WrongPackageStatement") class Main4 {

    public static boolean isPalidrome(final int n) {
        final String temp = Integer.toString(n);
        return temp.equals(new StringBuilder(temp).reverse().toString());
    }

    public static void main(final String[] args) {

        int max = 0;
        for (int i = 999; i > 99; i--) {
            for (int j = 999; j > 99; j--) {
                final int tmp = i * j;
                if (isPalidrome(tmp) && tmp > max) {
                    max = tmp;
                    break;
                }
            }
        }
        System.out.print(max);
    }
}
