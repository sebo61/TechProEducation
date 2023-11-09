package day10ifstatements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NestedIf03 {
    public static void main(String[] args) {
         /*
                    Password'un ilk harfi buyuk harf ise
                    'A' olursa "gecerli password" yazdirin degilse "gecersiz password" yazdirin
                    Adana ==> Gecerli

                    Passwordun ilk harfi kucuk harf ise
                    'z' olursa "gecerli password" yazdirin degilse "gecersiz password" yazdirin
                    zehirli ==> Gecerli
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Passwordünüzü giriniz.");
        String pwd = input.nextLine();
        char firstChar = pwd.charAt(0);

        if (firstChar >= 'A' && firstChar <= 'Z') {//PASSWORDÜN İLK HARFİ BÜYÜK İSE

            if (firstChar == 'A') {
                System.out.println("geçerli password");
            } else {
                System.out.println("geçersiz password büyük harf ama A değil");
            }


        } else if (firstChar >= 'a' && firstChar <= 'z') {//passwordün ilk harfi küçük
            if (firstChar == 'z') {
                System.out.println("geçerli password");
            } else {
                System.out.println("geçersiz password küçük harf ama z değil");
            }
        } else {
            System.out.println("ilk karakter harf olmalıdır");
            //Bir methodu tekrar tekrar kullanacaksak bu methodu bir variable a atayıp kullanmak daha doğrudur

        }
    }}

