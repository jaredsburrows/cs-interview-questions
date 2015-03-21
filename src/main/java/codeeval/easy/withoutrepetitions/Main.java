package codeeval.easy.withoutrepetitions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(final String[] args) throws Exception {
        final BufferedReader buffer = new BufferedReader(new FileReader(new File(args[0])));

        String line;
        while ((line = buffer.readLine()) != null) {
            System.out.println(line.trim().replaceAll("(.)\\1+", "$1"));
        }
    }
}
