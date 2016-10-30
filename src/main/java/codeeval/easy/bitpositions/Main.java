package codeeval.easy.bitpositions;

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
            final String[] strings = line.trim().split(",");
            final int number = Integer.parseInt(strings[0]);
            final int p1 = Integer.parseInt(strings[1]);
            final int p2 = Integer.parseInt(strings[2]);
            int check;
            boolean result1 = false;
            boolean result2 = true;

            for (int i = 32; i >= 0; i--) {
                check = number >> i;

                if ((check & 1) == 0) {
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

            if (result1 == result2) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}
