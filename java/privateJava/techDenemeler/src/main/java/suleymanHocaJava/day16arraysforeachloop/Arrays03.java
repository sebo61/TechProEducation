package suleymanHoca.day16arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {
        // specific bir elemanın arrayde olup olmadığı anlamak için gerekn kodu yazınız.

        String names[]={"K","C","R","A","S"};
         String el="E";
            //1. yol
         int counter=0;

         for (String w: names ) {
             if(w.equals(el)){
                 counter++;
                 break;
             }
         }
         if (counter>0){
             System.out.println("array has "+ el);
         }else {
             System.out.println("array does not have "+ el);
         }
         //2. yol binarySearh() mryhod hızlı arama yapar.
        Arrays.sort(names);
         //binay search metodunu sort kullanmadan kullanmayın. çünkü binarySearch mantığı sıralı elemanlar için gecerlidir.
        // binarySearch() metodu var olan eleman için index değrini verir.
        // değr 0 vbeya büyükse arrayde  var demektir.
        // binarySeach() metodu olmayan elemanlar için negatif tam sayı değeri verir. - işaretinşin anlamı o eleman yok demektir.
        // sayı ise o eleman olsaydı kaçıncı eleman olurdu demektir. (index değil)
        int result= Arrays.binarySearch(names,el); //0
        System.out.println(result);
        if (result<0){
            System.out.println("array does not have "+ el);
        }else{
            System.out.println("array has "+ el);
        }

    }
}
