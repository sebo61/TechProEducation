package day03;

import java.util.Scanner;

public class C04_NestedIf {
    public static void main(String[] args) {
            /*
        Kullanıcıdan sisteme bir numara girmesini isteyin.

        Eger numara sıfırdan küçükse, konsolda "Negatif Sayı" yazdırın.

        Degilse, 10'dan küçük olup olmadığına bakın. 10'dan küçükse konsola "Rakam" yazdırın,
        10'dan büyük veya eşitse konsola "Pozitif Sayı" yazdırın.

    */
        Scanner input = new Scanner(System.in);
        System.out.println("Bir numara giriniz.");

        int number = input.nextInt();

        if (number<0){
            System.out.println("Negatif sayı");

        }else {
            if (number<10){
                System.out.println("rakam");

            }else {
                System.out.println("pozitif sayı");
            }


        }
    }
}
