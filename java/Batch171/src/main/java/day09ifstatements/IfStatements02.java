package day09ifstatements;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {
        // örnek: kullanıcıdan alınan bir sayının tek mi çift mi olduğunu konsola yazdırınız.

        Scanner number=new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz.");

        int num= number.nextInt();

        //1.yol

        if(num%2==0){
            System.out.println("Çift sayıdır.");
        }
        if(num%2 !=0){

            System.out.println("Sayı tektir.");
        }
        //2. yol ==> kontrol edilen condition sayısı daha az olduğundan tercih edilir.

        if (num%2==0){
            System.out.println("çift sayı");
        }
        else { //aksi halde
            System.out.println("Taksayıdır");
        }


    }
}
