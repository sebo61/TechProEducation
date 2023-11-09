package day30maps;

import java.util.HashMap;

public class HashMap02 {
    public static void main(String[] args) {
        HashMap<String,Integer> stdAges=new HashMap<>();
        stdAges.put("Suat",36);
        stdAges.put("Yusuf",33);
        stdAges.put("Serkant",26);
        stdAges.put("Emin",19);
        stdAges.put("Alparslan",30);
        stdAges.put("Alparslan",33);
        // key'i tekrarlı  kullandığımızda hata vermez. en son verilen entry nin dğerini kabul eder.
        // bu yöntem value güncelleme de kullanılabilir. buna da "overwrite" denir.
        System.out.println(stdAges);
        //replace() metodu valueları keylerikullanarak update etmeye yarar.
        stdAges.replace("Alparslan",19);
        System.out.println(stdAges); //{Suat=36, Yusuf=33, Alparslan=19, Serkant=26, Emin=19}
        // replace ("serkant",26,23); metodu mapin içinde key ve value kısmı eşleşirse gunceller.
        stdAges.replace("Serkant",26,23);
        System.out.println(stdAges); //{Suat=36, Yusuf=33, Alparslan=19, Serkant=23, Emin=19}
        stdAges.putIfAbsent("Emin",30);
        //putIfAbsent ("Ali",30) metodu mapde Ali key olarak yoksa keyini 30 valusu ile ekler varsa eklemez.
        System.out.println(stdAges); // {Suat=36, Yusuf=33, Alparslan=19, Serkant=23, Emin=19} yoksa ekler. vardı
        stdAges.putIfAbsent("Ali",30);
        System.out.println(stdAges);

        System.out.println(stdAges.get("Yusuf")); //33
        System.out.println(stdAges.getOrDefault("Yusuf",0));//33
        // eğer eleman mapde yoksa map null verir.
        // getOrDefault () metodu ise sizin belirlediğiniz değeri verir.
        System.out.println(stdAges.get("Fatih")); //null
        stdAges.getOrDefault("Fatih",0); //0
        //containsValue(313) metodu value larin içinde 313 ün olup olmadığını kontrol eder.
        System.out.println(stdAges.containsValue(313)); //false
        System.out.println(stdAges.containsKey("Mehmet")); //false
        // remove ("Emin") metodu key kullanarak entry yi silmeye yarar.
        stdAges.remove("Emin");
        System.out.println(stdAges); //{Suat=36, Yusuf=33, Alparslan=19, Serkant=23, Ali=30}
        //remove("Suat",36) metodu hem key hem value kısmını kontrol eder. eşleşirse siler.
        stdAges.remove("Suat",36);
        System.out.println(stdAges); //{Yusuf=33, Alparslan=19, Serkant=23, Ali=30}



    }
}
