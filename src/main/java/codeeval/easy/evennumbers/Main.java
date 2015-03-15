package codeeval.easy.evennumbers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(final String[] args) throws Exception {
        final BufferedReader buffer = new BufferedReader(new FileReader(new File(args[0])));

        String line;
        while ((line = buffer.readLine()) != null) {
            System.out.println((Integer.valueOf(line.trim()) % 2 == 0) ? "1" : "0");
        }
    }
}
