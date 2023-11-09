package practice01;

import java.util.Scanner;

public class S09_IfStatement_DikUcgen {
    public static void main(String[] args) {
          /*
        Kullanıcıdan üç adet sayı alarak bu sayıların bir dik üçgenin kenar
         uzunlukları olup olmadığını hesaplayan bir kod yazınız.
        (Not: Bir üçgenin dik olduğunu anlamak için a^2 + b^2 = c^2 pisagor
        bağlantısından yararlanabilirsiniz)
    */

        //Methodla da çözün.
        Scanner input = new Scanner(System.in);


        System.out.println("a kenarını girin");
        double a = input.nextDouble();

        System.out.println("b kenarını girin");
        double b = input.nextDouble();
        System.out.println(hipotonusHesapla(a,b));


    }
    public static double hipotonusHesapla ( double a, double b){

        return Math.sqrt(Math.pow(a,2)+Math.pow(b,2));

    }
}
