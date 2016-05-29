package codeeval.easy.themajorelement;

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
            final int[] ints = new int[100];
            final String[] intStrings = line.trim().split(",");
            int occurrence = -1;
            int number = -1;

            for (final String string : intStrings) {
                ints[Integer.parseInt(string)]++;
            }

            for (int i  = 0; i < ints.length; i++) {
                if (ints[i] > (intStrings.length / 2) && ints[i] > occurrence) {
                    occurrence = ints[i];
                    number = i;
                }
            }

            System.out.println(occurrence > 0 ? number : "None");
        }
    }
}
