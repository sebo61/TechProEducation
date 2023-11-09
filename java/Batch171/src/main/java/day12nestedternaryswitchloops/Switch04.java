package day12nestedternaryswitchloops;

import java.util.Scanner;

public class Switch04 {
    public static void main(String[] args) {
        //ülke ismi alınız.alınan ada göre kısatlmaları yazdırınız.

             /*
             Ask user to enter country name among "America, England, Germany, Turkey, India, Peru, Spain, Bulgaria, Albania, France"
            Type code to print abbreviation(Kisaltma) of the countries. "US, UK, DE, TR, IN, PE, ES, BG, AL, FR"

            kullanicidan bir ulke ismi aliniz. Alinan ulke adina gore kisaltmalari yazdiriniz.
         */


        Scanner input = new Scanner(System.in);
        System.out.println("ülke adını giriniz.");
        String country = input.next();


        switch (country.toLowerCase()) {
            case "america":
                System.out.println("US");
                break;
            case "england":
                System.out.println("UK");
                break;
            case "germany":
                System.out.println("DE");
                break;
            case "türkiye":
                System.out.println("TR");
                break;
            case "india":
                System.out.println("IN");
                break;
            case "peru":
                System.out.println("PE");
                break;
            case "spain":
                System.out.println("ES");
                break;
            case "bulgaria":
                System.out.println("BG");
                break;
            case "albania":
                System.out.println("AL");
                break;
            case "france":
                System.out.println("FR");
                break;
            default:
                System.out.println("Bu ülke tanımlı değildir.");


        }
    }
    /*
    1) Github da bulunan projeyi kendi localimize almak için;
        a) Clone lanmak istenen projenin url i kopyalanır.
        b)intellij üzerinden file+new+project+project from version control ile clonelama yapılır.
    2)kendi localimize aldığımız projeyi githubda saklamak istiyorsanı

     */
}
