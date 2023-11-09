package day29collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queues01 {
    public static void main(String[] args) {
        Queue<String> depo=new LinkedList<>();

        depo.add("Egg");
        depo.add("Milk");
        depo.add("Cheese");
        depo.add("Meat");
        System.out.println(depo);

        depo.remove();
        System.out.println(depo);

        System.out.println(depo.peek());
        System.out.println(depo.poll());
        System.out.println(depo);
        System.out.println(depo.element());
        depo.clear();
        System.out.println(depo.poll());
       // System.out.println(depo.remove());
        // System.out.println(depo.element());
        System.out.println(depo.peek());


    }
}
