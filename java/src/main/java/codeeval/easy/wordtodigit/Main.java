package codeeval.easy.wordtodigit;

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
            String[] lineArray = line.split(";", -1);
            if (lineArray.length > 0) {
                for (String element : lineArray) {
                    int number = -1;
                    if ("zero".equals(element)) {
                        number = 0;
                    }
                    if ("one".equals(element)) {
                        number = 1;
                    }
                    if ("two".equals(element)) {
                        number = 2;
                    }
                    if ("three".equals(element)) {
                        number = 3;
                    }
                    if ("four".equals(element)) {
                        number = 4;
                    }
                    if ("five".equals(element)) {
                        number = 5;
                    }
                    if ("six".equals(element)) {
                        number = 6;
                    }
                    if ("seven".equals(element)) {
                        number = 7;
                    }
                    if ("eight".equals(element)) {
                        number = 8;
                    }
                    if ("nine".equals(element)) {
                        number = 9;
                    }

                    System.out.print(number);
                }
            }

            System.out.println();
        }
    }
}
