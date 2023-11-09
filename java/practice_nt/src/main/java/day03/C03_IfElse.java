package day03;

import java.util.Scanner;

public class C03_IfElse {
    public static void main(String[] args) {
        //kullanıcıdan iki sayı isteyin
        //sayıların ikisi de pozitifse sayıların toplamını yazdırın
        //ikisi de negatifse sayıların çarpımını yazdırın
        //ikisi farklı işaretlere sahipse farklı işaretlerde sayılarla işlem yapamazsın
        //sayılardan sıfıra eşit olan varsa sıfır çarpmaya göre yutan elamandır yazdırın
        Scanner input = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz.:");
        int a = input.nextInt();
        System.out.println("İlk sayıyı giriniz.:");
        int b = input.nextInt();

        if (a > 0 && b > 0) {
            System.out.println("Toplam: " + (a + b));

        } else if (a < 0 && b < 0) {
            System.out.println("Çarpımı.:" + (a * b));

        } else if (a < 0 || b < 0) {
            System.out.println("Faeklı işaretli sayılarla işlem yapamazsın");

        } else {
            System.out.println("Sıfır yutan elemandır");
        }
    }
}
