package day31mapsexceptions;

import java.util.Hashtable;

public class Hashtable01 {
    public static void main(String[] args) {
        /*
        HashMap ile Hashtable arasındaki fark nedir?
        1) HashMap tread-safe ve sysnchronized değildir. Hashtable thread-safe ve synchronized dir.
        2) HashMap bir tane null keye ve istediğimiz kadar null valueye müsade eder. Ama Hashtable keylerde ve value lerde null kullanılmasına müsade etmez.
        3) HashMap hızlıdır. Hashtable HashMaplere göre yavaştır.
        4) HashMap ve Hashtable ikiside entyleri rastgele sıralar.
         */
        Hashtable<String, Integer> stdAges=new Hashtable<>();

        stdAges.put("Mustafa",41);
        stdAges.put("Seda",30);
        stdAges.put("Ekim",22);
        stdAges.put("Ali Can",18);
        //stdAges.put("Mehmet",null);

        System.out.println(stdAges);
    }
}
