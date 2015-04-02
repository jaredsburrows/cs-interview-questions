package codeeval.easy.deltatime;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Calendar;

public class Main {
    public static void main(final String[] args) throws Exception {
        final BufferedReader buffer = new BufferedReader(new FileReader(new File(args[0])));

        /* Java has a problem with SimpleDateFormat formatting */
//        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());

        String line;
        while ((line = buffer.readLine()) != null) {
            final String[] words = line.trim().split(" ");
            final String[] time1 = words[0].split(":");
            final String[] time2 = words[1].split(":");

            /* Java has a problem with Calendar subtracting of hours */
            Calendar calendar1 = Calendar.getInstance();
            calendar1.set(Calendar.HOUR_OF_DAY, Integer.valueOf(time1[0]));
            calendar1.set(Calendar.MINUTE, Integer.valueOf(time1[1]));
            calendar1.set(Calendar.SECOND, Integer.valueOf(time1[2]));

            Calendar calendar2 = Calendar.getInstance();
            calendar2.set(Calendar.HOUR_OF_DAY, Integer.valueOf(time2[0]));
            calendar2.set(Calendar.MINUTE, Integer.valueOf(time2[1]));
            calendar2.set(Calendar.SECOND, Integer.valueOf(time2[2]));

            Calendar result = Calendar.getInstance();
            result.setTimeInMillis(Math.abs(calendar2.getTime().getTime() - calendar1.getTime().getTime()));

            System.out.printf("%02d:%02d:%02d\n", result.get(Calendar.HOUR_OF_DAY), result.get(Calendar.MINUTE), result.get(Calendar.SECOND));

//            System.out.println(simpleDateFormat.format(math.abs(simpleDateFormat.parse(words[1]).getTime() - simpleDateFormat.parse(words[0]).getTime())));

            /* Joda time - works but can't submit 3rd party libs */
//            DateTimeFormatter formatter = DateTimeFormat.forPattern("HH:mm:ss");
//
//            Period period = new Period(math.abs(formatter.parseDateTime(words[1]).getMillis() - formatter.parseDateTime(words[0]).getMillis()));
//
//            System.out.printf("%02d:%02d:%02d\n", period.getHours(), period.getMinutes(), period.getSeconds());
        }
    }
}
