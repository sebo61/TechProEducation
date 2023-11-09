package day06swapvaluesstringmanipulations;

public class StringManipulation02 {
    public static void main(String[] args) {
        String s = "Learn Java earn money";
        //ornek1: "s" Satringinin "money" ile bitip bitmediği

        boolean stop = s.endsWith("money");
        System.out.println("stop = " + stop);
        //ornek 2:"s" stringinin içindeki "money" kelimesini "dollar" kelimesine çeviriniz.

        String rStr = s.replace("money", "dollar");
        System.out.println("rStr = " + rStr);

//ornek 3
        String r1 = s.replace(" earn ", " win ");
        System.out.println("r1 = " + r1);
        //ornek 4: ayı *' a çevir.
        String convert = s.replace('a', '*');
        System.out.println("convert = " + convert);
        //ornek 5: s stringndeki tüm n harflerini "xxx" e değiştirin

        String c = s.replace("n", "xxx");
        System.out.println("c = " + c);
        //ornek 6: s deki e harflerini silin

        String sil = s.replace("e", "");
        System.out.println("sil = " + sil);
        String t = "Ali 13 yaşındadr!...";

        //ornek 7: "t" stringindeki tüm rakamları yıldıza(*) ceviriniz.
        //not: bir grup datayı ifade etmek için "Regular Expressions" "Regex" kullanırız.
        //Not: bir grup datayı değiştirmek için replaceAll() kullanılır.
        /*
        Meşhur Regex

        1)Tüm rakamlar ==> [0-9]
        2)Tüm küçük harfler ==> [a-z]
        3)Tüm Büyük  harfler ==> [A-Z]
        4)tÜM KÜÇÜK BÜYÜK HARFLER ==> [a-zA-Z]
        5)Tüm harfler ve rakamlar ==Z [a-zA-Z0-9]
        6)Tüm noktalama işaretleri ==> \\p{Punct}
        7) Tüm sesli harfler ==> [aeiouAEIOU]
                x,q,w ==>[xqw]
        8) Küçük harflerden farklı tüm karakterler ==> [^a-z]
        9) Tüm harflerden farklı tüm karakterler. ==> [^a-zA-Z]

*/
        String t1= t.replaceAll("[0-9]","*");
        System.out.println("t1 = " + t1);
    }
}
