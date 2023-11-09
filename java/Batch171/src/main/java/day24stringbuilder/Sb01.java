package day24stringbuilder;

public class Sb01 {
    public static void main(String[] args) {
        /*
        1) StringBuilder class i string üreten bir classdir.
        2) string class kullanarak string üretiriz java niçin StringBuilder class ida üretmiştir.
            String class "immutable" (değiştirilemez) string üretir.
            StringBuilder "mutable" (değiştirilebilir string üretir.
        3) "immutable" olmak demek orjinal değerin korunması, değiştirelmez olması demektir.
            "mutable" olmak demek orjinal değerin değştirelebilir olması demektir.

         */
        // Immmutable
        String s = "Java";
        String t = s + "i";
        String w = t + "?";

        //stringi değiştirdikten sonra aynı stringe assing edersek java yine yen ir koyteyner olşturur
        //değişmiş değeri bu yeni container in içine koyar ve eski koyteyner i gösteren yeni container a yönlendirir.
        //dolayısı ile eski konteyner adressiz kalır ve garbage collector adressiz olan containeri siler.

        String a = "Money";
        a = a + "More";

        //mutable
        //StringBuilder kullanarak string oluşturmanın 1. yolu
        StringBuilder sb1 = new StringBuilder("Python");
        System.out.println(sb1);
        sb1.append("!");
        System.out.println(sb1);
        //StringBuilder kullanarak string oluşturmanın 2. yolu
        StringBuilder sb2 = new StringBuilder();
        System.out.println(sb2.capacity());

        sb2.append("Java");
        sb2.append("xxxxxxxxxxxxxxx");
        System.out.println(sb2.length());//4
        System.out.println(sb2.capacity());
        //capacity () ve lentgh () arasındaki fark nedir?
        /*
        capacity() javanın size vediği data depolama yer sayısıdır.
        length() ise bize verilen data depolama yerinin kulanılan kısmıdır.

        java başlangış olarak size capacity yi 16 olarak verir.
        siz verilen capacityi aşarsanız java yeni capacity yi varolanın 2 katının 2 fazlası olacak
        şekilde değiştirir.
        16 ==>16*2+2  - 34==> 34*2+2
         */
        //default capacityi nasıl değiştirebiliriz?
        StringBuilder sb3=new StringBuilder(3); //capacity 3 oldu
        sb3.append("ali");
        System.out.println(sb3.capacity());
        System.out.println(sb3.length());
    }

}
