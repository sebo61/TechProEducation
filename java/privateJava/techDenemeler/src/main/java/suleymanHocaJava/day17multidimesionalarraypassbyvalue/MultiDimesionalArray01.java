package suleymanHoca.day17multidimesionalarraypassbyvalue;

import java.util.Arrays;

public class MultiDimesionalArray01 {
    /*
    Bir Arrayin elemanlarıda array olursa bu tarz arraylere multiDimesionalArray denir.
     */
    public static void main(String[] args) {
        // multiDimesionaArray nasıl oluşturulur.

        String names[][] = new String[3][2];
        names[1][0] = "P";
        names[2][1] = "Z";
        names[0][0] = "A";
        names[0][1] = "K";
        names[1][1] = "M";
        names[2][0] = "C";
        // multiDimesionalaRRAYleri yazdırmak için "deepToString()" metodunu kullanırız.
        System.out.println(Arrays.deepToString(names)); // [[A, K], [P, M], [C, Z]]

        // multiDimsional içinden specific eleman nasıl yazdırılır.

        System.out.println(names[1][1]); //M
        // multiDimsional içinden bir arrayi yazdırma
        System.out.println(Arrays.toString(names[0])); //[A, K]
        System.out.println(Arrays.toString(names[1])); //[P, M]
        // kısayoldan multiDimesional array nasıl oluşturulur?

        String student[][] = {{"ali", "kemal"}, {"cemal"}, {"ayhan", "beyhan", "seyhan"}, {"ceyhan", "kayahan"}};
        System.out.println(Arrays.deepToString(student));

        // yukarıdaki student arrayinde toplam kaç isim var?
        int sum = 0;

        for (String[] w : student) {
            sum += w.length;

        }
        System.out.println(sum); //8

        // yukarıdaki studenet arrayinde içinde "m" olan isimleri konsola yazdırımız.

        for (String[] w : student) {

            for (String t : w) {

                if (t.contains("h")) {
                    System.out.println(t);
                }
            }
        }
        // bir integer multiDi.. oluşturunuz tüm elemanların çarpımını hesaplayınız.
        int nums[][] = {{5, 4}, {2, 3, 2}, {7}};

        int multiple = 1;
        for (int[] w : nums) {
            for (int t : w) {

                multiple *= t;

            }

        }
        System.out.println(multiple);
        int numbers[][] = {{5, 4}, {2, 3, 2}, {7}};


        // iki boyutlu arrayi tek boyutlu array haline getirin.
        int toplamElemanSayisi = 0;
        for (int[] w : numbers) {

            toplamElemanSayisi = toplamElemanSayisi + w.length;

        }
        // tek boyutlu arrrayi 2 boyutlu eleman saytısını kullanarak oluşturulmalı
        int newArr[] = new int[toplamElemanSayisi];
        //  iki boyutlu elemanları tek boyutlu arraye transfer etmeliyiz.
        int idx = 0;
        for (int[] w : numbers) {
            for (int k : w) {
                newArr[idx] = k;
                idx++;
            }

        }
        System.out.println(Arrays.toString(newArr));

        // example 5: bir multiDimesional Arraydeki en küçük ve en büyük elemanın toplamnını bulunuz.
        int number1[][] = {{5, 4}, {2, 3, 2}, {7}};
        int elemanSayisi = 0;

        for (int[] w : number1) {
            elemanSayisi += w.length;

        }
        int yeniDizi[] = new int[elemanSayisi];
        int index = 0;
        for (int[] w : number1) {
            for (int t : w) {

                yeniDizi[index] = t;
                index++;
            }

        }
        System.out.println(Arrays.toString(yeniDizi));
        Arrays.sort(yeniDizi);
        System.out.println(Arrays.toString(yeniDizi));

        System.out.println(yeniDizi[0] + yeniDizi[yeniDizi.length - 1]);
        // arraydeki en küçük ve en büyük sayının toplamı
        // 2.yol

        int small = number1[0][0];
        int big = number1[0][0];

        for (int[] w : number1) {
            for (int k : w) {
                small=Math.min(small,k);
                big=Math.max(big,k);
            }

        }
        System.out.println(small);
        System.out.println(big);
        System.out.println(small+big);

    }
}
