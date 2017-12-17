package codeeval.easy.deltatime;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.Calendar;

public final class Main {

    public static void main(String[] args) throws Exception {

        final File inputFile = new File(args[0]);
        final InputStream fileStream = new FileInputStream(inputFile);
        final Reader inputReader = new InputStreamReader(fileStream, Charset.defaultCharset());
        final BufferedReader buffer = new BufferedReader(inputReader);

        String line;
        while ((line = buffer.readLine()) != null) {
            final String[] words = line.trim().split(" ");
            final String[] time1 = words[0].split(":");
            final String[] time2 = words[1].split(":");

            /* Java has a problem with Calendar subtracting of hours */
            Calendar calendar1 = Calendar.getInstance();
            calendar1.set(Calendar.HOUR_OF_DAY, Integer.parseInt(time1[0]));
            calendar1.set(Calendar.MINUTE, Integer.parseInt(time1[1]));
            calendar1.set(Calendar.SECOND, Integer.parseInt(time1[2]));

            Calendar calendar2 = Calendar.getInstance();
            calendar2.set(Calendar.HOUR_OF_DAY, Integer.parseInt(time2[0]));
            calendar2.set(Calendar.MINUTE, Integer.parseInt(time2[1]));
            calendar2.set(Calendar.SECOND, Integer.parseInt(time2[2]));

            Calendar result = Calendar.getInstance();
            result.setTimeInMillis(
                Math.abs(calendar2.getTime().getTime() - calendar1.getTime().getTime()));

            System.out.printf("%02d:%02d:%02d\n", result.get(Calendar.HOUR_OF_DAY),
                result.get(Calendar.MINUTE),
                result.get(Calendar.SECOND));
        }
    }
}
