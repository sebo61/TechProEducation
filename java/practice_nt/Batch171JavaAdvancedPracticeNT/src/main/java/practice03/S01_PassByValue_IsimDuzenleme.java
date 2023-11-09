package practice03;

public class S01_PassByValue_IsimDuzenleme {

    public static void main(String[] args) {
         /*
        String içinde verilmiş bir ismin orjinal değerini değiştirmeden aşağıdaki işlemleri yapan metotlar yazın.
            String isim = "Ali Veli Can";
            - Tüm harleri büyük yapın.
            - Tüm harfleri küçük yapın.
            - İsmin başına ünvan ekleyin.
            - Sadece ilk isim ve soyismi yazın ve orta ismi kısaltarak yazın (Örnek: Ali V. Can)
            - İsmin sadece ilk harflerini büyük, soyismin tamamını büyük harfle yazın.
    */
        String isim = "Ali Veli Can";
        System.out.println(isim);

        tumuBuyuk(isim);
        System.out.println(isim);
        tumuKucuk(isim);
        System.out.println(isim);
        unvanEkle("Dr.", isim);
        System.out.println(isim);
        ilkIsimli(isim.split(" ")[0], isim.split(" ")[1].charAt(0), isim.split(" ")[2]);
        ilkHarfBuyuk(isim.split(" ")[0].substring(0,1).toUpperCase(),isim.split(" ")[0].substring(1),isim.split(" ")[1].substring(0,1).toUpperCase(),
                isim.split(" ")[1].substring(1),isim.split(" ")[2].toUpperCase());


    }

    public static void tumuBuyuk(String deger) {
        deger = deger.toUpperCase();
        System.out.println(deger);

    }

    public static void tumuKucuk(String deger) {
        deger = deger.toLowerCase();
        System.out.println(deger);
    }

    public static void unvanEkle(String unvan, String deger) {
        System.out.println(unvan + " " + deger);
    }

    public static void ilkIsimli(String ilkIsim, char ikinciIsim, String soyad) {
        System.out.println(ilkIsim + " " + ikinciIsim + ". " + soyad);
// 4. yap
    }
    public static void ilkHarfBuyuk(String ilkHarf,String ilkIsimKalan, String ikinciIsimIlkHarf,String ikinciIsimKalan, String soyad){
        System.out.println(ilkHarf+ilkIsimKalan+" " +ikinciIsimIlkHarf+ikinciIsimIlkHarf+" "+soyad);
    }

}
