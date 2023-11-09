package Day11nestedifterraryincrementdecrement;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {
        //Ternary Statement
        // ornek 1:sayı 10 dan küçük ise konsola "küçük" yazdırın, değil ise "küçük değil yazdırın
        int num=12;

        if(num<10){
            System.out.println("küçük");

        }else {
            System.out.println("küçük değil");

        }
        // --Ternary çözüm
        //Condition ? Condi,ition true ise çalışır : Condition yanlış ise çalışır

       String sonuc= num<10      ?  "küçük"                      : "küçük değil" ;
        System.out.println(sonuc);

        //ornek 2 sayı çift ise konsola çift değil ise tek yazdırın

        int number=13;

        if (num%2==0){
            System.out.println("çift");
        }else{
            System.out.println("tek");


        }

        String sonuc2= num%2==0 ? "çift" : "tek";
        System.out.println(sonuc2);

        //sayı o dan büyükse poz. değilse ekrana poz. değil yazsın

        int num1=-4;
        System.out.println(num1>0 ? "pozitif" :"pozitif değil"); //string olduğu için direkt içine yazdık
        //ornek 4: kullanıcıdn 2 sayı alınız ve büyük olmayan (küçük veya eşit) sayıyı yazdırınız

        Scanner input=new Scanner(System.in);
        System.out.println("iki sayı giriniz");
        double first= input.nextDouble();
        double second= input.nextDouble();

        // 1. yol if-else

        if (first<second){
            System.out.println(first);
        }else {
            System.out.println(second);
        }
        //2. yol


       double result3= first<second ? first : second;
        System.out.println(result3);




    }
}
