package codeeval.easy.datarecovery;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class Main {
    public static void main(final String[] args) throws Exception {

        // For testing: "/Users/noname/repo/CS-Interview-Questions/src/main/java/codeeval/easy/datarecovery/input.txt"
        final BufferedReader buffer = new BufferedReader(new InputStreamReader(new FileInputStream(new File(args[0])), Charset.defaultCharset()));

        String line;
        while ((line = buffer.readLine()) != null) {
            final String[] words = line.trim().split(";");
            final String[] sentence = words[0].split(" ");
            final String[] numbers = words[1].split(" ");
            final String[] fixedWords = new String[sentence.length];

            // However, it was not implemented until 1998 and 2000
            // 2000 and was not However, implemented 1998 it until;9 8 3 4 1 5 7 2
            // [0] - 9
            // 1        2   3   4       5       6       7   8   9
            // However, it was not implemented until 1998 and 2000
            //  1       2      3    4       5           6           7    8      9
            // [2000] [and] [was] [not] [However,] [implemented] [1998] [it] [until]
            // [] [] [] [] [] [] [] [] [until]
            // I - O - D
            // 1 - 5 - 4
            // 2 - 8 - 6
            // 3 - 3 - 0
            // 4 - 4 - 0
            // 5 - 6 - 1
            // 6 - 9 - 3
            // 7 - 7 - 0
            // 8 - 2 - 6
            // 9 - 1 - 8
            // The first programming language
            // programming first The language;3 2 1
            // 1    2         3         4
            // The first programming language
            //      1        2    3     4
            // programming first The language
            // I - O
            // 1 - 3
            // 2 - 2
            // 3 - 1
            // 4 - 4

            for (final String number : numbers) {
                int position = Integer.parseInt(number) - 1;
                fixedWords[position] = sentence[position];
            }

            for (int i = 0; i < sentence.length; i++) {
                System.out.print(fixedWords[i] + " ");
            }

            System.out.println("");
        }
    }
}
