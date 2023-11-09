package day02;

import java.util.Scanner;

public class C2_MethodCreation {
    public static void main(String[] args) {
        //kullanıcıdan fahrenayt cinsi değer isteyerek...
        // Fahrenheit değeri, Celsius değere çeviren method yazınız.
        // formül: c = (f-32)/1.8

        //yani fahrenheit degerini bu methoda gonderdıgımde bana celsius cinsinden sıcaklık donmeli
        Scanner scan = new Scanner(System.in);
        System.out.println("fahreneit değerini giriniz..:");
        double f = scan.nextDouble();
        System.out.println("f = " + f);


        double celsius = fahrToCels(f);
        System.out.println("celsius = " + celsius);
    }

    private static double fahrToCels(double f) {
        return ((f - 32) / 1.8);
    }



}
