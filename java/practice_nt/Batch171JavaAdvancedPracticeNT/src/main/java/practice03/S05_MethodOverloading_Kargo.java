package practice03;

public class S05_MethodOverloading_Kargo {
    public static void main(String[] args) {
         /*
        İki farklı method oluşturun.
          - İlk method, bir paketin ağırlığını parametre olarak alacak ve kargo ücretini hesaplayıp döndürecek.
          - İkinci method ise bir paketin ağırlığı ve boyutları parametrelerini alacak ve
            bu bilgilere göre kargo ücretini hesaplayıp döndürecek.
        Bu methodları kullanarak farklı paketlerin kargo ücretlerini hesaplayın.
    */
        double kgKargoUcreti=kargoHesapla(3.4);
        System.out.println(kgKargoUcreti);
        double boyutluKargo=kargoHesapla(2.4,3,5,3);
        System.out.println(boyutluKargo);
    }

    public static double kargoHesapla(double agirlik) {
        double kargoUcreti = agirlik * 3.5;
        return kargoUcreti;

    }
    public static double kargoHesapla(double agirlik, double yukseklik,double genislik,double derinlik) {
        double kargoUcreti = agirlik*yukseklik*genislik*derinlik*1.5;
        return kargoUcreti;

    }

}
