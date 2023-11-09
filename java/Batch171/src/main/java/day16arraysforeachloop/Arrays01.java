package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        int a = 13;
        // bu yapıda sadece 1 tane data depolanabilir.
        //ama biz kod yazarken bir yapının içinde çoklu data depolama ihtiyacı hissederiz.
        // bir yapının içinde çoklu data depoalayabilmek için java array yapısını oluşturmuştur.
        // array nasıl oluşturulur?
        String stdNames[] = new String[5];

        //arraylarin consola yazdırılması..
        //toString metodunu kullanmadan array ismi ile yazdırırsak java array in adresini yazar.
        System.out.println( Arrays.toString(stdNames));

        /*
        Arraylar diğer collection lardan çok çok hızlıdır. superfast tir.
        Arraylar diğer collectionlardan daha az memory kullanırlar.
         */
        //array e eleman ekleme nasıl yapılır.

        stdNames[2]="Benna";
        System.out.println( Arrays.toString(stdNames));

        stdNames[3]="abdullah";
        System.out.println( Arrays.toString(stdNames));
        stdNames [4]="Recep";
        System.out.println( Arrays.toString(stdNames));
        stdNames[0]="ekim";
        System.out.println( Arrays.toString(stdNames));
        stdNames[1]="sebahattin";
        System.out.println( Arrays.toString(stdNames));

        //arraydan spesifik bir elemanı nasıl alırız.

        System.out.println(stdNames[3]);//abdullah
        System.out.println(stdNames[4]);//recep

        //örnek 1: array deki her elemanın souna ünlem koyup ekrana yazdıralım
        // length() stringlerde method (parantezli) arraylerde ise parantezsiz yazılır.

        for (int i=0;i<stdNames.length;i++){
            System.out.println(stdNames[i]+"!");

        }





    }
}
