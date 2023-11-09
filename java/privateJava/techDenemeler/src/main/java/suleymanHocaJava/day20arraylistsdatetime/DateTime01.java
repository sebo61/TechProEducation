package suleymanHoca.day20arraylistsdatetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class DateTime01 {
    public static void main(String[] args) {
        // içinde bulunduğmuz zaman dilimindeki tarih
        LocalDate myCurrentDate = LocalDate.now();
        System.out.println(myCurrentDate); //2023-06-29
        //tarihten istediğimiz bileşeni nasıl alırız?
        System.out.println(myCurrentDate.getMonthValue()); // 6 -sadece ay adı

        int yearValue = myCurrentDate.getYear();
        System.out.println(yearValue); //2013

        System.out.println(myCurrentDate.getDayOfMonth()); // 29

        //Aşağıdaki "Month"  bir Enum'dur.
        // Enum Java da sait değerleri (Ay isimleri, gün isimleri, ülke isimleri,gezegen isimleri) depolamak için kullanılır.
        Month monthName = myCurrentDate.getMonth();
        System.out.println(monthName); //JUNE
        //dayOfWeek bir enum'dır
        DayOfWeek dayName = myCurrentDate.getDayOfWeek();
        System.out.println(dayName);
        //bugünden 5 gün sonrası ve 1 yıl sonrası
        System.out.println(myCurrentDate.plusDays(5).plusYears(1));
        // 7 yıl geri gider.
        System.out.println(myCurrentDate.minusYears(7));
        //specific bir tarih objesi nasıl üretilir.
        LocalDate gokhanDayOfBirth = LocalDate.of(2010, 01, 23);
        boolean after = myCurrentDate.isAfter(gokhanDayOfBirth);
        System.out.println(after);
        //tar,hler eşit mi?
        boolean r3 = myCurrentDate.equals(gokhanDayOfBirth);
        System.out.println(r3);
        // example 1: kullanıcıdan aldığınız tarih geçmişe ait ise "geçersiz tarih girdiniz,
        // geleceğe ait ise "zamanı girebilirsiniz deyiniz."

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen sırasıyla yılı,ayı ve günü giriniz.");
        int year = input.nextInt();
        int mounth = input.nextInt();
        int day = input.nextInt();

        LocalDate currentDate = LocalDate.of(year, mounth, day);
        if (currentDate.isBefore(myCurrentDate)) {
            System.out.println("geçersiz tarih girdiniz");
        } else {
            System.out.println("Zamanı girebilirsiniz.");
        }
        System.out.println(myCurrentDate.lengthOfMonth());
        //example 2: Kullanıcının girdiği tarihin gün ismini bulan kodu yazınız.
        System.out.println("Lütfen sırasıyla yılı,ayı ve günü giriniz.");
        int y = input.nextInt();
        int m = input.nextInt();
        int d = input.nextInt();

        LocalDate date=LocalDate.of(y,m,d);
        System.out.println(date.getDayOfWeek());

    }
}
