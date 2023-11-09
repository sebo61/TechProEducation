package homework02;

import java.security.PublicKey;
import java.util.Random;
import java.util.Scanner;

public class Odev1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int randomUretilenSayi = randomNumber();
        System.out.println(randomUretilenSayi);
        System.out.println("Sayı tahmin oyununa hoş geldiniz:");
        int tahminSayisi = 0;
        int puan = 100;
        int devamMi = 1;
        do {
            if (tahminSayisi == 10) {
                System.out.println("Oyun hakkınız bitti. Devam etmek için 1'e, çıkış için başka bir sayıya basın");
                devamMi = input.nextInt();
                if (devamMi != 1) {
                    break;
                } else {
                    tahminSayisi = 0;
                    puan=100;
                }
            }
            System.out.print("Lütfen 1 ile 100 arası bir sayı tahmin ediniz." + "Kalan tahmin hakkınız=" + (10 - tahminSayisi) + "..:");
            int tahminEdilenSayi = input.nextInt();
            tahminSayisi++;

            if (tahminEdilenSayi < randomUretilenSayi) {

                System.out.println("Bilemediniz " + (10 - tahminSayisi) + " hakkınız kaldı. Daha büyük bir sayı giriniz.");
                puan -= 10;

            }
            if (tahminEdilenSayi > randomUretilenSayi) {
                System.out.println("Bilemediniz " + (10 - tahminSayisi) + " hakkınız kaldı. Daha küçük bir sayı giriniz.");
                puan -= 10;
            }
            if (tahminEdilenSayi == randomUretilenSayi) {
                System.out.println("Tebrikler " + tahminSayisi + ".tahminde buldunuz!");
                System.out.println("puanınız " + puan);
                System.out.println("Tekrar oynamak için 1'e, çıkmak için herhangi bir sayıya basınız.");
                devamMi = input.nextInt();
                if (devamMi == 1) {
                    randomUretilenSayi = randomNumber();
                    tahminSayisi = 0;
                    puan=100;

                } else {
                    break;
                }
            }

        } while (devamMi == 1);
    }
    public static int randomNumber() {
        int rnd = (int) (1 + Math.random() * 100);
        return rnd;
    }
}

