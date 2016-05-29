package codeeval.easy.uniqueelements;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(final String[] args) throws Exception {

        final BufferedReader buffer = new BufferedReader(new InputStreamReader(new FileInputStream(new File(args[0])), Charset.defaultCharset()));

        String line;
        while ((line = buffer.readLine()) != null) {
            final String[] strings = line.trim().split(",");
            final Set<String> set = new LinkedHashSet<>();
            Collections.addAll(set, strings);
            final Object[] objects = set.toArray();
            String temp = "";
            for (Object string : objects) {
                temp += string + ",";
            }

            System.out.println((temp.lastIndexOf(",") != -1) ? temp.substring(0, temp.lastIndexOf(",")) : temp);
        }
    }
}
