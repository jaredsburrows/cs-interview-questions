package codeeval.easy.rollercoaster;

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
            char[] chars = line.trim().toCharArray();
            boolean upper = true;

            for (int i = 0; i < chars.length; i++) {
                if (Character.isLetter(chars[i])) {
                    chars[i] = upper ? Character.toUpperCase(chars[i]) : Character.toLowerCase(chars[i]);
                    upper = !upper;
                }
                System.out.print(chars[i]);
            }
            System.out.println("");
        }
    }
}
