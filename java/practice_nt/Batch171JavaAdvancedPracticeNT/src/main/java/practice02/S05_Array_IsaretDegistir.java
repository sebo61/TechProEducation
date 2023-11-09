package practice02;

import java.util.Arrays;

public class S05_Array_IsaretDegistir {
    public static void main(String[] args) {
         /*
        Array içerisindeki elementlerin işaretlerini (+-) değiştiren bir kod yazınız.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6
    */
        int sayi[]={1,2,-3,4,-5,-6 };
        int digerDizi[]=new int[sayi.length];

        int idx=0;
        for (int w:sayi){

           sayi[idx]=w*-1;

                    idx++;

        }

        System.out.println(Arrays.toString(sayi));
    }
}
