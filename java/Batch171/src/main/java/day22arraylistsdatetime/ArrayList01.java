package day22arraylistsdatetime;

import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {
        // örnek : Bir listteki tekrarsız elemanları konsola yazdıran kodu yazınız.
        List<Double> prices = List.of(2.5, 1.25, 2.5, 3.75, 1.25, 4.0);
        for (Double w : prices) {
            if (prices.indexOf(w) == prices.lastIndexOf(w)) {
                System.out.println(w);
            }
        }
        // örnek 2: bir listte tekrarlı eleman olup olmadığını gösteren kodu yazınız.
        int counter=0;
       List<Integer> heights= List.of(3,13,23);
        for (Integer w:heights){

            if(heights.indexOf(w) !=heights.lastIndexOf(w)){
              counter++;
            }
        }
        if (counter==0){
            System.out.println("All elements are unique in the list");

        }else {
            System.out.println("At least one element is not unique in the list");
        }
    }
}


