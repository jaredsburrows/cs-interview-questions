package codeeval.easy.sumofdigits;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) throws Exception {
        final Scanner scanner = new Scanner(new File(args[0]));
        while (scanner.hasNext()) {
            int sum = 0, n = scanner.nextInt();
            while (n != 0) {
                sum = sum + (n % 10);
                n = n / 10;
            }
            System.out.println(sum);
        }
    }
}

