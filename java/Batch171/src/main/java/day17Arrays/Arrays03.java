package day17Arrays;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {
        // spesific bir elemanın array de olup olmadığını anlamak için gereken kodu yazınız.
        String names[] = {"K", "C", "R", "A", "S"};
        String el = "C";
        // 1. yol
        int counter = 0;
        for (String w : names) {
            if (w.equals(el)) {
                counter++;
                break;
            }
        }
        if (counter > 0) {
            System.out.println("Array has " + el);
        } else {
            System.out.println("Array does not " + el);
        }
        // 2. yol: binarySearch() metodu hızlı çalışır.
        /*
        1) binarySearch() metodunu sort() kullanmadan kullanmyın. çünkü binary search mantığı sıralı elemanlar için geçerlidir.
        2) binarySearch() metodu var olan elemanlar için size o elemanın indexini verir.
        3) binarySearch() metodundan aldığını z index 0 veya sıfırdan büyükse o eleman array'de var demektir.
        4) binarySerach () metodu olmayAn elEmanlar için negatif tam sayı değeri verir.
        "-" işaetinin anlamı o eleman yok demektir.
        "sayi" ise o eleamAn olsaydı kaçıncı eleman olurdu demektir.

        */
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        int result = Arrays.binarySearch(names, el);
        if (result<0){
            System.out.println("Arrau does not have "+el);
        }else {
            System.out.println("array has "+el);
        }
    int num=Arrays.binarySearch(names,"K");
        System.out.println(num);
        int num1=Arrays.binarySearch(names,"U");
        System.out.println(num1);

    }
}
