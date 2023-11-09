package suleymanHocaJava.day32maps;

import java.util.HashMap;

public class HashMap01 {
    public static void main(String[] args) {
        HashMap<String, Integer> stdAges = new HashMap<>();
        stdAges.put("Ajda", 77);
        stdAges.put("Ezel", 38);
        stdAges.put("Tom", 76);
        stdAges.put("Brad", 58);
        stdAges.put("Anjelina", 58);
        stdAges.put("Tom", 83);

        // key tekrarlı girilirse en sonuncuyu kabul eder.
        // HashMap entry leri rastgele sıralar. hızlı çalışır.
        // sıralarken key lere bakarak sıralama yapar.


        System.out.println(stdAges);

        stdAges.replace("Ezel", 39);

        System.out.println(stdAges);
        // replace key ve value varsa değişir.
        stdAges.replace("Anjelina", 57, 61);
        System.out.println(stdAges);

        stdAges.putIfAbsent("Ali", 60); //yoksa ekle, varsa ekleme
        System.out.println(stdAges);

        System.out.println(stdAges.get("Ayşe"));

        System.out.println(stdAges.getOrDefault("Ayşe", 0));

        System.out.println(stdAges.containsValue(99));
        System.out.println(stdAges.containsKey("Anjelina"));

        stdAges.remove("Ali");
        System.out.println(stdAges);


        stdAges.remove("Tom", 83);
        System.out.println(stdAges);

        HashMap<String, Integer> kidsAge = new HashMap<>();
        kidsAge.put("John", 12);
        kidsAge.put("Jim", 22);
        kidsAge.put("Jack", 32);

        // bir map i diğer mapin içine koyar.
        stdAges.putAll(kidsAge); // putAll metodu stdAges mapine kidsAge mapini ekler.
        System.out.println(stdAges);


    }
}
