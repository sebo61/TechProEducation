package day18multidimesionalarray;

public class Md02 {
    public static void main(String[] args) {
        String student[][] = {{"Ali", "Kemal"}, {"Cemal"}, {"Ayhan", "Beyhan", "Seyhan"}, {"Ceyhan", "Kayahan"}};
        //örnek 1: Yukarıdaki student arrayinde içinde "m" harfi olan isimleri konsola yazdırınız.

        for (String[] w : student) {
            for (String k : w) {

                if (k.contains("m")) {
                    System.out.println(k);
                }


            }


        }
        //örnek 2: bir integer multidimesional array oluşturun. tüm elemanların çarpımını hesaplayın

        int nums[][]={{5,4},{2,3,2},{7}};
        int carp=1;

        for(int [] w:nums){

            for(int l:w){

                carp=carp*l;
            }

        }
        System.out.println(carp);

    }
}
