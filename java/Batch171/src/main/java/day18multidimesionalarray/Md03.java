package day18multidimesionalarray;

import java.util.Arrays;

public class Md03 {
    public static void main(String[] args) {
        //örnek : 2 boyutlu bir arrayi ek boyutlu bir arraye ceviriniz.
         int numbers[][]={{5,4},{2,3,2}};//{5,4,2,3,2}

        // 1. step: 2 boyutlu array de kaç eleman olduğunu bulan kodu yazmalıyız.
        int toplamElemanSayisi=0;
        for (int [] w:numbers){
            toplamElemanSayisi=toplamElemanSayisi+w.length;

        }
        System.out.println(toplamElemanSayisi);//5
        // 2. step: tek boyutlu array'i 2 boyutlu array'in eleman sayısını kullanarak oluşturmalıyız.
        int newArray[]=new int[toplamElemanSayisi];

        // 3. step: 2 boyutlu arraydeki elemanları tek boyutlu array'e transfer etmeliyiz.
        int idx=0;
        for (int [] w:numbers){

            for(int k:w){
                newArray[idx]=k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}
