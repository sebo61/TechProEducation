package day31mapsexceptions;

import com.sun.tools.javac.Main;

public class E01 {
    public static void main(String[] args) {
    /*
    Exception beklenmeyen problem demektir. Java çözemediği bir sorunla karşılaştığında exception class ı devreye girer.
    Exception class ı bize karşılaşılan sorunun cinsini, bu sorunun nereden kaynaklandığını ve sebebini verir.

    Java, exception fırlattığında kodun çalışmasını durdurur. buna stop execution denir.
    Java, exception oluşturan kod için bizden karar vermemizi ister.
    Eğer hiçbir şey yapmazsak beklendiği gibi java kodumuzun çalışmasını durdurur.
        -Kodumuzun çalışmaya devam etmesini istiyorsak try catch ile exception oluşturmasi muhtemel kodlarimizi
        try catch içinde yazmalıyız.
        - Exception i halledebilmek için iki temel yol vardır.
            1) Exception a uygun çözümler üretebilirsiniz. exception Handling denir.
            2) Exception oluştuğunda bunu ilan eder ve geri çekilirsiniz. Buna da throw exception denir.
        -Exception a uygun çözümler üretmede try catch kullanılır.

        try block da yapılması gereken işlemler javadan istenir.
        Java islemi problemsiz bir şekilde yaparsa catch block java tarafından okunmaz.
        try block da işlem yapılırken exception oluşursa catch block devreye girer ve catch block içindeki kodlar calisir.
        try block da islem yapılırken exception oluşursa try block dan sonraki kodlar çalışmaz.

        catch parantezi içine karşılaşılması muhtemel olan exception class ismini ve bir obje ismi (e) koyarız.
        catch bloğuna ise exception ile karşılaşıldığında yapılması istenen kodları yazarız.

        if else kullanırsak oluşabilecek her proplemi spesific olarak if parantezine yazmamız gerekir buda neredeyse imkansızdır ve yazacağğımız kodu uzatır.
        ama try catch te java ilgili exception ile alakalı luşabilecek tüm problemleri yakalar.
     */


        int a=12;
        int b=0;
        divide(a,b);
        divide2(a,b);


    }
    // aritmetik exception yazdığınız kodda matematiksel işlem kullanıyorsanız alınabilecek bir exceptiondır.

    public static void divide2(int a,int b) {
        try {
            System.out.println("exeption öncesi");
            System.out.println(a / b);
            System.out.println("exception sonrası");
        } catch (ArithmeticException e) {
            System.out.println("do not divide by zero");
        }
    }
        //esinlikle tavsiye edilmez.
        public static void divide ( int a, int b){
            if (b == 0) {
                System.out.println("do not divide by zero");
            } else {
                System.out.println(a / b);
            }
        }
    }

