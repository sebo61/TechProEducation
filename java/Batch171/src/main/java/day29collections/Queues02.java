package day29collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues02 {
    public static void main(String[] args) {
        Queue<String> line=new PriorityQueue<>();
        line.add("Egg");
        line.add("Milk");
        line.add("Cheese");
        line.add("Meat");
        System.out.println(line);
        /*
        Queue bir interfaces dir. bu yüzden consructor ı yoktur. Dolayısı ile obje oluştururken new keywordünden
        sonra queue yazamayız.
         Data taype ı queue olan bir object oluşturmak için
         1) LinkedList veya  2) PriorityQueue classları kullanılabilir.
         Queue oluştururken consructor olarak   PriorityQueue kullanırsak elemanlarıkendi belirleyeceğiz
         kurala göre sıralama hakkınız olur
         */

            // Deque ==>  double ended Queue (iki uclu queue)
        Deque<String> d=new LinkedList<>();
        // Deque daki add(), get () vb metodlar first-last şeklinde 2 uclu olarak bulunur.
        d.add("Egg");
        d.add("Milk");
        d.add("Cheese");
        d.add("Meat");
        System.out.println(d); //[Egg, Milk, Cheese, Meat]


    }
}
