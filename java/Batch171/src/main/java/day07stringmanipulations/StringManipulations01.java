package day07stringmanipulations;

import java.util.regex.Matcher;

public class StringManipulations01 {
    public static void main(String[] args) {

        String t = "Ali 13 yasindadir!...";
        //Ornek1: "t" stringindeki tum rakamlari "*" ceviriniz

        //Note:Bir grup datayi ifade etmek icin "Regular Expressions" Regex kullaniriz
        //Note:Bir grup datayi degistirmek icin replaceAll()kullanilir
        /*
                        Meshur Regex
           1)Tum  rakamlar ==> [0-9]
           2)Tum kucuk harfler==> [a-z]
           3)Tum buyuk harfler==> [A-Z]
           4)Tum kucuk ve buyuk harfler==> [a-zA-Z]
           5)Tum harfler ve rakamlar ==>[a-zA-Z0-9]
           6)Tum noktalama isaretleri==>\\p{Punct}
           7)Tum sesli harfler ==> [aeiouAEIOU]
             Tum x,q,w harfleri     ==> [xqw]i

           8)Kucuk harflerden farkli tum characterler ==>[^a-z]
           9)Tum harflerden farkli tum characterler ==>  [^a-zA-Z]
           10) Sadece space karakteri ==> \\s
           11) space karakteri hariç ==> \\S
           12) Sadece rakamlar.==> \\d
           13)rakamlar hariç ==>\\D
         */

        String t1 = t.replaceAll("[0-9]","*");
        System.out.println(t1);//Ali ** yasindadir!...
        //örnek 2: "t" strigindeki  tüm rakamları ve harfleri ümlem

        String s = t.replaceAll("[0-9a-zA-Z]", "!");
        System.out.println("s = " + s);
        //ornek 3: "t" sitringinde. tüm sesli harfleri ?

        String m = t.replaceAll("[aeiouAEIOU]", "?");
        System.out.println("m = " + m);
        //"t" sitringinde küçük harfler dışındakileri "<>"
        String t4 = t.replaceAll("[^a-z]", "<>");
        System.out.println("t4 = " + t4);
        //ornek 5: "t" sit.. ki tüm harfler dışındakileri "+"
        String t5 = t.replaceAll("[^a-zA-Z]", "+");
        System.out.println("t5 = " + t5);

        //ornek 6: "t" stringindeki spaceler dışındaki karakterleri "?";
        String t6 = t.replaceAll("[^\\s]", "?");
        System.out.println("t6 = " + t6);
        //ORNEK 7: "t" stri sesli harfler hariç tüm karakterleri "&"
        String t7 = t.replaceAll("[^aeiouAEIOU]", "&");
        System.out.println("t7 = " + t7);


    }
}