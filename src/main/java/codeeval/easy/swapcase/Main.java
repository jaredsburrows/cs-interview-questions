package codeeval.easy.swapcase;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(final String[] args) throws Exception {
        final BufferedReader buffer = new BufferedReader(new FileReader(new File(args[0])));

        String line;
        while ((line = buffer.readLine()) != null) {
            char[] chars = line.trim().toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (Character.isLetter(chars[i])) {
                    chars[i] = Character.isUpperCase(chars[i]) ? Character.toLowerCase(chars[i]) : Character.toUpperCase(chars[i]);
                }
                System.out.print(chars[i]);
            }
            System.out.println("");
        }
    }
}
