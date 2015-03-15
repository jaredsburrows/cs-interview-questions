package codeeval.easy.bitpositions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(final String[] args) throws Exception {
        final BufferedReader buffer = new BufferedReader(new FileReader(new File(args[0])));

        String line;
        while ((line = buffer.readLine()) != null) {
            final String[] strings = line.trim().split(",");
            final int number = Integer.valueOf(strings[0]);
            final int p1 = Integer.valueOf(strings[1]);
            final int p2 = Integer.valueOf(strings[2]);
            int k;
            boolean result1 = false;
            boolean result2 = true;

            for (int i = 32; i >= 0; i--) {
                k = number >> i;

                if ((k & 1) == 0) {
                    if (i == p1 - 1) {
                        result1 = false;
                    }
                    if (i == p2 - 1) {
                        result2 = false;
                    }
                } else {
                    if (i == p1 - 1) {
                        result1 = true;
                    }
                    if (i == p2 - 1) {
                        result2 = true;
                    }
                }
            }

            System.out.println((result1 == result2) ? "true" : "false");
        }
    }
}
