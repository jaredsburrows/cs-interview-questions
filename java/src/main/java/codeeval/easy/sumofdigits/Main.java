package codeeval.easy.sumofdigits;

import java.io.File;
import java.nio.charset.Charset;
import java.util.Scanner;

public final class Main {
    public static void main(String[] args) throws Exception {
        final Scanner scanner = new Scanner(new File(args[0]), Charset.defaultCharset().name());

        while (scanner.hasNext()) {
            int sum = 0;
            int number = scanner.nextInt();
            while (number != 0) {
                sum = sum + (number % 10);
                number = number / 10;
            }
            System.out.println(sum);
        }
    }
}

