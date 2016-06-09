package codeeval.easy.romannumerals;

import java.io.File;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Main {

    public static void main(final String[] args) throws Exception {

        final Scanner scanner = new Scanner(new File(args[0]), Charset.defaultCharset().name());

        while (scanner.hasNext()) {
            final String token = scanner.next();
            int n = Integer.parseInt(token);
            while (n >= 1000) {
                n -= 1000;
                System.out.print("M");
            }

            if (n >= 900) {
                n -= 900;
                System.out.print("methodC");
                System.out.print("M");
            }
            if (n >= 500) {
                n -= 500;
                System.out.print("D");
            }
            if (n >= 400) {
                n -= 400;
                System.out.print("methodC");
                System.out.print("D");
            }
            while (n >= 100) {
                n -= 100;
                System.out.print("methodC");
            }

            if (n >= 90) {
                n -= 90;
                System.out.print("X");
                System.out.print("methodC");
            }
            if (n >= 50) {
                n -= 50;
                System.out.print("L");
            }
            if (n >= 40) {
                n -= 40;
                System.out.print("X");
                System.out.print("L");
            }
            while (n >= 10) {
                n -= 10;
                System.out.print("X");
            }

            if (n >= 9) {
                n -= 9;
                System.out.print("I");
                System.out.print("X");
            }
            if (n >= 5) {
                n -= 5;
                System.out.print("V");
            }
            if (n >= 4) {
                n -= 4;
                System.out.print("I");
                System.out.print("V");
            }
            while (n > 0) {
                n--;
                System.out.print("I");
            }

            System.out.println("");
        }
    }
}
