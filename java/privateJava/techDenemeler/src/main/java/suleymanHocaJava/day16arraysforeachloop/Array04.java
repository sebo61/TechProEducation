package suleymanHoca.day16arraysforeachloop;

import java.util.Arrays;

public class Array04 {
    public static void main(String[] args) {
        // size verilen bir cümlede kaç kelime olduğunu gösteren kodu yazınız.

        String s="Java is easy. Learn Java earn money.";

       String words[]= s.split(" ");
        System.out.println(Arrays.toString(words)); //[Java, is, easy., Learn, Java, earn, money.]
        System.out.println(words.length); //7
        // size verilen bir cümlede kaç harf olduğunu gösteren kodu yazınız.

        String letters[]= s.replaceAll("[^a-zA-Z]","").split("");
        System.out.println(Arrays.toString(letters)); //[J, a, v, a, i, s, e, a, s, y, L, e, a, r, n, J, a, v, a, e, a, r, n, m, o, n, e, y]
        System.out.println(letters.length); //28


    }
}
