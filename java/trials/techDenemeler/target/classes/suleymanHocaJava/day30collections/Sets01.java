package suleymanHocaJava.day30collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets01 {
    /*
    1)tekrarsız eleman depolamak için kullanılır.
    2)3 tane Set Class vardır.
        i)HashSet Class :
            Hash benzersiz id oluşturma tekniğidir. Bu tekniğe Hashing Technique denir,
            HashSet elamanları rastgele sıralar. Çok hızlı çalışır.
            HashSetler "null" ı eleman kabul eder.

        ii))LinkedHashSet Class
            i) elemanları bizim verdiğimiz sırada dizerler. HashSet e göre daha yavaştır.
            ii) "insertion order" dır.

        iii) TreeSet Class
            i) elemanları "natural order" a göre dizerler.
            ii) çook yavaştırlar. en yavaş settir.
     */
    public static void main(String[] args) {
        HashSet <String> hs=new HashSet<>();
        hs.add("Ajdar");
        hs.add("Cüneyt");
        hs.add("Cüneyt");
        hs.add("Esra");
        hs.add("Zeki");
        hs.add("Ezel");
        hs.add(null);


        System.out.println(hs);

        System.out.println(hs.hashCode());

        LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
        System.out.println("********************************************************");

        lhs.add(234);
        lhs.add(87);
        lhs.add(-32);
        lhs.add(124);

        System.out.println(lhs);

        LinkedHashSet<Integer> ls=new LinkedHashSet<>();

        ls.add(451);
        ls.add(87);
        ls.add(231);
        ls.add(124);
        ls.add(null);
        System.out.println(ls);

        lhs.retainAll(ls);

        System.out.println(lhs);
        System.out.println(ls);


        TreeSet<Character> ts=new TreeSet<>();

        ts.add('g');
        ts.add('a');
        ts.add('z');
        ts.add('r');
        ts.add('u');
       // ts.add(null); // treeset lere null eklenemez.
        System.out.println(ts);

        System.out.println(ts.first());
        System.out.println(ts.last());

        System.out.println(ts.lower('d'));

        System.out.println(ts.higher('z'));

        System.out.println(ts.headSet('r')); // 'ye ye kadar ' hariç

        System.out.println(ts.tailSet('g'));

        System.out.println(ts.headSet('r', true));

        System.out.println(ts.tailSet('g', false));

        System.out.println(ts.ceiling('k'));

        System.out.println(ts.floor('j'));

        System.out.println(ts.subSet('g', 'v'));
        System.out.println(ts.subSet('g', false, 'z', true));


    }

}
