package day14Lops;

import java.util.Scanner;

public class NestedLoop02 {
    public static void main(String[] args) {
        /*              Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz
                X X X X X
                X X X X X
                X X X X X
    */

        Scanner input= new Scanner(System.in);
        System.out.println("kaç satır olsun");
        int row= input.nextInt();
        System.out.println("kaç sütun olsun");
        int colum=input.nextInt();

        for (int i=1;i<=row;i++){

            for(int j=1;j<=colum;j++){
                System.out.print("X ");
            }
            System.out.println();
        }


    }
    }
