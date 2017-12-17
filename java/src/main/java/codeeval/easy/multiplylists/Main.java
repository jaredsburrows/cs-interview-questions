package codeeval.easy.multiplylists;

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
            final String[] split = line.trim().split("\\|");
            final String[] left = split[0].split(" ");
            final String[] right = split[1].split(" ");

            for (int i = 0; i < left.length; i++) {
                System.out.print(Integer.parseInt(left[i]) * Integer.parseInt(right[i + 1]) + " ");
            }

            System.out.println("");
        }
    }
}
