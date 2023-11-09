package day10ifstatements;

import java.util.Scanner;

public class IfStatements01 {
    public static void main(String[] args) {
        //verieln bir sayının pozitif negatif veya nötr olduğunu kntrol ediniz.
        Scanner input=new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
       int  num= input.nextInt();

       if(num>0){
           System.out.println("Sayı pozitiftir.");
       }
       else if (num<0){
           System.out.println("Sayı negatiftir.");
       }
       else {
           System.out.println("sayı nötürdür.");
       }
    }
}
