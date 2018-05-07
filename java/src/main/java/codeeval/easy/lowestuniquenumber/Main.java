package codeeval.easy.lowestuniquenumber;

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
            final String[] numbers = line.trim().split(" ", -1);
            int[] counts = new int[numbers.length];

            for (String string : numbers) {
                counts[Integer.parseInt(string)]++;
            }

            for (int i = 0; i < numbers.length; i++) {
                System.out.print(i + " ");
            }
            System.out.println("");

            for (int i = 0; i < numbers.length; i++) {
                System.out.print(counts[i] + " ");
            }
            System.out.println("");

            for (String number : numbers) {
                System.out.print(number + " ");
            }

            System.out.println("");
            System.out.println("");
        }
    }
}
