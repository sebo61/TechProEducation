package day10ifstatements;

import java.util.Scanner;

public class IfStatements04 {
    public static void main(String[] args) {
                /*
             Example 1:Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu
                       asagidaki tabloya gore yazdiran kodu olusturunuz
                       0-4 ==> bebek
                       5-12 ==> cocuk
                       13-20 ==> genc
                       21-30 ==> yetiskin
                       30 ustu ==> Tanimlanmamis
                       Hata Mesaji olarak "Gecerli bir yas giriniz" yazdiriniz         */
        Scanner input = new Scanner(System.in);
        System.out.println("Yaşı giriniz.:");
        int age = input.nextInt();


        if (age < 0) {
            System.out.println("Geçerli bir yaş giriniz.");

        } else if (age < 5) {
            System.out.println("Bebek");
        } else if (age < 13) {
            System.out.println("Çocuk");

        } else if (age < 21) {
            System.out.println("Genç");
        } else if (age < 31) {
            System.out.println("Yetişkin");

        } else {
            System.out.println("Tanımlanmamış yaş");
        }
    }
}
/*
    Homework
    1)Kullanicidan alinan password 'pwd123!' oldugunda, verilen password'un dogru olup olmadigini kontrol eden
    //ve kullaniciya uygun mesaj veren kodu yaziniz

    2)Haftanin gün ismini verdiginizde kacinci gün oldugunu yazan kodu yaziniz
    //  Pazar ==> 1.gün , Pazartesi  ==> 2.gün  .....

    3)Ay sayisini verdiginizde ay ismini yazan kodu yaziniz
    //  1==> January, 2 ==> February .....

*/

