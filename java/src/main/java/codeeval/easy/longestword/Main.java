package codeeval.easy.longestword;

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
            String[] split = line.trim().split(" ", -1);
            int maxLength = 0;
            String word = "";

            for (String string : split) {
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
