package Arrays;

import java.util.Arrays;
import java.util.spi.ToolProvider;

public class ArrayDenemeler {
    public static void main(String[] args) {
        String names []= new String[5];

        names[0]="sebahattin";
        names[1]="Ali";
        names[2]="Hasan";
        names[3]="Kerim";
        names[4]="İlyas";



        System.out.println(Arrays.toString(names));

        System.out.println(names[0].length()+names[names.length-1].length());

        int toplam=0;

        for (int i=0;i<names.length;i++){

            toplam= toplam+names[i].length();

        }
        System.out.println(toplam);
        int sum=0;
        for (String w:names){
            sum=sum+w.length();


        }
        System.out.println("ikinci yol");
        System.out.println(sum);
        //ornek 3: notlar adında integer bir array oluşturunuz içine 6 tane not yerleştiriniz.
        // ve not ortalamasını ekrana yazdırınız.
        int not []=new int[6];
        not[0]=23;
        not[1]=70;
        not[2]=67;
        not[3]=50;
        not[4]=60;
        not[5]=40;


        double total=0;
        for(int w:not){

            total=total+w;
        }
        System.out.println(Arrays.toString(not));
        System.out.println("Ortalama..:"+(total/ not.length));



    }
}
