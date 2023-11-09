package suleymanHoca.day19arraylists;

import java.util.ArrayList;

public class ArrayList01 {
    /*
    1) ayni data tipindedi çoklu dataları depolamak için Array kullanırız.
    2) Arraylerin bir negatif yönü var. içine koyacağınız eleman sayısını en başta belirtmek gereklidir.
    3) Arrayler eleman sayısında esnek değildirler. bu yüzden Java ArrayList adlı bir yapı oluşturdu.
        bu yapı eleamn sayısında esnektir. Hiç eleman koymazsanız eleaman sayısını 0 olarak ayarlar.
       1000 eleman koyarsanız eleman sayısını 1000 olarak ayarlar.
    4) "ArrayList" yerine sadece "List" de diyebiliriz.
    5) Java ArrayList leri oluşturduktan sonra Arrayleri silmedi. Çümkü; arrayler süper hızlıdır. Memoryde çoook az yer kaplar.
    6)Array'ler primitive ve reference'lari depolayabilir. Ama ArrayList'ler non-primitive data type larını depolar.
        Bu yüzden ArrayList'ler arraylerden daha çok yer kaplar.


     */
    public static void main(String[] args) {
        //ArrayList nasıl oluşturulur?
        ArrayList<Integer> ages = new ArrayList<>();
        //ArrayList consola nasıl yazdırılır.
        System.out.println(ages); //[]
        // ArrayList'e eleman nasıl eklenir?
        //1. way
        ages.add(12);
        ages.add(24);
        ages.add(9); // add metodu elemanları giriş sırasına (insertion order) göre liste yerleştirir.
        // 2. way
        ages.add(1,99);

        System.out.println(ages); //[12, 24]
        ArrayList<Integer> price = new ArrayList<>();
        price.add(23);
        price.add(33);
        // 3. way
        ages.addAll(price); // bir listi diğer listin içine yerleştirir.
        System.out.println(ages); //[12, 99, 24, 9, 23, 33]
        //4. way
        ages.addAll(3,price);
        System.out.println(ages); //[12, 99, 24, 23, 33, 9, 23, 33]
        // ArrayList'de eleman sayısı nasıl bulunur?
        System.out.println(ages.size()); //bsize() bir List'deki eleman sayısını verir.
        // ArrayList'te specific bir eleman nasıl alınır?

       int el1= ages.get(3); // get() metodu index kullanarak istediğimiz elemanı almaya yarar.
        System.out.println(el1);
        //specific bir eleman nasıl değiştirilir.
        ages.set(6,111); //
        System.out.println(ages);  //[12, 99, 24, 23, 33, 9, 111, 33]
        // ArrayListe specific bir elemanın var olup olmadığını nasıl anlarız.
        boolean r1= ages.contains(99);
        System.out.println(r1); //true
        // Bir ArrayList'in boş olup olmadığını nasıl kontrol ederiz.
       boolean r2= ages.isEmpty();
        System.out.println(r2); //false
        // bir ArrayList'te tüm elemanları nasıl sileriz.
        ages.clear();
        System.out.println(ages);//[]

        boolean r3=ages.isEmpty();
        System.out.println(r3); //true
        // eXAMPLE 1: BİR LİSTİN BOŞ OLUP OLAMDIĞI KONTROL EDEN KODU YAZINIZ.

        ArrayList<String> names=new ArrayList<>();
        names.add("Ajda");
        names.add("Cüneyt");
        names.add("Angelina");
        names.add("Brad");

        if (names.size()==0){
            System.out.println("Liste boşutr");
        }else{
            System.out.println("List has at least 1 element.");
        }
        if (names.isEmpty()){
            System.out.println("List is empty");
        }else{
            System.out.println("List has at least 1 element.");
        }

    }
}
