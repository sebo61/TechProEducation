package Arrays;

import java.util.Arrays;

public class Min {
    public static void main(String[] args) {
        // örnek 1: integer 1 array oluşturarark içine 6 eleman yerleştiriniz.
        // bu elemanların en küçüğü ile en büyüğünün toplamını ekrana yazdırınız.
        int arr[]=new int[6];
         arr[0]=23;
         arr[1]=12;
         arr[2]=45;
         arr[3]=32;
         arr[4]=25;
         arr[5]=19;

        Arrays.sort(arr);

        System.out.println(arr[0]+arr[arr.length-1]);
        int minimum=arr[0];
        int maximum=arr[0];
        for (int w:arr){

            minimum=Math.min(minimum,w);
            maximum=Math.max(maximum,w);

        }
        System.out.println(minimum);
        System.out.println(maximum);

    }
}
