package day04scannerwrapper;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {

        //ornek: kullanıcıdan adresini aliniz ve ekrana yazdırınız.
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen adresinizi giriniz..:");
        //nextLine() methodu kullanıcıdan çok kelimeli String almak için kullanılır.
        String address=input.nextLine();
        System.out.println("Adresiniz..:"+address);

    }
}
