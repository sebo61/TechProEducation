package practice04;

public class S04_Varargs_Restoran {
    public static void main(String[] args) {
         /*
        Java programında, bir restoranın menüsündeki yemeklerin fiyatlarını hesaplayan bir metot yazmanız isteniyor.
        Metot, menüdeki yemeklerin isimlerini ve ardından fiyatlarını almalıdır.
        Menüdeki yemeklerin fiyatları toplamını döndüren ve menüye hiç yemek eklenmediğinde 0 döndüren bir metot yazın.
    */
    double toplam=toplamFiyat("çorba","23.10","salata","12.4","pide","45.67");
        System.out.println("TOPLAM " +toplam);
    }

    public static double toplamFiyat(String... yemekler) {
        double toplamFiyat = 0;

        for (int i = 0; i < yemekler.length; i+=2) {
            String yemek = yemekler[i];
            double yemektFiyati = Double.parseDouble(yemekler[i + 1]);
            toplamFiyat += yemektFiyati;
            System.out.println(yemek+" = "+yemektFiyati+" TL");


        }
        return toplamFiyat;

    }
}
