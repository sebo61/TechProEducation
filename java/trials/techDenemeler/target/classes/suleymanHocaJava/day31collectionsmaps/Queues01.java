package suleymanHocaJava.day31collectionsmaps;

import java.util.LinkedList;
import java.util.Queue;

public class Queues01 {
    public static void main(String[] args) {
        Queue<String> wareHouse = new LinkedList<>(); // fifo
        wareHouse.add("milk");
        wareHouse.add("meat");
        wareHouse.add("bread");
        wareHouse.add("egg");
        wareHouse.add("cheese");

        System.out.println(wareHouse);
        wareHouse.remove();

        System.out.println(wareHouse);

        System.out.println(wareHouse.peek());
        System.out.println(wareHouse);

        System.out.println(wareHouse.element());
        System.out.println(wareHouse.poll());
        System.out.println(wareHouse);
        wareHouse.clear();
        System.out.println(wareHouse.poll());
        System.out.println(wareHouse.remove());


    }
}
