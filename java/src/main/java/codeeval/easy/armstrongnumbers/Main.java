package codeeval.easy.armstrongnumbers;

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
            String string = line.trim();
            int length = string.length();
            int value = Integer.parseInt(string);
            double originalValue = value;
            double eval = 0;
            while (value != 0) {
                int temp = value % 10;
                value /= 10;
                eval += Math.pow(temp, length);
            }

            System.out.println(Double.compare(originalValue, eval) == 0 ? "True" : "False");
        }
    }
}
