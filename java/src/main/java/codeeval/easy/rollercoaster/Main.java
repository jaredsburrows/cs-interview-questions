package codeeval.easy.rollercoaster;

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
            char[] chars = line.trim().toCharArray();
            boolean upper = true;

            for (int i = 0; i < chars.length; i++) {
                if (Character.isLetter(chars[i])) {
                    chars[i] =
                        upper ? Character.toUpperCase(chars[i]) : Character.toLowerCase(chars[i]);
                    upper = !upper;
                }
                System.out.print(chars[i]);
            }
            System.out.println("");
        }
    }
}
