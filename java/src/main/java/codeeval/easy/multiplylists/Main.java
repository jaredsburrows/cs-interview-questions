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
        File inputFile = new File(args[0]);
        InputStream fileStream = new FileInputStream(inputFile);
        Reader inputReader = new InputStreamReader(fileStream, Charset.defaultCharset());
        BufferedReader buffer = new BufferedReader(inputReader);

        String line;
        while ((line = buffer.readLine()) != null) {
            String[] split = line.trim().split("\\|", -1);
            String[] left = split[0].split(" ", -1);
            String[] right = split[1].split(" ", -1);

            for (int i = 0; i < left.length; i++) {
                System.out.print(Integer.parseInt(left[i]) * Integer.parseInt(right[i + 1]) + " ");
            }

            System.out.println();
        }
    }
}
