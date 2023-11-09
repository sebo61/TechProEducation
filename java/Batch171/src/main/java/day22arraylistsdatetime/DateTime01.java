package day22arraylistsdatetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class DateTime01 {
    public static void main(String[] args) {
        //içinde bulunduğunuz zman dilimindeki tarihi nasıl bulabilirizin tarihi.
        LocalDate myCurrentDate = LocalDate.now();
//tarihten istediğiniz bir bileşeni nasıl alırız.
        int mountValue= myCurrentDate.getMonthValue();

        System.out.println(mountValue);

        int yearValue=myCurrentDate.getYear();
        System.out.println(yearValue);//2023

        int dayValue= myCurrentDate.getDayOfMonth();
        System.out.println(dayValue);

        // month bieenum dır. enum javada sab,t değerleri (ay isimleri, gün isimleri, ülkedeki şehir isimleri)
        // gibi dataları depolamak için kullanılır.

        Month monthName= myCurrentDate.getMonth();
        System.out.println(monthName);

        DayOfWeek dayName= myCurrentDate.getDayOfWeek();
        System.out.println(dayName);

        //ileriki tarihe nasıl gidilir.
        System.out.println(myCurrentDate.plusDays(5).plusMonths(5).plusYears(2));

        //geçmiş taihe gitmek.

        System.out.println(myCurrentDate.minusYears(7).minusMonths(10).minusDays(10));

        //specific tarih objesi nasıl oluşturulur.
        LocalDate date1= LocalDate.of(1980,8,10);
        LocalDate date2= LocalDate.of(1990,8,10);


        //bir tarihin başka bir tarihten sonra olup olmadığını nasıl kontrol ederiz.

        boolean r1= date1.isAfter(date2);
        System.out.println(r1); //false
        // bir tarihin bakşa bir tarihten öne olup olmadığı


        LocalDate date3= LocalDate.of(1980,8,10);
        LocalDate date4= LocalDate.of(1990,8,10);

        boolean r5=date3.isBefore(date4);

        System.out.println(r5);

        // bir tarihin bir tarihe eşit olup olmadığı

        boolean equal=date3.isEqual(date4);
        System.out.println(equal);

        //Example 1: Kullanicidan aldiginiz tarih gecmise ait ise "Gecersiz tarih girdiniz" mesaji veriniz.
        //           Kullanicidan aldiginiz tarih gelecege ait ise "Zamani girebilirsiniz" deyiniz.

        Scanner input= new Scanner(System.in);
        System.out.println("Please enter year , month and day number in the given order");
        int year= input.nextInt();
        int month= input.nextInt();
        int day= input.nextInt();

        LocalDate givenDate= LocalDate.of(year,month,day);

        if (givenDate.isBefore(LocalDate.now())){
            System.out.println(givenDate+ " invalid date");

        }else {
            System.out.println("Enter a time for the ticket");

        }




    }
}
