package codeeval.easy.lettercasepercentageratio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

public final class Main {
    public static void main(String[] args) throws Exception {
        final File inputFile = new File(args[0]);
        final InputStream fileStream = new FileInputStream(inputFile);
        final Reader inputReader = new InputStreamReader(fileStream, Charset.defaultCharset());
        final BufferedReader buffer = new BufferedReader(inputReader);

        String line;
        while ((line = buffer.readLine()) != null) {
            final char[] chars = line.trim().toCharArray();
            double length = chars.length;
            int lowerCaseCount = 0;
            int upperCaseCount = 0;

            for (char c : chars) {
                if (Character.isLowerCase(c)) {
                    lowerCaseCount++;
                } else {
                    upperCaseCount++;
                }
            }

            System.out.printf("lowercase: %.2f uppercase: %.2f\n", (lowerCaseCount / length) * 100,
                (upperCaseCount / length) * 100);
        }
    }
}
