package suleymanHocaJava.day29collections;

import java.util.LinkedList;

public class LinkedList01 { //LinkedListler index kullanmazlar. node ekleme ve silme de tekrar indexleme yapılmaz.
    // LinkedListlerde node ekleme ve silme işlemleri yaparken pointerları değiştirir.

    /*
    1- node silme ve eklemede çok başarışlıdır. sieme ve ekleme işlemleri çoklukla yapacağımız zaman linkedList kullanırız.
    2- arrayListler search işleminde başarılıdır.
    note: silme ve ekleme işlemleri için LinkedList, search işlemleri yapacaksa ArrayList

     */
    public static void main(String[] args) { //arraylistler eleman ekleme ve eleman silmede yavaştırlar indexleme yapmak zorunda olduklarından

        LinkedList<String> s = new LinkedList<>();

        s.add("Esra");
        s.add("Steve");
        s.add("Ajda");
        s.add("Muge");
        s.add("Cuneyt");
        s.add("Esra");
        s.addFirst("Kemal");
        s.add(2, "Esen");
        s.addLast("Ajdar");

      //  s.remove("Muge");
       // s.remove("Ajdar");

       // s.remove(); //ilk elemanı siler.

        // s.removeFirstOccurrence("Esra");
      //  s.removeLastOccurrence("Esra");

        System.out.println(s);
        String r1=s.peek();

        System.out.println(r1);
        System.out.println(s);
        System.out.println(s.poll()); //son eleman yoksa null vrir
        System.out.println(s);
        System.out.println(s.element());  // ilk eleman yoksa hata fırlatır

        s.pop(); // son eleman yoksa exception fırlatır.


    }

}
