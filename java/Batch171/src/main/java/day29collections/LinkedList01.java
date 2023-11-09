package day29collections;

import javax.xml.transform.sax.SAXTransformerFactory;
import java.util.LinkedList;

public class LinkedList01 {
    public static void main(String[] args) {

        LinkedList<String> s = new LinkedList<>();
        s.add("Nuriye");
        s.add("Orhan");
        s.add("Bunyamin");
        s.add("Saadet");
        s.add("Niyazi");
        s.add("Bilal");
        s.add("Abdullah");
        s.add("Nuriye");
//        System.out.println(s); //[Nuriye, Orhan, Bunyamin, Saadet, Niyazi, Bilal, Abdullah, Nuriye]
//       s.remove(3);
//        System.out.println(s); //[Nuriye, Orhan, Bunyamin, Niyazi, Bilal, Abdullah, Nuriye]
//        s.remove();//ilk görüntüyü siler
//        System.out.println(s);
//        s.remove("Orhan"); //Orhanı siler
//        System.out.println(s); //[Nuriye, Bunyamin, Saadet, Niyazi, Bilal, Abdullah, Nuriye]
///
//        s.removeFirstOccurrence("Nuriye"); // dizideki ilk görünümü sil
//        System.out.println(s);*/
//        s.removeLastOccurrence("Nuriye");
//        System.out.println(s);
        /*
        Retrieves, (alıp gelme) but does not remove, the head (first element) of this list.
Returns:
the head of this list, or null if this list is empty
         */
        String r1 = s.peek(); // ilk nodu silmedem verir. (ilk nodu copy+past)
        System.out.println(r1); //Nuriye
        System.out.println(s);
        /*
        Retrieves and removes the head (first element) of this list.
Returns: the head of this list, or null if this list is empty
         */
        String r2 = s.poll(); // ilk nodu size silirek verir. (cut+past)
        System.out.println(r2);
        System.out.println(s);
/*
Retrieves, but does not remove, the head (first element) of this list.
Returns:
the head of this list
Throws:
NoSuchElementException – if this list is empty
Not: peek() metodu iele element () metodunun her ikiside ilk elemanı silmeden verir.
peek list boş olduğunda size null verir. element ise hata verir.
 */
        String r3=s .element();
        System.out.println(r3); //listenin başını verir.
        System.out.println(s); //[Orhan, Bunyamin, Saadet, Niyazi, Bilal, Abdullah, Nuriye]
/*
pool ile pop metodları ilk elemanı siler size verir ama pool metodu liste boş olduğunda null verir. pop ise
hata fırlatır.
 */
        String r4=s.pop();  // cut+past
        System.out.println(r4); //Orhan
        System.out.println(s); //[Bunyamin, Saadet, Niyazi, Bilal, Abdullah, Nuriye]

    }
}












