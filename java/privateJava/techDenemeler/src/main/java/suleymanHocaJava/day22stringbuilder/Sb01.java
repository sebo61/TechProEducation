package suleymanHoca.day22stringbuilder;

public class Sb01 {
    /*
    1) String Builder string üreten bir class'tır.
    2) String class kullanarak String üretirlir. Java neden String Builder class ioluşturdu.
        String calss "inmutable" (değiştirilemez) string üretir. StringBuilder Class mutable (değiştirilebilir) String üretir.
    3) inmutable olmak demek orijinal değerin korunması, değiştirilemez olması demektir. Mutable olmak demek orijinal
        değerin değiştirilebilir olaması demektir.
    4) capacity Javanın size verdiği data depolama yer sayısıdır.  lenght ise kullanılan kısımdır.
    5) java başlangış olarak kapasiteyi 16 olaarak verir. kapasiteyi aşarsanız yeni capasite 2 katının 2 fazlası olacak şekilde
        değiştirilir.



     */
    public static void main(String[] args) {
        String s = "Java";
        s=s+"!";

        System.out.println(s); //Java!
        String u="Apex";
        String v="Apex";
        String y="C++";
        // StringBuilder nasıl oluştururlur?
        StringBuilder t= new StringBuilder("Python");

        //StringBuilder'lara nasıl ekleme yapılır?
        t.append("!");
        System.out.println(t); //Python!
        // 2. way
        StringBuilder r=new StringBuilder();
        r.append('c');
        System.out.println(r);

        //capacity ve lenght arasındaki fark
        StringBuilder sb1= new StringBuilder("Maney");
        int capacity= sb1.capacity();

        System.out.println(capacity); //21
        System.out.println(sb1.length()); //5
        sb1.append('!');
       int c= sb1.capacity();
        System.out.println(c);//21
        System.out.println(sb1.length()); //6

        //default capacity yi değiştirebilir miyiz?

        StringBuilder sb2=new StringBuilder(2);
        System.out.println(sb2.capacity());
        sb2.append("...");
        System.out.println(sb2.capacity()); //6




    }
}
