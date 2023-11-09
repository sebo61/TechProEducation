package day03;

import java.util.Scanner;

public class C05_IfElse {
    public static void main(String[] args) {
                 /*
        Kullanıcıdan 3 karakterden daha uzun bir kelime sisteme girmesini isteyin
        Eger kelimenin karakter sayısı 3 ve 3'den daha kucuk ise konsola "
        3 Karakterden Daha Uzun Bir Kelime Girmelisiniz " yazdırınız
        Degilse kelimenin basına ve sonuna, kelimenin son uc harfini ekleyerek yazdırınız
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir 3 karakterden uzun kelime giriniz.");
        String letter = input.next();

        if (letter.length() > 3) {
            //String ilk3 = letter.substring(0, 3); yanlış anlamışım
            String son3 = letter.substring(letter.length() - 3);
            System.out.println(son3 + letter + son3);

        } else {
            System.out.println("3 harften büyük bir kelime giriniz.");
        }


    }
}
