package practice03.s07_constructor_ogrenci;

public class Ogrenci_Runner {
    public static void main(String[] args) {
        Ogrenci ogrenci1=new Ogrenci();
        ogrenci1.ogrenciAdi="Sebahattin";
        ogrenci1.ogrenciYasi=10;
        ogrenci1.ogrenciSinifi=5;

        System.out.println(ogrenci1);
        Ogrenci ogrenci2=new Ogrenci("Mustafa",13,11);
        System.out.println(ogrenci2);
       // Alıştırma: Bir öğrencinin adını ve sınıfını güncelleyin
        // ve değerlerini ekrana yazdırın
        ogrenci2.ogrenciAdi="Mehmet";
        ogrenci2.ogrenciSinifi=9;
        System.out.println(ogrenci2);

    }
}
