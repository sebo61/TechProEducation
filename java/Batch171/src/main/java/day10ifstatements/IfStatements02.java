package day10ifstatements;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {
        //Example 1: Gun sayisini verdiginizde gun ismini yazan kodu yaziniz
        //  1==> Pazar, 2 ==> Pazartesi .....
        Scanner dayNumber = new Scanner(System.in);
        System.out.println("Kaçıncı günü istiyorsunuz?");
        byte dayNum = dayNumber.nextByte();

        if (dayNum == 1) {
            System.out.println("Sunday");

        } else if (dayNum == 3) {
            System.out.println("Tuesday");
        } else if (dayNum == 4) {
            System.out.println("Wadnesday");
        } else if (dayNum == 5) {
            System.out.println("Thursday");
        } else if (dayNum == 6) {
            System.out.println("Friday");
        } else if (dayNum == 7) {
            System.out.println("Saturday");
        } else {
            System.out.println("Hatalı giriş yaptınız. Lütfen 1-7 arası sayı giriniz.");

        }



    }
}
