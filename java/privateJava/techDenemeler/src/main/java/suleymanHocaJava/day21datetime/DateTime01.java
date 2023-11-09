package suleymanHoca.day21datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime01 {
    public static void main(String[] args) {
        // anlık zamanı nasıl alırız.

       LocalTime myCurrentTime= LocalTime.now();
        System.out.println(myCurrentTime);
        // anlık zamanda bileşenler nasıl alınır.
        int hour=myCurrentTime.getHour();
        System.out.println(hour);
        //dakika
        int minute=myCurrentTime.getMinute();
        System.out.println(minute);
        System.out.println(myCurrentTime.getSecond());

        //nano saniye
        int nano=myCurrentTime.getNano();
        System.out.println(nano);
        //Gelecek ve geçmiş zaman
       LocalTime next= myCurrentTime.plusMinutes(23);
        System.out.println(next);
        //ileri geri
        System.out.println(myCurrentTime.minusSeconds(11).plusMinutes(23));

        //zaman formatı nasıl değiştirilir?
        // a 12 lik sistemde AM-PM yazar.
        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("hh:mm:ss a");
        String formattedMyCurrentTime= dtf1.format(myCurrentTime);
        System.out.println(formattedMyCurrentTime);
        //date formatı nasıl değiştirilir?

        LocalDate myCurrentDate=LocalDate.of(2023,9,11);
        System.out.println(myCurrentDate);
        //tarihi ay gün yıl şekline çeviriniz.
        DateTimeFormatter dtf2= DateTimeFormatter.ofPattern("MM/dd/yyyy");
       String formattedMyCurrentate= dtf2.format(myCurrentDate);
        System.out.println(formattedMyCurrentate );
        // tarihi gün ay isminin 3 harfi yıl 25/Aug/yil
        DateTimeFormatter dtf3= DateTimeFormatter.ofPattern("dd/MMM/yy");
        String formattedDate=dtf3.format(myCurrentDate);
        System.out.println(formattedDate);
        // 25/aUGUST/2022 gibi

        DateTimeFormatter dtf4= DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        String fDate=dtf4.format(myCurrentDate);
        System.out.println(fDate);

        //BAŞKA BİR zaman dilimindeki tarih ve zamanı nasıl alırız?

        //tokyoda ayın kaçı?

       LocalDate dateInTokyo= LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo);
       LocalDate dateTashKent= LocalDate.now(ZoneId.of("Asia/Tashkent"));
        System.out.println(dateTashKent);

        //Tokyoda saat kaç?
        LocalTime timeTokyo=LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeTokyo);
        // Koln'de saat kaç?

        LocalTime timeBerlin= LocalTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println(timeBerlin);
    }
}
