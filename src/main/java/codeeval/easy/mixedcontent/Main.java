package codeeval.easy.mixedcontent;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(final String[] args) throws Exception {
        final BufferedReader buffer = new BufferedReader(new FileReader(new File(args[0])));

        String line;
        while ((line = buffer.readLine()) != null) {
            final String[] strings = line.trim().split(",");
            String numbers = "";
            String fruits = "";
            boolean printFruit = false;
            boolean printNumbers = false;
            for (final String string : strings) {
                if (Character.isDigit(string.toCharArray()[0])) {
                    numbers += string + ",";
                    printFruit = true;
                } else {
                    fruits += string + ",";
                    printNumbers = true;
                }
            }

            if (printFruit) {
                System.out.print(fruits.substring(0, fruits.length() - 1));
            }

            if (printFruit && printNumbers) {
                System.out.print("|");
            }

            if (printNumbers) {
                System.out.print(numbers.substring(0, numbers.length() - 1));
            }

            System.out.println("");
        }
    }
}
