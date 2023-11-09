package day04scannerwrapper;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        //kullanıcıdan alacap
        // ğınız 5 basamaklı bir sayının ilk 2 ve son 2 basamağındaki rakamların toplamını yazdıran bir kodu yazdırın.
        Scanner input = new Scanner(System.in);
        System.out.println("5 basamaklı sayıyı giriniz..:");
        int number = input.nextInt();
        System.out.println("sayı..:" + number);

        //%=>modulus
        //%10 her zaman birler basamağını verir.
        //tam sayıyı tam sayıya bölerseniz sonuc kesinlikle tam sayıdır.
        //java yuvarlama yapmaz.
        //bir tam sayıyı 10 a bölersek birler basamağını silmiş oluruz.
        //son rakamı al
        int birlerBasamagi=number%10;
        //sayı küçült
        number=number/10;
        //sondan 2. sayi
        int onlarBasamagi=number%10;
        //sayı küçült
        number=number/10;
        //sondan 3. sayi
        int yuzlerBasamagi=number%10;
        //sayı küçült
        number=number/10;
        //sondan 4. sayi
        int binlerBsamagi=number%10;
        //sayı küçült
        number=number/10;
        //5. basamaği
        int onbinlerBasamagi=number%10;

        int toplam=onbinlerBasamagi+binlerBsamagi+onlarBasamagi+birlerBasamagi;
        System.out.println(toplam);

        //homework 1: Kullanıcıdan aldığınız 3 tane sayının ortalamasını bulan kodu yazınız
        //homework 2 kullanıcıdan aldığınız 3 basamaklı sayının rakamları toplamını bulunuz.


    }
}
