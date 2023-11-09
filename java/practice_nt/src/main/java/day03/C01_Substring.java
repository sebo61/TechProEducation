package day03;

import java.util.Scanner;

public class C01_Substring {
    public static void main(String[] args) {
         /*
    Kullanıcıdan ad ve soyadını aralarında bir bosluk olacak sekılde sisteme girmesini isteyiniz
    NOT: Yalnızca bir ad bir soyad girilmeli
    Ad ve Soyadı ilk harfleri buyuk olacak sekılde alt alta yazdırın
    Ad : Canan
    Soyad : Can
     */
        Scanner input = new Scanner(System.in);
        System.out.println("Ad ve soyadınızı arasında bir boşluk olacak şekilde giriniz.");
        String nameSurname = input.nextLine();
        nameSurname= nameSurname.trim();
        int spaceIndex = nameSurname.indexOf(" ");
        String name = nameSurname.substring(0, spaceIndex);

        System.out.println(name.trim().substring(0, 1).toUpperCase() + name.toLowerCase().substring(1));


        String surname = nameSurname.substring(spaceIndex + 1).trim();

        System.out.println(surname.substring(0, 1).toUpperCase() + surname.toLowerCase().substring(1));


    }
}
