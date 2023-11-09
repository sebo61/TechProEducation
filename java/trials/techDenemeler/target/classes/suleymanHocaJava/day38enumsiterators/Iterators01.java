package suleymanHocaJava.day38enumsiterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {
    /*
    1) Iterator'lar loop ların yaptığı aynı işi yapar.
    2) sonsuz loop oluşma ihtimali yoktur.
    3) performans farkı yok.
    4) İki tip iterator vardır. i) Iterator: sadece silmede kullanılır.
        ii) ListIterator: Eleman silebilir, ekleyebilir, değiştirebilir.
        Iterator soldan sağa çalışır. ListIterator iki yonlu calısır.
     */
    public static void main(String[] args) {
        List<String> myList=new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Angie");
        myList.add("Mark");

        System.out.println(myList);

        // Iterator kullanalim

       Iterator<String> myItr= myList.iterator();

       while (myItr.hasNext()){

           myItr.next();
          myItr.remove();


       }

        System.out.println(myList );
       // ListIterator
        List<String> yourList=new ArrayList<>();
        yourList.add("Tom");
        yourList.add("Jim");
        yourList.add("Clara");
        yourList.add("Angie");
        yourList.add("Mark");

        ListIterator<String> yourListItr= yourList.listIterator();

        while (yourListItr.hasNext()){
            String el= yourListItr.next();

            yourListItr.set(el+"!");


        }
        System.out.println(yourList);

    }
}
