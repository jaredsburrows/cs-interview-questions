package codeeval.easy.themajorelement;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Find the major element in a sequence
 */
public class Main {
    public static void main(final String[] args) throws Exception {
        final BufferedReader buffer = new BufferedReader(new FileReader(new File(args[0])));

        String line;
        while ((line = buffer.readLine()) != null) {
            final int[] ints = new int[100];
            final String[] intStrings = line.trim().split(",");
            int occurrence = -1;
            int number = -1;

            for (final String string : intStrings) {
                ints[Integer.valueOf(string)]++;
            }

            for (int i  = 0; i < ints.length; i++) {
                if ((ints[i] > (intStrings.length / 2)) && (ints[i] > occurrence)) {
                    occurrence = ints[i];
                    number = i;
                }
            }

            System.out.println((occurrence > 0) ? number : "None");
        }
    }
}
