package suleymanHocaJava.day33maps;

import java.util.HashMap;
import java.util.TreeMap;

public class HashMap01 {
    public static void main(String[] args) {
        //verilen bir stringde hangi harfin kaç defa kullanıldığını veren metot

        TreeMap<String,Integer> letterCount= getTheOfOccurrenceOfLetters("bbbacc ");
        System.out.println(letterCount);

    }

    public static TreeMap<String, Integer> getTheOfOccurrenceOfLetters(String s) {
        //harf dışı karakterleri sildik.

        s = s.replaceAll("[^A-Za-z]", "");
        // görünüm sayılrı için map oluştur.

        TreeMap<String, Integer> numOfOccurence = new TreeMap<>();

        // harfleri al.
        String letters[] = s.split("");
        //loop oluştur

        for (String w : letters) {
            Integer num = numOfOccurence.get(w);
            if (num == null) {
                numOfOccurence.put(w, 1);

            } else {
                numOfOccurence.replace( w, num + 1);

            }
        }

        return numOfOccurence;

    }
}
