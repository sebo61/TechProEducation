package day33exceptionsenumsiterator;

import javax.xml.transform.sax.SAXTransformerFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators {
    public static void main(String[] args) {
        /*
        1) Iterator lar loop ların yaptığı aynı işi yapar.
        2) Iteratorlarda sonsuz loop oluşma ihtimali yoktur.
        3) Iteratorlar ile looplar arasında performans farkı yoktur.
        4) Iteratorlar bir collectiondan eleman silme ve bir collectiondaki elemani değiştirme konusunda daha başarılıdır.
        5) iki tip iterator var.
            a) Iterator: bu sadece eleman silmede kullnılır.
                Eleman eklemek veya elemanı değiştirmek mümkün değildir.
            b) ListIterator : Eleman silebilir, ekleyebilir ve değiştirebilir.

            Note: Iterator sadece soldan sağa (ilk elemandan son elemana ) calişır.
                ListIterator ise iki yonlu çalışabilir.
         */

        List<String> myList=new ArrayList<>();
        myList.add("Niyazi");
        myList.add("Saadet");
        myList.add("Fevzi");
        myList.add("Suat");
        myList.add("Mustafa");

        System.out.println(myList); //[Niyazi, Saadet, Fevzi, Suat, Mustafa]

        Iterator<String> myItr= myList.iterator(); //[Niyazi, Saadet, Fevzi, Suat, Mustafa]
        // iterator ile specific bir eleman nasıl silinir.
        while (myItr.hasNext()){ // hasNext() pointer a senden sonra eleman var mı diye sorar.
                                // eleman varsa true yoksa false return eder.
            String el= myItr.next();       // next () metodu pointerı bir sonraki elemanın önüne tasır ve ustunden atladığı elemenı return eder.
            if(el.equals("Niyazi")){
                myItr.remove();      // metodun return ettiği elemanı siler.

            }

        }
        System.out.println(myList);

        // ListIterator kullanımı
        List<String> yourList=new ArrayList<>();
        yourList.add("Niyazi");
        yourList.add("Saadet");
        yourList.add("Fevzi");

        System.out.println(yourList);

        ListIterator<String> yourListItr= yourList.listIterator();
        while (yourListItr.hasNext()){
            String el=yourListItr.next();
            yourListItr.set(el + "*");

        }
        System.out.println(yourList); //[Niyazi*, Saadet*, Fevzi*]

        // ListIterator previous kullanımı
        List<String> list3=new ArrayList<>();
        list3.add("Niyazi");
        list3.add("Saadet");
        list3.add("Fevzi");
        System.out.println(list3); //[Niyazi, Saadet, Fevzi]

        ListIterator<String> listItr=list3.listIterator();

        //loop kullanarak pointerı en sona almalıyız.
        while (listItr.hasNext()){
            listItr.next();

        }
        while (listItr.hasPrevious()){
        String el=listItr.previous();
            System.out.println(el +"<==");


        }

    }

}
