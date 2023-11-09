package practice03;

import java.util.Arrays;

public class S03_PassByValue_ArrayDuzenleme {
    public static void main(String[] args) {
        /*
        Bir isimler arrayi içinde verilmiş bir ismin orijinal değerini değiştirmeden aşağıdaki işlemleri yapan metotlar yazın.
            String[] isimler = {"Ali Veli Can", "Mehmet Ahmet Bulut", "Ayşe Fatma Tepe"};
            - Her bir ismin tüm harflerini büyük yapın.
            - Her bir ismin tüm harflerini küçük yapın.
            - Her bir ismin başına ünvan ekleyin.
            - Her bir isimde sadece ilk isim ve soyismi yazın ve orta ismi kısaltarak yazın (Örnek: Ali V. Can)
            - Her bir ismin sadece ilk harflerini büyük, soyismin tamamını büyük harfle yazın.
    */
        String[] isimler = {"Ali Veli Can", "Mehmet Ahmet Bulut", "Ayşe Fatma Tepe"};
        System.out.println(Arrays.toString(isimler));
        tumuBuyuk(isimler);
        tumuKucuk(isimler);


    }

    public static void tumuBuyuk(String[] arr) {
        for (String w : arr) {
            System.out.println(w.toUpperCase());
        }
    }

    public static void tumuKucuk(String[] arr) {

        for (String w : arr) {
            System.out.println(w.toLowerCase());


        }
    }
    // son 3 ödev
}
