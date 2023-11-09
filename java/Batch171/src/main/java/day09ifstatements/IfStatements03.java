package day09ifstatements;

import java.util.Scanner;

public class IfStatements03 {
    public static void main(String[] args) {
        //örnek 1: verilen karakter büyük harf ise ekrana büyük harf değilse küçük harf yazdıran pr.

        Scanner ch1 = new Scanner(System.in);
        System.out.println("Karakter giriniz.");

        char ch = ch1.next().charAt(0);

        // 1. yol
        if (ch >= 'A' && ch <= 'Z') {

            System.out.println("büyük harf");
        }
        if (ch >= 'a' && ch <= 'z') {

            System.out.println("küçük harf");
        }
        //2. YOL

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("büyük harf");

        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("küçük harf");
        } else {
            System.out.println("harf değil");
        }


    }
}
