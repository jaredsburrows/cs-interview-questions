package codeeval.easy.wordtodigit;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

public class Main {

    public static void main(final String[] args) throws Exception {

        final File inputFile = new File(args[0]);
        final InputStream fileStream = new FileInputStream(inputFile);
        final Reader inputReader = new InputStreamReader(fileStream, Charset.defaultCharset());
        final BufferedReader buffer = new BufferedReader(inputReader);

        String line;
        while ((line = buffer.readLine()) != null) {
            final String[] lineArray = line.split(";");
            if (lineArray.length > 0) {
                for (final String element : lineArray) {
                    int n = -1;
                    if ("zero".equals(element)) {
                        n = 0;
                    }
                    if ("one".equals(element)) {
                        n = 1;
                    }
                    if ("two".equals(element)) {
                        n = 2;
                    }
                    if ("three".equals(element)) {
                        n = 3;
                    }
                    if ("four".equals(element)) {
                        n = 4;
                    }
                    if ("five".equals(element)) {
                        n = 5;
                    }
                    if ("six".equals(element)) {
                        n = 6;
                    }
                    if ("seven".equals(element)) {
                        n = 7;
                    }
                    if ("eight".equals(element)) {
                        n = 8;
                    }
                    if ("nine".equals(element)) {
                        n = 9;
                    }

                    System.out.print(n);
                }
            }

            System.out.println("");
        }
    }
}
