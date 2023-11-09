package day03;

import java.util.Scanner;

public class C06_Ternary {
    public static void main(String[] args) {
        //kullanıcıdan bir sayı alınız
        //verılen sayının 3 veya daha cok bsmklı olup olmadıgını  ternary ile kontrol eden
        // ve yazdıran bir method olusturun
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz.");
        int sayi = input.nextInt();

        deneme(sayi);

        kontrolEt(sayi);



    }

    private static void deneme(int sayi) {
        System.out.println(sayi);
    }


    public static void kontrolEt(int sayi) {

        String kontrol= sayi>=100 ? "3 veya daha fazla basamaklı" : "3 basamaktan küçük.";
        System.out.println("kontrol = " + kontrol);

    }
}
