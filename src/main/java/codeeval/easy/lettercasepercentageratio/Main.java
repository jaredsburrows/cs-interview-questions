package codeeval.easy.lettercasepercentageratio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(final String[] args) throws Exception {
        final BufferedReader buffer = new BufferedReader(new FileReader(new File(args[0])));

        String line;
        while ((line = buffer.readLine()) != null) {
            final char[] chars = line.trim().toCharArray();
            double length = chars.length;
            int lowerCaseCount = 0;
            int upperCaseCount = 0;

            for (char c : chars) {
                if (Character.isLowerCase(c)) {
                    lowerCaseCount++;
                } else {
                    upperCaseCount++;
                }
            }

            System.out.printf("lowercase: %.2f uppercase: %.2f\n", (lowerCaseCount / length) * 100, (upperCaseCount / length) * 100);
        }
    }
}
