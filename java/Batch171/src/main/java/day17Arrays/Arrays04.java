package day17Arrays;

import javax.xml.transform.sax.SAXTransformerFactory;
import java.util.Arrays;

public class Arrays04 {
    public static void main(String[] args) {
        // örnek 1: sizie verilen bir cümlede kaç kelime olduğunu gösteren kodu yazınız.
         String s="Java is easy. Learn Java earn money";
         String word[]=s.split(" ");

        System.out.println(Arrays.toString(word));

        System.out.println("word.length = " + word.length);

        //örnek 2: size verilen bir cümlede kaç harf olduğunu gösteren kodu yazınız.

       String letters[]= s.replaceAll("[^a-zA-Z]","").split("");

        System.out.println(Arrays.toString(letters));
        System.out.println(letters.length);

    }
}
