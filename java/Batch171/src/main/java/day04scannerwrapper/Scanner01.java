package day04scannerwrapper;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //ornek:kullanıcıdan ilk ismini ve soy ismin alıp aynı satırda yazdırınız.
        //1. adım: Scanner classtan obje oluştur

        Scanner input = new Scanner(System.in); //constructer(Scanner), System.in içeri
        //2. adım:kullanıcıya ne istediğimize dair mesaj verin.
        System.out.println("ilk isminizi giriniz..:");
        //next methodu kullanıcıdan tek kelimelik string almak için kullanılır.
        //3.uygun methodu kullanrak kullnıcının verdiği datayi memory ye yerleştirin.
        String firtsNme = input.next();
        System.out.println("soy isminizi giriniz:");
        String lastName = input.next();
        System.out.println(firtsNme + " " + lastName);
    }
}
