package suleymanHocaJava.day31collectionsmaps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//map ler collection değildir.
public class HashMap01 {
    public static void main(String[] args) {
        HashMap<String, Integer> countryPopulation = new HashMap<>(); // key ve value ayrı data tipi olabilirler.

        countryPopulation.put("Türkiye", 85000000);
        countryPopulation.put("Germany", 83000000);
        countryPopulation.put("Albenia", 3000000);
        countryPopulation.put("USA", 400000000);
        countryPopulation.put("Netherland", 18000000);

        System.out.println(countryPopulation); //rastgele soralar hızlı olmak için.
//get () metodu key ile çalışır,value değerini verir.
        System.out.println(countryPopulation.get("USA"));
        System.out.println(countryPopulation.keySet());

        System.out.println(countryPopulation.values());
        Collection<Integer> values = countryPopulation.values();
        int populationAvg = 0;
        for (Integer v : values) {
            populationAvg += v;

        }
        System.out.println("Country avg population:" + populationAvg / values.size());

        Set<Map.Entry<String, Integer>> entries = countryPopulation.entrySet();
        System.out.println(entries);

        // co.. mapindeki ülkelerin isimlerinin karkater sayısı ile nüfus toplamı
        int toplam = 0;

        for (Map.Entry<String, Integer> w : entries) {
            toplam = toplam + w.getKey().length() + w.getValue();


        }
        System.out.println(toplam);

    }
}
