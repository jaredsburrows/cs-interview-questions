package codeeval.easy.longestword;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(final String[] args) throws Exception {
        final BufferedReader buffer = new BufferedReader(new FileReader(new File(args[0])));

        String line;
        while ((line = buffer.readLine()) != null) {
            final String[] split = line.trim().split(" ");
            int maxLength = 0;
            String word = "";

            for (final String string : split) {
                int length = string.length();
                if (length > maxLength) {
                    maxLength = length;
                    word = string;
                }
            }

            System.out.println(word);
        }
    }
}
