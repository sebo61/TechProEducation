package day03methodobjectcreationscanner;

//javanın util kütüphanesinden Scanner class import edildi.


import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //1. adım Scanner classdan ogje oluştur.
        Scanner input = new Scanner(System.in);
        //2. adım: kullanıcıya ne istediğinize dair mesaj veriniz.
        System.out.println("Lütfen yaşınızı giriniz.");
        //3.adım: uygun methodu kullanarak kullanicinin verdiği datayi memoru e yerleştiriniz.
        byte age = input.nextByte();

        System.out.println("age = " + age);
    }

}
