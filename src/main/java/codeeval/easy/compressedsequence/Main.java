package codeeval.easy.compressedsequence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/**
 * Write a program that compresses a sequence of numbers
 */
public class Main {
    public static void main(final String[] args) throws Exception {

        final BufferedReader buffer = new BufferedReader(new InputStreamReader(new FileInputStream(new File(args[0])), Charset.defaultCharset()));

        String line;
        while ((line = buffer.readLine()) != null) {
            final String[] intStrings = line.trim().split(" ");
            int count = 0;
            int length = intStrings.length;
            for (int i = 0; i < length; i++) {
                if ((i + 1) != length && intStrings[i].equals(intStrings[i + 1])) {
                    ++count;
                } else {
                    ++count;
                    System.out.print(count + " " + intStrings[i] + " ");
                    count = 0;
                }
            }

            System.out.println("");
        }
    }
}
