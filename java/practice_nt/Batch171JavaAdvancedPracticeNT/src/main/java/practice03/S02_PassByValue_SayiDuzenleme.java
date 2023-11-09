package practice03;

public class S02_PassByValue_SayiDuzenleme {
    public static void main(String[] args) {
         /*
        İçinde verilmiş bir sayının orijinal değerini değiştirmeden aşağıdaki işlemleri yapan metotlar yazın.
            int sayi = 42;
            - Sayıyı karesini alın.
            - Sayıyı küpünü alın.
            - Sayının karekökünü alın.
            - Sayının mutlak değerini alın.
            - Sayıyı 10 ile çarpın ve sonucu yazdırın.
    */
        int sayi = 42;
        System.out.println(sayi);
        int sayi2=kareHesapla(sayi);
        System.out.println(sayi2);
        System.out.println(sayi);
        kupunuAl(sayi);
        System.out.println(sayi);
    }

    public  static int  kareHesapla(int deger){
        int kare=(int) Math.pow(deger,2);

        return kare;


    }
    public static void kupunuAl(int deger){
        int kup=(int)Math.pow(deger,3);
        System.out.println(kup);
    }
    //kalanları yap...

}
