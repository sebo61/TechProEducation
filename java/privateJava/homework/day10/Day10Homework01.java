package homework.day10;

import java.util.Scanner;

public class Day10Homework01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Passwordü giriniz.:");
        String passwd= input.next();

        if (passwd.equals("pwd123!")){

            System.out.println("Girilen password doğru");

        }else {
            System.out.println("Girilen password yanlış");
        }



    }
}
