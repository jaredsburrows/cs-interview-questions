package codeeval.easy.evennumbers;

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
            System.out.println((Integer.parseInt(line.trim()) % 2 == 0) ? "1" : "0");
        }
    }
}
