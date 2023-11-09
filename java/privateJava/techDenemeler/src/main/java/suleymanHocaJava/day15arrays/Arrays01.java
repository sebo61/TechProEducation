package suleymanHocaJava.day15arrays;

import java.util.Arrays;

public class Arrays01 {
    /*
    1) Array Javanın aynı tipinde çoklu data depolamak için oluşturduğu bir yapıdır.
    2) Arrayler primitive data tipleri veya referanslar ile çalışır.
    3) Arrayler süper hızlıdır. memoryde çok az yer kaplarlar.


     */
    public static void main(String[] args) {
        // Array nasıl oluşturulur?
        String[] stdNames= new String[5];
        //Array nasıl yazdırılır.
        System.out.println(Arrays.toString(stdNames)); // [null, null, null, null, null] ==> string için null varsayılan değer.
    //Arraye nasıl eleman eklenir.

        stdNames[0]="Ajda";
        stdNames[3]="Cüneyt";
        stdNames[2]="Kemal";
        stdNames[1]="Ayhan";
        stdNames[4]="Filiz";

        System.out.println(Arrays.toString(stdNames)); //[Ajda, Ayhan, Kemal, Cüneyt, Filiz]

        //Array deki spesific bir elemanı nasıl alabiliriz?
        System.out.println(stdNames[3]); //Cüneyt
        //Example 1:stdNames Arrayindeki her ismin sonuna * koayarak konsola yazdırınız.
        // 1. yol

        for (int i=0;i<stdNames.length;i++){ // lenght stringlerde parantezli, arraylerde parantezsiz (metod değil) kullamılır.

            System.out.println(stdNames[i]+"*");

        }
        // 2. yol
        // for-each loop ==> Enhanced(Zenginleştirilmiş)
        for (String w:stdNames){

            System.out.println(w+"*");

        }
        //example 2 bir integer array oluşturunuz. 5 eleman ekleyiniz. elemanların toplamaını bulup yazdırınız.

        int age[]=new int[5];
        age[0]=23;
        age[1]=12;
        age[2]=32;
        age[3]=56;
        age[4]=6;

        int sum=0;
        for (int w:age ) {

            sum+=w;

        }
        System.out.println("Yaşlar toplamı: "+sum);
        //example 3: bir cahar array oluşturunuz. 3 eleman eklleyiniz. elemanların çarpuımını bulup ekrana yazdırınız.
        char chr[]=new char[3];
        chr[0]='A';
        chr[1]='C';
        chr[2]='e';

        int carp=1;
        for (char w:chr
             ) {
            carp*=w;

        }
        System.out.println(carp);




    }


}
