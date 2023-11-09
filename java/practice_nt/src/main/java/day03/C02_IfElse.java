package day03;

import java.util.Scanner;

public class C02_IfElse {
    public static void main(String[] args) {
        // Kullanicidan ayri ayri sisteme iki sayi girmesini isteyiniz.
        // ilk sayinin ikinci sayidan buyuk olup olmadıgını yazdırın
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen ilk sayı giriniz.");
        int firstNumber = input.nextInt();
        System.out.println("ikinci sayıyı giriniz.");
        int secondNumber = input.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println("ilk ssayı büyüktür");
        } else if (firstNumber == secondNumber) {
            System.out.println("eşittirler");
        } else {
            System.out.println("ikinci sayı büyüktür");
        }


    }
}
