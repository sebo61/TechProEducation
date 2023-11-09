package day02;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {
        //kullanıcıdan aldıgınız iki sayının karelerinin birbirine esıt olup olmadıgını kontrol eden bir method yazınız
        //yani alınan iki sayının kareleri esıt ıse true, degıl ıse false dondursun.

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 2 sayı giriniz..:");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        System.out.println("Girilen sayılar..:");

        boolean sonuc = numberControl(number1, number2);
        System.out.println("sonuc = " + sonuc);


    }

    private static boolean numberControl(int a, int b) {
        return ((a * a) == (b * b));
    }


}
