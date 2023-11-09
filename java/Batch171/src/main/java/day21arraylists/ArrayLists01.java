package day21arraylists;

import java.util.ArrayList;

public class ArrayLists01 {
    public static void main(String[] args) {
        /*
        1) aynı data type ındaki çoklu data ları depolamak için array kullanırız.
        2) arraylrin negatif yönü var. içine koyacağımız eleman sayısını en başta belirlemek zorundayız.
        3) arrayler eleman sayısında esnek değillerdir. bu yüzdn java "ArrayList" adlı yeni ir yapı oluşturdu.
            bu yapı eleman sayısında esnektir.hiç eleamn koymazsanız eleman sayısını "0" olarakk ayarlar.
            1000 tane eleman koyarsanız eleman sayısını 1000 olarak ayarlar.
        4) ArrayList yerine sadece liste diyebiliriz.
        5) Java ArrayListeleri oluşturtuktan sonra Array leri iptal etmedi. Çünkü;
            a) arraylar süper hızlıdır.
            b) arrayler memoryde az yer kaplarlar.
            c) bu nedenle eleman sayısı belli olan dataları depolamak için arrayler tercih edilir.
         6) arraylar primitive data typları ve non-primitivlerin referance larını depolar.
            ama arrayListler "non-primitive" data typelarını depolar. bu yüzden arrayListler arraylerden daha çok yer kaplar.

         */
        // ArrayList nasıl oluşturulur?
        ArrayList<Integer> ages=new ArrayList<>();
        // ArrayList console a nasıl yazdırılır?
        System.out.println(ages);
        // ArrayListlere eleman nasıl eklenir.
        //ArrayListlere eleman eklemek için add() methodunu kullanırız.
        // add() metodu elemanları sizin verdiğiniz sırada ekler. buna (Insertion Order) denir.

        ages.add(9);
        ages.add(12);
        ages.add(10);
        ages.add(1,656);
        ages.add(3,777);
        ages.add(888);
        System.out.println(ages);
        // liste'e çoklu elemanları nasıl ekleriz? List'e başka bir List nasıl eklenir?
        // Bir list'e çoklu eleman eklemek için o elemanları önce bir listin içine koymalısınız.
        ArrayList<Integer> newAges=new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);
        System.out.println(newAges);//[8, 9, 10]
        ages.addAll(2,newAges);
        System.out.println(ages);//[9, 656, 8, 9, 10, 12, 777, 10, 888]
        // ArrayList de eleman sayısı nasıl bulunur?
        // size() metodu bir Listteki eleman sayısını verir.
        int numOfElement=ages.size();
        System.out.println(numOfElement);
        //ArrayListte spesific bir eleman nasıl alınır?
        // get () metodu index kullanarak istediğimiz elemanı almaya yarar.
        int el1= ages.get(1);
        System.out.println(el1);
        //ArrayListte spesific bir eleman nasıl değiştirilir?
        ages.set(6,111);
        System.out.println(ages);
        ages.set(4,313);
        System.out.println(ages);
        // birListteki tüm elemanları nasıl silebilirim.
      /*  ages.clear();
        System.out.println(ages);*/
        //ArrayListt specific bir karakterin olduğunu nasıl anlarız.
        boolean r= ages.contains(656);//boolen verir.
        System.out.println(r);
        // bir ArrayListin boş olup olmadığını nasıl kontrol edbiliriz?

        //isEmpty() metodu ArayList bos ise True dolu ise false verir.
        boolean r2= ages.isEmpty();
        System.out.println(r2);
        // örnek: size verilen bir listin boş olup olmadığını kontrol eden kodu yazınız.
        ArrayList<String> names=new ArrayList<>();
        names.add("Saadet");
        names.add("Kasım");
        names.add("Ekim");
        names.add("Ali");
        if (names.size()==0){
            System.out.println("List is empty");
        }else {
            System.out.println("List has at least 1 element");
        }
        names.clear();
        // 2. Way recommended
        if (names.isEmpty()) {
            System.out.println("list is emty");
        }else{
            System.out.println("List has at least 1 element");
        }
        /*
        bir method öğrenirken 3 şeyi öğrenin
        1) O metod ne iş yapar?
        2) O metod nasıl kullanılır?
        3) o metod size neyi verir?
         */
    }
}
