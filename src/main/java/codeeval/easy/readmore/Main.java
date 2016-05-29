package codeeval.easy.readmore;

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
            String string = line.trim();

            if (string.length() > 55) {
                string = string.substring(0, 40);
                final int lastIndex = string.lastIndexOf(" ") + 1;
                string = string.substring(0, (lastIndex == 0) ? 40 : lastIndex).trim() + "... <Read More>";
            }

            System.out.println(string);
        }
    }
}
