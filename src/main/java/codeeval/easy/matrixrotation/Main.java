package codeeval.easy.matrixrotation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

public class Main {

    public static void main(final String[] args) throws Exception {

        final File inputFile = new File(args[0]);
        final InputStream fileStream = new FileInputStream(inputFile);
        final Reader inputReader = new InputStreamReader(fileStream, Charset.defaultCharset());
        final BufferedReader buffer = new BufferedReader(inputReader);

        String line;
        while ((line = buffer.readLine()) != null) {
            final String[] strings = line.trim().split(" ");
            int length = strings.length / 2;
            char[][] originalMatrix = new char[length][length];
            char[][] rotatedMatrix = new char[length][length];

            for (int i = 0; i < length; i++) {
                for (int j = 0; j < length; j++) {
                    originalMatrix[i][j] = strings[i].charAt(0);
                    System.out.print(strings[i].charAt(0));
                }
            }

            for (int i = 0; i < length; i++) {
                for (int j = 0; j < length; j++) {
                    rotatedMatrix[i][j] = rotatedMatrix[length - j - 1][i];
                    System.out.print(rotatedMatrix[i][j] + "");
                }
            }

            System.out.println("");
        }
    }
}
