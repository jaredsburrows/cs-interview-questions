package codeeval.easy.roadtrip;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(final String[] args) throws Exception {
        final BufferedReader buffer = new BufferedReader(new FileReader(new File(args[0])));

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
                if ((i + 1) != integerList.size()) {
                    System.out.print(integerList.get(i + 1) - integerList.get(i));
                }

                System.out.print(((i + 2) < integerList.size()) ? "," : "");
            }

            System.out.println("");
        }
    }
}
