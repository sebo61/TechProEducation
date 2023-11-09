package day20statickeywordconstructors;

import javax.xml.transform.sax.SAXTransformerFactory;

public class StaticBlocks01 {
    static double pi;
    static String shape;
    //bir variable oluşturduğumuzda değer atamazsak o variavle ı "initalize" etmedik demektir.
    // başlatmadık demek.

    // bazen main method çalıştırılmadan önce variable ların hazır hale getirilmesi gerekir
    // bu yüzden static bloklar kullanılır
    // static variable lar static bloclar içinde initalize edilirse o clasin içinde
    // her şeyden önce hazır hale getirilmiş olur.
    //birden fazla static block olması durumunda yukarıda olan önce çalışır.
    static {
        pi=3.14;
        System.out.println("static block 1");
    }
    static {
        shape="Circle";
        System.out.println("static block 2");
    }
    public static void main(String[] args) {
        System.out.println(pi);
        System.out.println("main metot");
    }

}
