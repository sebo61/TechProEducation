package day29collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Sets01 {
    public static void main(String[] args) {
        /*
        1) setler tekrarsız eleman (unique) depolamak için kullanılır.
        2) 3 tane set clas ımız vardır
            a) HashSet Class:
                "Hash" benzersiz bir id oluşturma tekniğidir. Bu tekniğe "Hashing Technique" denir.
                "HashSet" elemanları rastgele sıralar.
                "HashSet" elemanları sıralamadığından ço hızlı çalışır.
                HashSetler null ı eleöman olarak kabul eder.
            b) LinkedHashSet Class:
                "LinkedHashSetler elemanları sizin verdiğiniz sıraya göre (insertion order) dizdikteleinden HashSetlere göre yavaştırlar.
                "LinkedHashSet" ler tekrarsız eleman depolamak içindir.
            c)   TreeSet Class:
                TreeSet"  ler elemanları natural order( küçükten büyüğe , alfabetik) a göre dizerler.
                en yavaş set TreeSet'tir.
          3) TeeSet'ler çook yavaş olduğundan mümkün olduğu kadar TreeSet kullanmamaya çalışırız.

          */
        HashSet<String> hs = new HashSet<>();
        hs.add("Mustafa");
        hs.add("Fuat");
        hs.add("Saadet");
        hs.add("Fevzi");
        hs.add("Ali");
        hs.add("Veli");
        hs.add("Can");
        System.out.println(hs); //[Mustafa, Fuat, Saadet, Fevzi]

        hs.add("Mustafa"); //tekrarlı eleman eklediğinizde hata vermez. ama tekrarlı elemanı bir kere ekler.
        System.out.println(hs);  //[Can, Mustafa, Fuat, Veli, Saadet, Fevzi, Ali]
        System.out.println(hs.hashCode());

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        lhs.add(7);
        lhs.add(19);
        lhs.add(13);
        lhs.add(-35);
        lhs.add(null);
        lhs.add(null);
        System.out.println(lhs);
        LinkedHashSet<Integer> ls = new LinkedHashSet<>();
        ls.add(7);
        ls.add(13);
        ls.add(119);
        ls.add(353);
        ls.add(313);

        lhs.retainAll(ls); //                                                                                                                                                                                       ortakları tut gerisini sil

        System.out.println(lhs); //[7, 13]
        System.out.println(ls); //[7, 13, 119, 353, 313]
        TreeSet<Character> ts=new TreeSet<>();
        ts.add('E');
        ts.add('G');
        ts.add('B');
        ts.add('A');
        ts.add('L');
        ts.add('T');
        ts.add('Z');
        System.out.println(ts); //[A, B, E, G, L, T, Z] natural order

       // ts.add(null); //teeSetlere null eklenemez.
        System.out.println(ts.first());
        System.out.println(ts.last());
        System.out.println(ts.lower('E')); //B bir önceki elemanı verir.
        System.out.println(ts.lower('F')); //E
        System.out.println(ts.lower('A')); //null
        System.out.println(ts.higher('L'));
        System.out.println(ts.headSet('G')); //[A, B, E]
        System.out.println(ts.headSet('G',true)); //[A, B, E,G] // G dahil
        System.out.println(ts.tailSet('L')); //[L, T, Z]
        System.out.println(ts.tailSet('L',false)); //[T, Z]
        System.out.println(ts.ceiling('T')); // T varsa verir
        System.out.println(ts.ceiling('O')); // T olsaydı nerde olurdu en yakın tavanını veriyor.

        System.out.println(ts.floor('B')); //B olan taban
        System.out.println(ts.floor('D')); //B olan taban
        System.out.println(ts.subSet('B', 'L')); // B E G
        System.out.println(ts.subSet('B',false, 'L',true)); // EGL


    }
}
