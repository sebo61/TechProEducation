package guessthenumber;
import java.util.Random;
import java.util.Scanner;
public class GuessNumber {
    static Scanner scn = new Scanner(System.in);
    static int yeniden;
    public static void main(String[] args) {
          /*
        Amaç:
        Oyuncudan 1 ile 100 arasında bir sayı tahmini alarak rastgele bir sayıyı bulmaya çalışması istenir.
        Oyuncuya her tahminde doğru sayıya yaklaşıp yaklaşmadığına dair ipuçları verilir ve oyuncuya 10 tahmin hakkı tanınır.
        Yönergeler:
        - Oyuncuya "1-100 arası bir sayı tahmini giriniz" mesajı gösterilir.
        - Oyuncu bir sayı girişi yapar.
        - Oyuncunun tahmini, rastgele seçilen sayıya göre kontrol edilir:
            - Tahmin doğru ise, "Tebrikler, X. tahminde sayıyı buldunuz!" mesajı gösterilir.
              Ardından oyuncunun puanı hesaplanır ve mesajı gösterilir ve "Puanınız: X"
              "Tekrar oynamak için 1'e, çıkmak için herhangi bir sayıya basın." mesajı gösterilir.
            - Tahmin, sayıdan küçük ise, "Bilemediniz, tahmin için X hakkınız kaldı! Daha büyük bir sayı giriniz:" mesajı gösterilir.
            - Tahmin, sayıdan büyük ise, "Bilemediniz, tahmin için X hakkınız kaldı! Daha küçük bir sayı giriniz:" mesajı gösterilir.
            - Oyuncuya 10 tahmin hakkı verilir. Oyuncu 10 tahmin hakkını da kullanırsa,
              "Hakkınız bitti, oyunu kaybettiniz. Tekrar oynamak için 1'e, çıkmak için herhangi bir sayıya basın."
              mesajı gösterilir.
            - Oyuncu 1'e basarsa, oyun yeniden başlatılır ve yeni bir rastgele sayı seçilir.
            - Oyuncu herhangi bir sayıya basarsa, oyun sona erer ve program sonlanır.
     */
        Random rd = new Random();
        int randomNum = rd.nextInt(100) + 1;

        int puan = 1000;
        int counter = 1;
        do {
            if (counter == 10) {
                System.out.println("Hakkınız bitti, oyunu kaybettiniz. Tekrar oynamak için 1'e, çıkmak için herhangi bir sayıya basın:");
                yeniden = scn.nextInt();
                if (yeniden != 1) {
                    System.out.println("Program sonlandirilmistir.");
                    break;
                } else {
                    counter = 1;
                }
            }
            System.out.print("Lütfen 1-100 arasi bir sayi tahmini girin:");
            int num = scn.nextInt();
            if (num > randomNum) {
                System.out.println("Bilemediniz, tahmin için " + (10 - counter) + " hakkınız kaldı! Daha küçük bir sayı girin:");
                counter++;
            } else if (num < randomNum) {
                System.out.println("Bilemediniz, tahmin için " + (10 - counter) + " hakkınız kaldı! Daha büyük bir sayı girin:");
                counter++;
            } else if (num == randomNum) {
                puan = puan - (counter * 10);
                System.out.println("Tebrikler," + counter + ".tahminde sayıyı buldunuz! Puaniniz:" + puan);
                System.out.print("Tekrar oynamak için 1'e, çıkmak için herhangi bir sayıya basın:");
                yeniden = scn.nextInt();
                if (yeniden != 1) {
                    System.out.println("Program sonlandirilmistir.");
                    break;
                } else {
                    counter = 1;
                }
            }
        } while (true);
    }
}
