package codeeval.easy.calculatedistance;

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
            String replaceLine =
                line.trim().replaceAll("\\(", "").replaceAll("\\)", "").replaceAll(",", "");
            String[] strings = replaceLine.split(" ", -1);

            int x1 = Integer.parseInt(strings[0]);
            int y1 = Integer.parseInt(strings[1]);
            int x2 = Integer.parseInt(strings[2]);
            int y2 = Integer.parseInt(strings[3]);

            System.out.println((int) Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
        }
    }
}
