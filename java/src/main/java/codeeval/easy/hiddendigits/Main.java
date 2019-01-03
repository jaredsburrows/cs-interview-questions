package codeeval.easy.hiddendigits;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

public final class Main {
    public static void main(String[] args) throws Exception {
        File inputFile = new File(args[0]);
        InputStream fileStream = new FileInputStream(inputFile);
        Reader inputReader = new InputStreamReader(fileStream, Charset.defaultCharset());
        BufferedReader buffer = new BufferedReader(inputReader);

        String line;
        while ((line = buffer.readLine()) != null) {
            char[] charArray = line.trim().toCharArray();
            boolean empty = true;
            for (char c : charArray) {
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

            System.out.println();
        }
    }
}
