package practice03.s07_constructor_ogrenci;

public class Ogrenci {
  /*
        Ogrenci class'ı, öğrencinin adını, yaşını ve sınıfını temsil eden alanları içermelidir.
        Bu class'ın ir default constructor'ı, bir de parametreli constructor'ı olmalıdır.
        Bu class'ın değiken değerlerini ekrana yazdıran bir metot bulunmalıdır.
    */
    public String ogrenciAdi;
    public int ogrenciYasi;
     public int ogrenciSinifi;

    public Ogrenci(String ogrenciAdi, int ogrenciYasi, int ogrenciSinifi) {
        this.ogrenciAdi = ogrenciAdi;
        this.ogrenciYasi = ogrenciYasi;
        this.ogrenciSinifi = ogrenciSinifi;
    }

    public Ogrenci() {
        ogrenciAdi="";
        ogrenciYasi=0;
        ogrenciSinifi=0;
    }

    @Override
    public String toString() {
        return
                "Adi='" + ogrenciAdi +
                ", Yasi=" + ogrenciYasi +
                ", Sinifi=" + ogrenciSinifi ;


    }
    // POJO class
}
