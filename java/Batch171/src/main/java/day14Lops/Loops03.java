package day14Lops;

import java.util.Scanner;

public class Loops03 {
    public static void main(String[] args) {
        /*
        Example 1: Kullanicidan baslangic ve bitis degerlerini alin.
        Baslangic degerinden baslayip bitis degerine kadar aradaki tum cift tamsayilari ekrana yazdiriniz
         9 - 14 ==> 10  12  14     */

        Scanner input = new Scanner(System.in);

        System.out.println("Başlangış değerlerini giriniz.");

        int start = input.nextInt();
        System.out.println("Bitiş değerlerini giriniz.");
        int stop = input.nextInt();
        if (start > stop) {
            System.out.println("başlangıç değeri bitiş değerinden büyük olmasın.");

        } else {

            for (int i = start; i <= stop; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }

            }
        }
        // örnek 2: hiç sayı kullanmadan birden 100 kadar olan sayıları konsola yazdırınız.
        for(int i='d'/'d'; i<='d';i++){
            System.out.println(i);
        }
        //note 1
        // bazı looplar sonsuz defa çalışabilir. bu tarz looplara infinite loop denir.
        //sonsuz loop genellikle "increment/decrement" kısmında yapılan hatadan kaynaklanır.
        // note 2: loop oluşturduğuzda ikinci kısmı yazmazsanız yine sonsuz loop oluşur. 
    }
}
