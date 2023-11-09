package day23;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExp {
    public static void main(String[] args) {
        LocalDateTime myDate = LocalDateTime.now();

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH:mm");
        String saatDakika = dtf1.format(myDate);
        System.out.println(saatDakika);
        //
        LocalDate myDate1 = LocalDate.of(2023, 06, 11);
        System.out.println(myDate1);

        //ay gün yıl

        DateTimeFormatter formattedDate = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        String dtf2 = formattedDate.format(myDate1);
        System.out.println(dtf2);

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern(("dd/MMM/yyyy"));
        String dateFormatted = dtf3.format(myDate1);
        System.out.println(dateFormatted);

        LocalDate timeTokyo = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeTokyo);

       LocalTime timeLocalTokyo=LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeLocalTokyo);

        LocalDateTime timeDateTokyo=LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm");
       String tokyoTime=dtf.format(timeDateTokyo);
        System.out.println(tokyoTime);

    }

}
