package codeeval.easy.capitalizewords;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(final String[] args) throws Exception {
        final BufferedReader buffer = new BufferedReader(new FileReader(new File(args[0])));

        String line;
        while ((line = buffer.readLine()) != null) {
            final String[] words = line.trim().split(" ");
            for (int i = 0; i < words.length; i++) {
                words[i] = Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1);
                System.out.print(words[i] + " ");
            }

            System.out.println("");
        }
    }
}
