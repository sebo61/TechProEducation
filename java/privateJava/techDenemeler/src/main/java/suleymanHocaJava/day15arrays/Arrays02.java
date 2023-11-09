package suleymanHocaJava.day15arrays;

import java.util.Arrays;

public class Arrays02 {
    /* 1) applicationlarda data ile bu dataları işeleyen kodlar (logic) birbirinden ayrılır. yani logic dataya bağımlı olmamalıdır.
        dataya bağımlı olarak yazılan kodlara hard code denir. Hard Code hatalı kodlamadır.

     */
    public static void main(String[] args) {
        //Arrayleri kısa yoldan oluşturmak
        int grades[] = {56, 76, 8, 97, 0};

        System.out.println(Arrays.toString(grades));
        // exp 1:grades arrayindeki en büyük ve en küçük grade in toplamını ekrana yazdırın.
        Arrays.sort(grades);

        System.out.println(grades[0] + grades[grades.length - 1]);

        // exp 2: size cerilen bir string arraydeki isimlerden 5 karakterden az olanları konsola yazdırın.

        String[] stdNames= new String[5];
        stdNames[0]="Ajda";
        stdNames[3]="Cüneyt";
        stdNames[2]="Ali";
        stdNames[1]="Ayhan";
        stdNames[4]="Filiz";

        for (String w:stdNames
             ) {
            if (w.length()<5){
                System.out.println(w);
            }

        }

        //exp 3: string arraydeki isimleri alfabetik sıraya koyduktan sonra T ile başlayan isimlerden önceki isimleri onsola yazdırın.

        String[] isimler={"Tom","Jack","Alfert","Denis","Sam","Edison"};
        Arrays.sort(isimler);

        System.out.println(Arrays.toString(isimler));


        for (String w:isimler) {
            if (w.startsWith("S")){
                break;

            }else {
                System.out.println(w);
            }

        }
        //exp 3: string arraydeki isimleri alfabetik sıraya koyduktan sonra T ile başlayan isimlerden önceki isimleri ve 'T'
        // ile başlayanları consola yazdırın.

        String[] names={"Tom","Jack","Alfert","Denis","Sam","Edison"};
        Arrays.sort(isimler);

        System.out.println(Arrays.toString(isimler));


        for (String w:isimler) {
            System.out.println(w);
            if (w.startsWith("S")){
                break;
            }

        }
        //exp 5:
        String[] name1={"Tom","Jack","Alfert","Denis","Sam","Edison"};
        Arrays.sort(isimler); //mümerikler küçükten büyüğe (ascending), strinleri ise alfabetik dizer.
        // ascending ve alfebetik sıralama natural sıralamadır.

        System.out.println(Arrays.toString(isimler));


        for (String w:isimler) {
            if (w.startsWith("S")){
                continue;

            }else {
                System.out.println(w);
            }

        }

    }
}
