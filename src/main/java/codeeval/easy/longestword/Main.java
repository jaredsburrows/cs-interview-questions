package codeeval.easy.longestword;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

public final class Main {

    public static void main(final String[] args) throws Exception {

        final File inputFile = new File(args[0]);
        final InputStream fileStream = new FileInputStream(inputFile);
        final Reader inputReader = new InputStreamReader(fileStream, Charset.defaultCharset());
        final BufferedReader buffer = new BufferedReader(inputReader);

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
