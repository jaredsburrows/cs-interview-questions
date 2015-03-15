package codeeval.easy.multiplylists;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(final String[] args) throws Exception {
        final BufferedReader buffer = new BufferedReader(new FileReader(new File(args[0])));

        String line;
        while ((line = buffer.readLine()) != null) {
            final String[] split = line.trim().split("\\|");
            final String[] left = split[0].split(" ");
            final String[] right = split[1].split(" ");

            for (int i = 0; i < left.length; i++) {
                System.out.print(Integer.valueOf(left[i]) * Integer.valueOf(right[i + 1]) + " ");
            }

            System.out.println("");
        }
    }
}
