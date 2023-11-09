package day18multidimesionalarray;

import java.util.Arrays;

public class Md01 {
    public static void main(String[] args) {
        // bir array in elemanları array ise bu array ler Multidimesionarray'dir.
        // multidimesion array nasıl oluşturulur?
        int a[][]=new int[3][2];
        // multidimasional arraylaa nasıl eleman eklenir?
        a[0][0]=5;
        a[1][1]=45;
        a[1][0]=81;
        a[0][1]=12;
        a[2][0]=123;
        a[2][1]=0;
        System.out.println(Arrays.toString(a));//[[I@19dfb72a, [I@17c68925, [I@7e0ea639]
        System.out.println(Arrays.deepToString(a)); //[[5, 12], [81, 45], [123, 0]]

        //multidimesionarrayleri konsola yazdırmak için tostring metodu değil.
        // "deepToString()" metodunu kullanmalıyız.

        //multidimesion Array içinden specific bir eleman nasıl yazdırılır?
        System.out.println(a[1][1]);//45
        System.out.println(a[2][1]);//0

        //Multidimesional Array içindeki array nasil yazdırılır.?
        System.out.println(Arrays.toString(a[0]));//[5, 12]
        System.out.println(Arrays.toString(a[2]));//[123, 0]

        //kısa yoldan Multidimesional array nasıl oluşturulur?
        String student[][]={{"Ali","Kemal"},{"Cemal"},{"Ayhan","Beyhan","Seyhan"},{"Ceyhan","Kayahan"}};
        System.out.println(Arrays.deepToString(student));
        //örnek 1: yukrıdaki student arrayinde toplam kaç adet isim olduğunu bulunuz.
        int sum=0;
        for (String[] w:student){

            sum=sum+w.length;

        }
        System.out.println(sum);
    }
}
