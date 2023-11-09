package day30maps;

import java.util.*;

public class HashMap01 {
    public static void main(String[] args) {
        /*
        1) map lerde sözlüklerde ki gibi kelime ve manası gibi bir kullanım vardır.
        2) key kısmı tekrarsızdır. value kısmı tekrarlı olabilir.
        3) maplerdeki her bir elemana entry denir. tamamına ise entrySet denir.
        4) entry ler tekrarsız olduğu için entrySet denir.
        5) key ve value lar ari ayri data typelarında olabilirler.
        6) mapler collection değildir farklı bir yapıdır.
        7)HashMap ler entryleri rastgele sıralar bu yüzden en hızlı maptir.

         */
        // map nasıl oluşturulur?
        HashMap<String,Integer> countryPopulation=new HashMap<>();
        countryPopulation.put("Germany",83000000);
        countryPopulation.put("Albenia",3000000);
        countryPopulation.put("USA",400000000);
        countryPopulation.put("Turkey",83000000);
        countryPopulation.put("Netherland",18000000);
        System.out.println(countryPopulation); //{Netherland=180000000, USA=400000000, Turkey=83000000, Albenia=3000000, Germany=83000000}
        // get metodu key ile çalışır ve value kısmını verir.
        Integer usaPopulation= countryPopulation.get("Turkey");
        System.out.println(usaPopulation);
        //bütün keyleri nasıl alabiliriz.
        Set<String> keys= countryPopulation.keySet();
        System.out.println(keys); //[Netherland, USA, Turkey, Albenia, Germany]
        // bütün valueleri nasıl alabiliriz.
       Collection<Integer> value =countryPopulation.values();
        System.out.println(value);

        // örnek countryPopulation mapindeki ülkeleri mapsindeki ülkelerin nüfus ortalaması

        Collection<Integer> values =countryPopulation.values();

        int sum=0;
        for (int w:values) {
            sum+=w;

        }
        System.out.println("ortalama"+sum/values.size());
        // lop lar maplaer ile kullanılamaz bunun için entrySet metodunu kullanırız.
        // entrySet() mapteki entryleri kalıp halinde alıp bize Setin içine koyarak verir.
        Set<Map.Entry<String,Integer>> entries= countryPopulation.entrySet();
        System.out.println(entries);
        //ornek 2: courtyPopulation mapindeki ulkelerin karakter sayısı ile nüfusları toplamını bulunuz.
        int toplam=0;
        for (Map.Entry<String,Integer> w: entries) {

           toplam+= w.getKey().length()+w.getValue();
        }
        System.out.println(toplam);
    }
}
