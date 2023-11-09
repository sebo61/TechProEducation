package suleymanHocaJava.day33maps;

import java.util.Hashtable;

public class HashTable01 {
    /* HashMap ile HashTable arasındaki fark nedir?
    1) hashmap thread-safe değildir. HashTable "thread-table" dır.
        Hashmap "synchrozid" değildir. HashTable synchronized dir.
    2) HashMap bir tane null key e izin verir. sınırsız null value ye izin veir.
        hashTable null kullanılamaz.

     3) HashMap hızlıdır HashTable daha yavaştır.
        her ikiside entry leri rastgele sıralar.


    */

    public static void main(String[] args) {

        Hashtable<String,Integer> stdAges=new Hashtable<>();
        stdAges.put("Tom",43);
        stdAges.put("Jim",52);
        stdAges.put("Jack",21);
        stdAges.put("Henry",43);
        stdAges.put("Walker",85);
        stdAges.put("Chris",null);

        System.out.println(stdAges);


    }
}
