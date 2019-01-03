package codeeval.easy.agedistribution;

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
            String string = line.trim();
            int age = Integer.parseInt(string);
            if (age < 0 || age > 100) {
                string = "This program is for humans";
            } else if (age >= 0 && age <= 2) {
                string = "Still in Mama's arms";
            } else if (age == 3 || age == 4) {
                string = "Preschool Maniac";
            } else if (age >= 5 && age <= 11) {
                string = "Elementary school";
            } else if (age >= 12 && age <= 14) {
                string = "Middle school";
            } else if (age >= 15 && age <= 18) {
                string = "High school";
            } else if (age >= 19 && age <= 22) {
                string = "College";
            } else if (age >= 23 && age <= 65) {
                string = "Working for the man";
            } else if (age >= 66 && age <= 100) {
                string = "The Golden Years";
            }

            System.out.println(string);
        }
    }
}
