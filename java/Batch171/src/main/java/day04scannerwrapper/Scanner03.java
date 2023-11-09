package day04scannerwrapper;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        //örnek:kullanicidan 2 sayi alıp 4 işlem yapan ve işlemlerin sonuçlarını ekrana yazdırran kodu yaziniz.

        Scanner input=new Scanner(System.in);
        System.out.println("4 işlem için lütfen iki sayıyı giriniz..:");
        double firstNumber = input.nextDouble();
        double secondNumber = input.nextDouble();

        System.out.println("toplama.:"+(firstNumber+secondNumber));
        System.out.println("Çıkarma..:"+(firstNumber-secondNumber));
        System.out.println("çarpma..:" +(firstNumber*secondNumber));
        System.out.println("bölme.:"+(firstNumber/secondNumber));




    }
}
