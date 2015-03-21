package codeeval.easy.lowestuniquenumber;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(final String[] args) throws Exception {
//        final BufferedReader buffer = new BufferedReader(new FileReader(new File(args[0])));
        final BufferedReader buffer = new BufferedReader(new FileReader(new File("/Users/noname/repo/CS-Interview-Questions/src/main/java/codeeval/easy/lowestuniquenumber/input.txt")));

        String line;
        while ((line = buffer.readLine()) != null) {
            final String[] numbers = line.trim().split(" ");
            int[] counts = new int[numbers.length];

            for (final String string : numbers) {
                counts[Integer.valueOf(string)]++;
            }

            for (int i = 0; i < numbers.length; i++) {
                System.out.print(i + " ");
            }
            System.out.println("");

            for (int i = 0; i < numbers.length; i++) {
                System.out.print(counts[i] + " ");
            }
            System.out.println("");

            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i] + " ");
            }

//            int min = numbers.length;
//            int number = -1;
//
//            for (int i = 0; i < numbers.length; i++) {
//                if (counts[i] != 0 && counts[i] < min) {
//                    min = counts[i];
//                    number = i;
//                }
//            }

//            System.out.println(numbers[number]);
            System.out.println("");
            System.out.println("");

        }
    }
}
