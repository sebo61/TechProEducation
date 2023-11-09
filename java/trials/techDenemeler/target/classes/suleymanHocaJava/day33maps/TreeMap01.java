package suleymanHocaJava.day33maps;

import java.util.TreeMap;

public class TreeMap01 {
    /*
    1) TreMap thread-safe ve synchrozid değildir.
        not: multi-thread kullanılması gerektiğinde sadece HashTable kullanabilirsiniz.
    2) TreeMap ler keylerde null a izin verir. value lara null kullanımına müsaate etmez.
    3) TreeMap etryleri keylerine göre natural-order a göre sıralar. bu yüzden çok yavaştır.
     */
    public static void main(String[] args) {
        TreeMap<String,Integer> countryPopulations=new TreeMap<>();


        countryPopulations.put("USA",400000000);
        countryPopulations.put("Netherland",18000000);
        countryPopulations.put("Turkiye",83000000);
        countryPopulations.put("Belgium",13000000);
        countryPopulations.put("Mexico",11000000);
        countryPopulations.put("Brazil",215000000);
        countryPopulations.put("France",75000000);
        countryPopulations.put("Finland",8000000);
        countryPopulations.put("Germany",86000000);
        countryPopulations.put("Madagaskar",23000000);

        System.out.println(countryPopulations);

    }
}
