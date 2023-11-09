package day05concatinationoperatorstypecasting;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class AsciiValues {
    public static void main(String[] args) {
/*
javada her karakterin sayisal bir değeri vardır. bu değerler ascii değerler olarak adlandırılır. bu değerlerin tamamının bulunduğu tabloya asci table denir.

 */

        char a='a';
        System.out.println(a);//a
        int intA='a'; //97
        System.out.println(intA);
        //herhangi bir karakterin ascii değerini bulmak için o karaterin int data typeinde bir variable içine koyunuz.

        int unlem='!';
        System.out.println(unlem);
        char c1='K';
        char c2='?';

        System.out.println(c1+c2);
        //java da eğer charları matematiksel işlemlerde kullanırsak java charların ASCII değerlerini kullanır.

    }
}
