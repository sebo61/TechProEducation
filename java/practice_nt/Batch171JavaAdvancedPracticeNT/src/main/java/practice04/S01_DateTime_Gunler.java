package practice04;

import java.sql.SQLOutput;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class S01_DateTime_Gunler {
    public static void main(String[] args) {


    /*
        Kullanıcıdan alınan bir tarihin haftanın hangi gününe denk geldiğini bulan bir program yazmanız isteniyor.
        Kullanıcıdan yıl, ay ve gün bilgilerini alarak, tarihin hangi gün olduğunu bulan bir Java programı yazın.
        Sonuç olarak, tarihin haftanın hangi gününe denk geldiğini Türkçe olarak ekrana yazdırın.
    */
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir tarihi yıl,ay ve gün bilgisini sayısal giriniz.");
        int yil = input.nextInt();
        int ay = input.nextInt();
        int gun = input.nextInt();

        LocalDate tarih = LocalDate.of(yil, ay, gun);
        String haftaninGunu = tarih.getDayOfWeek().name();
        System.out.println(haftaninGunu);
        switch (haftaninGunu){
            case "MONDAY":
                System.out.println("girdiğiniz tarih Pazartesi");
                break;
            case "TUESDAY":
                System.out.println("girdiğiniz tarih Salı");
                break;
                case "WEDNESDAY":
                System.out.println("girdiğiniz tarih Çarşamba");
                break;
                case "THURSDAY":
                System.out.println("girdiğiniz tarih Perşembe");
                break;
                case "FRIDAY":
                System.out.println("girdiğiniz tarih Cuma");
                break;
                case "SATURDAY":
                System.out.println("girdiğiniz tarih Cumartesi");
                break;
                case "SUNDAY":
                System.out.println("girdiğiniz tarih Pazar");
                break;


        }

    }
}
