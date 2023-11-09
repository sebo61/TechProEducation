package day18multidimesionalarray;

public class Md04 {
    public static void main(String[] args) {
        //örnek : Bir int multidimasional array'deki en küçük ve en büyük elemanı toplamını
        //bulunuz.
        int ages[][] = {{15, 4}, {12, 43, 21}};//==> 4+43=47

        int small = ages[0][0];
        int max=ages[1][1];

        for (int[] w : ages) {

            for (int k : w) {
               small= Math.min(small, k);
               max=Math.max(max,k);

            }

        }
        System.out.println(small);
        System.out.println(max);
        System.out.println("toplam:"+(small+max));


    }
}
