package day17Arrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        //array'leri kısa yoldan nasıl oluşturabiliriz?
        int arr[] = {63, 7, 323, 8, 4};
        System.out.println(Arrays.toString(arr));
        // örnek 1: erilen arrayde ka tane çift sayı kaç tane tek sayı olduğunu bulan kodu yazınız.

        int sayac = 0;

        for (int w : arr) {
            if (w % 2 == 0) {
                sayac = sayac + 1;
            }
        }
        System.out.println("çift sayı sayısı..:" + sayac);
        System.out.println("tek sayı sayısı.:" + (arr.length - sayac));


        // örnek 2: size verilen bir string arraydeki isimlerden 5 karakterden az karakter içerenleri
        // konsala yazdırınız.

        String stdNames []= new String[5];
        stdNames [0]="Ajda";
        stdNames [1]="Ayhan";
        stdNames [2]="Tom";
        stdNames [3]="Cuneyt";
        stdNames [4]="Filiz";

        for (String w:stdNames){
            if (w.length()<5){
                System.out.println(w);
            }
        }
        // ÖRNEK 3: size verilen bir string array deki isimleri alfebetik sıraya oyduktan sonra "F" ile başlayan
        //isimler hariç diğer isimleri konsola yazdırınız.
        // note 1: sort metotu sayısal data typlerı küçükten büyüğe sıralar. (ascending order)
        // note 2 : sort metotu string data typeları alfabetik sıralar.(alphabetical order)
        // note 3: ascending order + alfabetical order ==> natural order
        // note 4: sort () metodu array elemanları natural order a göre sıralar.

        Arrays.sort(stdNames);
        System.out.println(Arrays.toString(stdNames));

        for(String w:stdNames){

            if ((w.startsWith("F"))){
               continue;
            }
            System.out.println(w);
        }

    }
}
