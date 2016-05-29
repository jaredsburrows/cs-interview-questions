package codeeval.easy.hiddendigits;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class Main {
    public static void main(final String[] args) throws Exception {

        final BufferedReader buffer = new BufferedReader(new InputStreamReader(new FileInputStream(new File(args[0])), Charset.defaultCharset()));

        String line;
        while ((line = buffer.readLine()) != null) {
            final char[] charArray = line.trim().toCharArray();
            boolean empty = true;
            for (final char c : charArray) {
                if (Character.isDigit(c)) {
                    System.out.print(c);
                    empty = false;
                }

                if ((int) c >= 97 && (int) c <= 106) {
                    System.out.print(c - 97);
                    empty = false;
                }
            }

            if (empty) {
                System.out.print("NONE");
            }

            System.out.println("");
        }
    }
}
