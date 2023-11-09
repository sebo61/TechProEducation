package day02datatypesmethodcreation;

public class Variables02 {
    /*
    Java'da temelde iki tip data vardir
        1)primitive data type:
            char, boolean, byte, short, int, long, float, double,

        2)non-primitive data type:
            String.....
     */

    /*
    Note 1 : primitive data typelarini java olusturmustur, biz olusturamayiz
    Note 2 : primitive data typelarinin isimlerinde sadece kucuk harf kullanilir
    Note 3 : primitive datalar data type larina gore memory de farkli farkli yer kaplarlar
    Note 4 : primitive datalar iclerinde sadece sizin atadigniz degeri barindirirlar
     */

    /*
    Non-primitive Data types
    Ornegin String non primitive bir data typedir
    * Uretilen her bir class ayni zamanda bir "non-primitive" data type dir. Bu yuzden "non-primitive"
    data typelar sinirisiz sayidadir denilebilir
    *Non-primitive data typelarin isimleri buyuk harf ile baslar
    *Non-primitive ler icin java memory de buyuklugune gore degisen boyutlarda yer ayirir
     */
    public static void main(String[] args) {
        //örnek1: ülke ismi için bir variable oluşturun.
        String countryName="Italy";
        System.out.println(countryName);
        /*
        primitive ve non-primitive data typlerı arası farklar
        1)primitive ler sadece bizim atadığımız değerleri içerir.
        non-primitivler bizxim atadığımız değeri ve methodları içerir.
        2)primitive ler küçük harfle başlar. non-primitiveler ise büyük harfle başlar.
        3)primitiveleri java üremiştir ve 8 tanedir.
        non-primitivleri ise java veya programcılar üretebilri. ve sınırsız sayıdadır.
        4)primitiveler memoryde data typelarına göre sabit boyutta bellek kullanırlar.
        non-primitivler için ise java memoryde büyüklüğüne göre değişken boyutlarda bellek kullanırlar.

         */



    }


}