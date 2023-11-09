package Arrays;

import java.util.List;

public class ArrayListDeneme01 {
    public static void main(String[] args) {

        List<Double> prices=List.of(2.5, 1.25, 2.5, 3.75, 1.25, 4.0);
        for (Double w:prices){
            if(prices.indexOf(w)==prices.lastIndexOf(w)){
                System.out.println(w);
            }

        }
        int counter=0;
        List<Integer> heights=List.of(3,13,3);
        for (Integer w:heights){
            if (heights.indexOf(w) !=heights.lastIndexOf(w)){
                counter++;
            }
        }
        if ( counter==0){
            System.out.println("aLL ELEMENTS ARE UNİQUE İN THE LİST");
        }else {
            System.out.println("At last one element is not unique in the list");

        }
    }
}
