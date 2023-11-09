package day_01;

public class C01_Variables {
    public static void main(String[] args) {

        int yas = 35;
        int sayi = 50;

        System.out.println(yas);
        System.out.println(yas);
        System.out.println(yas);
        System.out.println(yas);
        System.out.println(35);
        System.out.println(35);

        System.out.println("Sayı = " + sayi);
        System.out.println("yas = " + yas);
        System.out.println(yas);
        //String Variables non-primative data type " " içine yazılır. buyuk harfle başlar.
        String isim="Sebahattin";
        System.out.println(isim);
        System.out.println("isim = " + isim);

        //Variable'ı farklı bir variable'a kopyala
        int benimYasim=yas;
        System.out.println("benimYasim = " + benimYasim);

        String onunIsmi=isim;
        System.out.println(onunIsmi);
        //snake_case
        //kebab-case

        int yil=2023,ay=5,gun=04;
        System.out.println("yil = " + yil);
        System.out.println("ay = " + ay);
        System.out.println("gun = " + gun);


        isim="Veli";

        System.out.println("isim = " + isim);
        System.out.println("onunIsmi = " + onunIsmi);

        //Bir variable deklere et : x
        //Bir variable baslat : y
        //Başka bir variable başlat : z
        //x degişkenini y degişkeni ile başlat
        //Variable y'i guncelle
        //Degişkenleri yazdır
        //declare et
        double x;
        //variable başlat
        double y=12.5;
        //
        double z=33;//java z değerini 33.0 olarak algıladı ve hata vermedi.
        x=y;
        y=23.5;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);


    }


}
