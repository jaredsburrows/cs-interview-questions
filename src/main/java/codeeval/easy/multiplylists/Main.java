package codeeval.easy.multiplylists;

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
