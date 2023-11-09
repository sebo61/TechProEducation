package suleymanHocaJava.day20arraylistsdatetime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList01 {
    /*
    1) String class kullanmak tercih edilir. Çünkü String Class method acısından zengindir.
        list.of() ile oluşturlan lsiteye ekleme yapılamaz. değiştitirilemez. silinemez.

     */
    /*
    exmple 1: kullanıcının girdii harf liste varsa o harfi buldun a cevirin yoksa o harfi list e ekleyin.

     */
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("A");
        myList.add("H");
        myList.add("J");
        myList.add("K");
        myList.add("M");

        Scanner input = new Scanner(System.in);
        int counter = 0;
        int size=myList.size();
        do {
            if (counter == size) {
                System.out.println(myList);

                break;
            }
            System.out.println("Please enter a letter..");
            String letter = input.next().toUpperCase().substring(0, 1);

            if (myList.contains(letter)) {
                myList.set(myList.indexOf(letter), "buldum");

            } else {
                myList.add(letter);
            }
            counter++;

        } while (true);

    }
}
