package practice04;

import java.util.Scanner;

public class S05_StringBuilder_FaktoriyelHesaplama {
     /*
        Bir öğrenci, matematik dersinde, verilen bir sayının faktöriyelini hesaplamak için bir program yazmak istiyor.
        Program, kullanıcıdan bir sayı girmesini isteyecek ve faktöriyel hesaplama işlemini gerçekleştirecektir.
        Kullanıcının girdiği sayı 20'den küçük veya eşit olacaktır.
        Faktöriyel hesaplama işlemi tamamlandıktan sonra sonucu ekrana yazdıracaktır.
    */
     public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         System.out.println("Lütfen 20 den küçük veya eşit bir sayı giriniz.");
         int sayi=input.nextInt();
         if (sayi<1 || sayi >20){
             System.out.println("geçersiz değer");
         }else {
             StringBuilder sonuc=new StringBuilder();
             sonuc.append(sayi).append("! =");
             int faktoriyel=1;
             for (int i = 1; i <=sayi ; i++) {
                 faktoriyel=faktoriyel*i;
                 sonuc.append(i);
                 if (i !=sayi){
                     sonuc.append(" * ");
                 }

             }
             System.out.println(sonuc.append("=").append(faktoriyel));

         }

     }
}
