package Arrays;

import java.util.Scanner;

public class ArrayOneDimession {

    public static void mean(int[] r){
        int sum=0;
        for (int i = 0; i <r.length ; i++) {
            sum=sum+r[i];

        }
        System.out.println("dizi ortalaması "+sum/r.length);

    }

    public static void main(String[] args) {
        int[] arr=new int[5];
        Scanner input=new Scanner(System.in);
        System.out.println("dzi değrlerini girin:");

        for (int i = 0; i < arr.length ; i++) {
            arr[i]=input.nextInt();

        }
        mean(arr);
    }
}
