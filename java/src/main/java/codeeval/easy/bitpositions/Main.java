package codeeval.easy.bitpositions;

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
            String[] strings = line.trim().split(",", -1);
            int number = Integer.parseInt(strings[0]);
            int p1 = Integer.parseInt(strings[1]);
            int p2 = Integer.parseInt(strings[2]);
            int check;
            boolean result1 = false;
            boolean result2 = true;

            for (int i = 32; i >= 0; i--) {
                check = number >> i;

                if ((check & 1) == 0) {
                    if (i == p1 - 1) {
                        result1 = false;
                    }
                    if (i == p2 - 1) {
                        result2 = false;
                    }
                } else {
                    if (i == p1 - 1) {
                        result1 = true;
                    }
                    if (i == p2 - 1) {
                        result2 = true;
                    }
                }
            }

            if (result1 == result2) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}
