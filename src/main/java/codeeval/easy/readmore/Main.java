package codeeval.easy.readmore;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(final String[] args) throws Exception {
        final BufferedReader buffer = new BufferedReader(new FileReader(new File(args[0])));

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
