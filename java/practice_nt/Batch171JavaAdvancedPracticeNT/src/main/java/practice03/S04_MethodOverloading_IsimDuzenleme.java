package practice03;

import javax.xml.transform.sax.SAXTransformerFactory;

public class S04_MethodOverloading_IsimDuzenleme {
    public static void main(String[] args) {
 /*
        İki farklı method oluşturun.
          - İlk method, bir ürün adını ve fiyatını parametre olarak alacak ve bu bilgileri ekrana yazdıracak.
          - İkinci method bir ürün adı, fiyatı ve indirim oranı parametrelerini alacak ve indirimli fiyatı ekrana yazdıracak.
        Bu methodları kullanarak farklı ürünleri ve indirim oranlarını ekrana yazdırın.
            String[] urunIsimleri = {"Kalem", "Defter", "Silgi", "Cetvel"};
            double[] urunFiyatlari = {10.99, 12.49, 8.99, 15.99};

    */
        String[] urunIsimleri = {"Kalem", "Defter", "Silgi", "Cetvel"};
        double[] urunFiyatlari = {10.99, 12.49, 8.99, 15.99};

        urun(urunIsimleri[0],urunFiyatlari[0]);
        urun(urunIsimleri[1],urunFiyatlari[1],10);
    }


    public static void urun(String adi, double fiyat ){
        System.out.println(adi+ " fiyatı "+ fiyat);

    }
    public static void urun(String adi, double fiyat, double indirimOrani ){
        double indirimliFiyat= fiyat-(fiyat*indirimOrani/100);
        System.out.println( adi+ " fiyati " + fiyat+", indirimli fiyat "+ indirimliFiyat);

    }
}
