package codeeval.easy.calculatedistance;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(final String[] args) throws Exception {
        final BufferedReader buffer = new BufferedReader(new FileReader(new File(args[0])));

        String line;
        while ((line = buffer.readLine()) != null) {
            final String replaceLine = line.trim().replaceAll("\\(", "").replaceAll("\\)", "").replaceAll(",", "");
            final String[] strings = replaceLine.split(" ");

            final int x1 = Integer.valueOf(strings[0]);
            final int y1 = Integer.valueOf(strings[1]);
            final int x2 = Integer.valueOf(strings[2]);
            final int y2 = Integer.valueOf(strings[3]);

            System.out.println((int) Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
        }
    }
}
