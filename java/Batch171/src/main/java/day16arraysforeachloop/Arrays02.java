package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        //example 1: String array oluşturun. içine 5 tane eleman  ekleyin. ilk eleman ile son elemanın
        // içerdiği karakter sayıları toplamını ekran yazdırın

        String arr[] = new String[5];
        arr[0]="Math";
        arr[1]="Science";
        arr[2]="Music";
        arr[3]="English";
        arr[4]="Art";

        System.out.println(Arrays.toString(arr));
        int toplam=arr[0].length()+arr[arr.length-1].length();
        System.out.println(toplam);

        // örnek 2: string bir array oluşturun.içine 5 eleman ekleyin. tüm elemanların içerdiği karakter sayıları
        // toplamını ekrana yazdırın

        String brr[] = new String[5];
        brr[0] = "Miami";
        brr[1] = "İstanbul";
        brr[2] = "Ankara";
        brr[3] = "Oslo";
        brr[4] = "Erzurum";

        int totalChar = 0;

        for (int i = 0; i < brr.length; i++) {

            totalChar = totalChar + brr[i].length();


        }
        System.out.println(totalChar);

        // 2. yol: for each (enhanced loop)
        // başlangıç değeri, loop çalışma şartı, increment/decrement kendisi halleder.
        // for-each loop "Array"lerde ve collectionlarda kullanılır.

/*   Kalıbını oluşturalım:

        for (Datatype w:dizi_adı){

            Çalışacak kodlar

        }
*/
        int sum=0;
        for (String w:brr){

            sum=sum+w.length();


        }
        System.out.println(sum);

        //ornek 3: notlar adında integer bir array oluşturunuz içine 6 tane not yerleştiriniz.
        // ve not ortalamasını ekrana yazdırınız.

        int notlar[]=new int[6];

        notlar[0]=50;
        notlar[1]=70;
        notlar[2]=60;
        notlar[3]=40;
        notlar[4]=90;
        notlar[5]=80;
        System.out.println(Arrays.toString(notlar));
        int total=0;
        for (int w:notlar){
            total=total+w;


        }
        System.out.println("total = " + (total/notlar.length));


    }
}
