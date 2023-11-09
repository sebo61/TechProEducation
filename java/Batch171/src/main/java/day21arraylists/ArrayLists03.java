package day21arraylists;

import java.util.List;

public class ArrayLists03 {
    public static void main(String[] args) {
        // kısa yoldan list nasil oluşturulur.
//        List<Integer> initials=List.of(1,2,3);
        // List.of() metodu değiştirilemez bir list yapmak için kullanılır.
        // değişiklikyapmaya yönelik metodları desteklemez.

     List<Character> initials =List.of('a','k','c','d','k');
       System.out.println(initials);
//        initials.remove(initials.indexOf('k'));
        System.out.println(initials);

        // indexOf(aranan karakter): metodu aranan karakterin ilk görünümünün indexsini verir.
        int r1= initials.indexOf('k');
        System.out.println(r1);
        // lastIndexOf () aranan karakterin son görünümünün indexini verir.
        int r2=initials.lastIndexOf('k');
        System.out.println(r2);



    }
}
