package codeeval.easy.armstrongnumbers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(final String[] args) throws Exception {
        final BufferedReader buffer = new BufferedReader(new FileReader(new File(args[0])));

        String line;
        while ((line = buffer.readLine()) != null) {
            final String string = line.trim();
            int length = string.length();
            int value = Integer.valueOf(string);
            int originalValue = value;
            int eval = 0;
            while (value != 0) {
                int temp = value % 10;
                value /= 10;
                eval += Math.pow(temp, length);
            }

            System.out.println((originalValue == eval) ? "True" : "False");
        }
    }
}
