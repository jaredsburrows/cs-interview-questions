package codeeval.easy.roadtrip;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(final String[] args) throws Exception {

        final File inputFile = new File(args[0]);
        final InputStream fileStream = new FileInputStream(inputFile);
        final Reader inputReader = new InputStreamReader(fileStream, Charset.defaultCharset());
        final BufferedReader buffer = new BufferedReader(inputReader);

        String line;
        while ((line = buffer.readLine()) != null) {
            final List<Integer> integerList = new ArrayList<>();
            final String[] intStrings = line.trim().split(";");
            for (final String string : intStrings) {
                integerList.add(Integer.valueOf(string.split(",")[1]));
            }

            Collections.sort(integerList);

            System.out.print(integerList.get(0) + ",");
            for (int i = 0; i < integerList.size(); i++) {
                if (i + 1 != integerList.size()) {
                    System.out.print(integerList.get(i + 1) - integerList.get(i));
                }

                System.out.print(i + 2 < integerList.size() ? "," : "");
            }

            System.out.println("");
        }
    }
}
