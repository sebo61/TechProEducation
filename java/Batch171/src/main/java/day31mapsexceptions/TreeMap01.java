package day31mapsexceptions;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMap01 {
    public static void main(String[] args) {
        /*
        1) TreeMap thread-safe ve synhronized değildir.
        note: maplerde multitheread kullanmamaız gerektiğinde sadece Hashtable kullananabilirsiniz.
        2) TreeMap entryleri keylerine göre natural order a göre sıralar. bu yüzden çook yavaştır.
        3) TreeMaplerin keylerinde null kullanılamaz ama valuelerinde istediğiniz kadar kullanabilirsiniz.
        */
        long t1 = System.nanoTime();
        TreeMap<String, Integer> countryPopulations= new TreeMap<>();
        countryPopulations.put("USA",400000000);
        countryPopulations.put("Netherlans",18000000);
        countryPopulations.put("Türkiye",83000000);
        countryPopulations.put("Belgium",12000000);
        countryPopulations.put("Mexico",125000000);
        countryPopulations.put("Brasil",215000000);
        countryPopulations.put("France",60000000);

        System.out.println(countryPopulations);
        long t2 = System.nanoTime();

        HashMap<String,Integer> countryPop=new HashMap<>();
        countryPop.put("USA",400000000);
        countryPop.put("Netherlans",18000000);
        countryPop.put("Türkiye",83000000);
        countryPop.put("Belgium",12000000);
        countryPop.put("Mexico",125000000);
        countryPop.put("Brasil",215000000);
        countryPop.put("France",60000000);

        TreeMap<String,Integer> countryPopTree=new TreeMap<>(countryPop);
        System.out.println(countryPopTree);

        long t3=System.nanoTime();

        System.out.println(t2-t1);//treemap
        System.out.println(t3-t2);//hashmap


    }

}
