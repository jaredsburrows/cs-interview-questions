package codeeval.easy.uniqueelements;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public final class Main {
    public static void main(String[] args) throws Exception {
        File inputFile = new File(args[0]);
        InputStream fileStream = new FileInputStream(inputFile);
        Reader inputReader = new InputStreamReader(fileStream, Charset.defaultCharset());
        BufferedReader buffer = new BufferedReader(inputReader);

        String line;
        while ((line = buffer.readLine()) != null) {
            String[] strings = line.trim().split(",", -1);
            Set<String> set = new LinkedHashSet<>();
            Collections.addAll(set, strings);
            Object[] objects = set.toArray();
            StringBuilder temp = new StringBuilder();
            for (Object string : objects) {
                temp.append(string).append(",");
            }

            System.out.println(temp.lastIndexOf(",") != -1
                ? temp.substring(0, temp.lastIndexOf(","))
                : temp.toString());
        }
    }
}
