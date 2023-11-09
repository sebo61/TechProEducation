package suleymanHocaJava.day19arraylists;

import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {
    /*
    Bit metod öğrenilirken aşağıdaki 3 şeyi öğrenin;
    1) O metod ne iş yapar?
    2) O metod nasıl kullanılır?
    3) O metod size ne verir?
     */
    public static void main(String[] args) {
        ArrayList<String> cities=new ArrayList<>();
        cities.add("Miami");
        cities.add("Giresun");
        cities.add("Giresun");
        cities.add("Giresun");
        cities.add("Yozgat");
        cities.add("Yozgat");
        cities.add("Barcelona");
        cities.add("Miami");

        System.out.println(cities);
        //ArrayList'te bir elemanın ilk görünümü nasıl silinir?
        cities.remove("Miami");
        System.out.println(cities);
        //Javada bir elemanı indexi kullanarak nasıl sileriz?
        cities.remove(2);
        System.out.println(cities);
        // ArrayList oluştururken en başa List'te yazılabilir.
        List<Integer> ages=new ArrayList<>();
        ages.add(23);
        ages.add(12);
        ages.add(7);
        ages.add(4);
        //example 1: 12 elemanını listten siliniz.

        ages.remove((Integer) 12);
        System.out.println(ages);
        // Bir ArrayList'teki biir elemanın tüm görünümleri silmek.
        List<String> citiesToRemove=new ArrayList<>();
        citiesToRemove.add("Giresun");
        citiesToRemove.add("Yozgat");
        cities.removeAll(citiesToRemove);
        System.out.println(cities);

        // İki ArrayList'in birbirine eşit olup olmadığını nasıl anlarız?
        //Kısa yoldan List oluşturmak için "List.of()" metodu kullanılır.
        List<Character> initials=List.of('a','k','c','d','k');
        System.out.println(initials); //[a, k, c, d,k]
        List<Character> letters=List.of('a','c','k','d','k');
        System.out.println(letters); //[a, c, k, d,k]
        // equals() metodu aynı elemanlar aynı indexte olduğu sürece true verir.
        boolean r1=initials.equals(letters);
        System.out.println(r1);

        int result= initials.indexOf('k');
        System.out.println(result);
        int r3= initials.lastIndexOf('k');
        System.out.println(r3);
        //bir listedeki tekrarsız elemanları consola yazdıran kodu yazınız.

        List<Double> price=List.of(2.5,1.25,2.5,3.75,1.25,4.0);

        for (Double w: price  ) {
            if (price.lastIndexOf(w)==price.indexOf(w)){
                System.out.println(w);
            }

        }
        //bir listte tekrarlı eleman olup olamadığını gösteren kodu yazınız.
        List<Double> heights=List.of(2.5,1.25,2.5,3.75,1.25,4.0);
        int counter=0;


        for (Double w:heights ) {

            if (price.indexOf(w)!=price.lastIndexOf(w)){
        counter++;
            }
        }
        if(counter==0){
            System.out.println("All elemnts are uniq");
        }else{
            System.out.println("at last one element is not unique in the list");
        }

    }
}
