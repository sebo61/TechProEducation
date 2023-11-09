import java.net.SocketTimeoutException;
import java.util.Scanner;

public class Mentor01 { 
    public static void main(String[] args) {
  /*
  1. Basit bir Kahve makinesi oluşturun.    3 çeşit kahvemiz olsun.
  2. Sistem şu soruyu sorsun: "Hangi Kahveyi istersiniz?"
  3.Bu soru ile birlikte kullanıcı kahve bilgilerini görsün.
   Örn:
  Hangi Kahveyi İstersiniz?
  1.Türk kahvesi
  2.Filtre Kahve
  3.Espresso
        String hangiKahve oluşturun ve var olan kahvelerden birini yazınız.
         (örn: Türk Kahvesi,  ya da türk kahvesi.  --->  Büyük- küçük harf duyarlı olmaması için String methodu kullanın.)
                                                                                     todo 1. Koşul bölümü
Eğer kahve Türk kahvesi ise, konsola = Türk kahvesi hazırlanıyor. yazsın.(Dümdüz Türk kahvesi yazmayın.
         String hangiKahve'yi çağırın!!)
        Eğer filtre kahve ise,   konsola = Filtre kahve hazırlanıyor.  yazsın.     (String hangiKahve'yi kullanın !)
        Eğer Espresso ise, konsola =  Espresso hazırlanıyor...   yazsın.  (String hangiKahve'yi kullanın !)
        Eğer yanlış harf girerseniz, konsola = Hatalı tuşlama yaptınız. yazsın. (Hatalı tuslamadan sonra kod
        calısmaya devam edecektir, o konuyu daha görmediniz bu yüzden bastan baslatın.)
Sistem bize şu soruyu sorsun: "Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız):
         "   Konsolda aynen böyle  yazmalı. Parantez içi de konsolda olsun.
       String sut olusturun.
                                                                           todo 2.Koşul Bölümü
       eğer String sut,  evet   e eşitse,konsola, Süt ekleniyor... yazısı gelsin.
        --(Büyük küçük harf duyarlı olmaması için String methodu kullanın. Olması gereken ihtimaller:
         Evet, EVET, EvEt,EVEt vs.
      eğer String sut, hayır a eşit ise, konsola , Süt eklenmiyor  yazısı gelsin.
                                                                                    todo ----------------------------------
        Sistem bize "Şeker ister misiniz ? (Evet veya hayır cevabını veriniz) : " şeklinde bir soru sorsun.
        (Büyük küçük harf duyarlılıgı olmaması için string method kullanın.
        String seker oluşturunuz.
                                                                todo 3.Koşul Bölümü
        todo if(){
        Eğer String seker   Evet e eşitse ,  sistem bize "Kaç şeker olsun?" sorusunu sormalı.
        Sorunun altına int kacSeker  oluşturunuz.
        Şeker sayısını giriniz.
        Ve konsola   şunu yazdırınız örnek: 5 şeker ekleniyor.  (ipucu: Bu kodların heosi if bloğunun içerisinde olacak)
        todo }
        todo else{

         Eğer String şeker  hayır 'a eşitse, sistem bize "Şeker eklenmiyor" cevabını versin.
            ONEMLİ !! =   bir int girdisinden sonra String girdisi yapacaksak,araya boş bir nextLine
            koymamız gerekiyor. (String bosKod = sc.nextLine();    )  dummy kod ekleyiniz.
  Sistem bize "Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.) :   sorusunu sorsun.
  (büyük küçük harf duyarlılıgı olmamalı. yani kullanıcı büyük boy veya BüYüK Boy girdiginde kabul etmeli.
  String boyut oluşturun...
                                                   todo 4.Koşul Bölümü
        eğer String boyut Büyük boy' a eşitse =  Kahveniz büyük boy hazırlanıyor.
        (Büyük boy kısmını String boyut'u kullanarak yazalım= "Kahveniz" + boyut + "hazırlanıyor.")
        Eğer String boyut  Orta Boy'a eşitse = Kahveniz orta boy hazırlanıyor.. ("Kahveniz" + boyut + "hazırlanıyor.)
        Eğer String boyut  Küçük boy'a eşitse = Kahveniz küçük boy hazırlanıyor.    yazsın.
        ("Kahveniz" + boyut + "hazırlanıyor.)

        todo ----------------------------------


                    //todo  SONUÇ BÖLÜMÜ
                    Siparişlerimizi verdik. Son hali görmek istiyoruz.
                    konsola şunu yazdırın örnek :
        Türk Kahvesi orta boy hazırdır. Afiyet olsun !!! (Türk kahvesi için String hangiKahveyi kullanın.
         orta boy için de String boyut ' u kullanın.)
        todo Açıklama :
       Projeyi bilerek biraz zor hazırladık. Üzerinde fazla fazla kafa yormanız ve "grupça çalışmanız için"
       böyle düzenledik. Yapamayan arkadaşlar kesinlikle canlarını sıkmasın.
       Size çok zor gelebilir. Ancak adım adım ilerlerseniz, grup ile çözerseniz ve yazdığım notları tamamen
        uygularsanız halledebilirsiniz. Öğrenmediğiniz hiçbir şey yok. Sadece biraz karışık.
       HERKESE KOLAY GELSİN !! :)
                 */

        do {


            String menu1 = "Turk Kahvesi";
            String menu2 = "Filtre Kahve";
            String menu3 = "Espresso";
            String tercih1 = "Evet";
            String tercih2 = "Hayir";
            String boy1 = "Buyuk";
            String boy2 = "Orta";
            String boy3 = "Kucuk";
            String boyut="";

            Scanner input = new Scanner(System.in);

            System.out.println("Hangi kahveyi istersiniz\n1.Turk kahvesi\n2.Filtre Kahve\n3.Espresso");

            String hangiKahve = input.nextLine();

            if (hangiKahve.equalsIgnoreCase(menu1)) {

                System.out.println(menu1 + " hazirlaniyor");

                System.out.println("Süt eklememizi ister misiniz ? (Evet veya Hayır)");

                String sutTercih = input.next();

                if (sutTercih.equalsIgnoreCase(tercih1)) {

                    System.out.println("Sutunuz ekleniyor...");

                } else if (sutTercih.equalsIgnoreCase(tercih2)) {

                    System.out.println("Sut eklenmiyor...");

                } else {
                    System.out.println("Girdiginiz parametre uyusmuyor.");
                }
                System.out.println("Şeker eklememizi ister misiniz (Evet yada Hayır)");

                String sekerTercih = input.next();

                if (sekerTercih.equalsIgnoreCase(tercih1)) {

                    System.out.println("Kac seker istersiniz?");

                    int sekerAdet = input.nextInt();

                    System.out.println(sekerAdet + " adet seker ekleniyor.");

                } else if (sekerTercih.equalsIgnoreCase(tercih2)) {

                    System.out.println("Seker eklenmiyor.");

                } else {

                    System.out.println("Gecersiz giris.");

                }

                System.out.println("Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.)");

                boyut = input.next();

                if (boyut.equalsIgnoreCase(boy1)) {

                    System.out.println(menu1 + " " + boy1 + " boy hazirlaniyor.");

                } else if (boyut.equalsIgnoreCase(boy2)) {

                    System.out.println(menu1 + " " + boy2 + " boy hazirlaniyor.");

                } else if (boyut.equalsIgnoreCase(boy3)) {

                    System.out.println(menu1 + " " + boy3 + " boy hazirlaniyor.");

                } else {

                    System.out.println("Gecersiz giris.");

                }

            } else if (hangiKahve.equalsIgnoreCase(menu2)) {

                System.out.println(menu2 + " hazirlaniyor");

                System.out.println("Süt eklememizi ister misiniz ? (Evet veya Hayır)");

                String sutTercih = input.next();

                if (sutTercih.equalsIgnoreCase(tercih1)) {

                    System.out.println("Sutunuz ekleniyor...");

                } else if (sutTercih.equalsIgnoreCase(tercih2)) {

                    System.out.println("Sut eklenmiyor...");

                } else {
                    System.out.println("Girdiginiz parametre uyusmuyor.");
                }
                System.out.println("Şeker eklememizi ister misiniz (Evet yada Hayır)");

                String sekerTercih = input.next();

                if (sekerTercih.equalsIgnoreCase(tercih1)) {

                    System.out.println("Kac seker istersiniz?");

                    int sekerAdet = input.nextInt();

                    System.out.println(sekerAdet + " adet seker ekleniyor.");

                } else if (sekerTercih.equalsIgnoreCase(tercih2)) {

                    System.out.println("Seker eklenmiyor.");

                } else {

                    System.out.println("Gecersiz giris.");

                }

                System.out.println("Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.)");

                boyut = input.next();

                if (boyut.equalsIgnoreCase(boy1)) {

                    System.out.println(menu2 + " " + boy1 + " boy hazirlaniyor.");

                } else if (boyut.equalsIgnoreCase(boy2)) {

                    System.out.println(menu2 + " " + boy2 + " boy hazirlaniyor.");

                } else if (boyut.equalsIgnoreCase(boy3)) {

                    System.out.println(menu2 + " " + boy3 + " boy hazirlaniyor.");

                } else {

                    System.out.println("Gecersiz giris.");

                }

            } else if (hangiKahve.equalsIgnoreCase(menu3)) {

                System.out.println(menu3 + " hazirlaniyor");

                System.out.println("Süt eklememizi ister misiniz ? (Evet veya Hayır)");

                String sutTercih = input.next();

                if (sutTercih.equalsIgnoreCase(tercih1)) {

                    System.out.println("Sutunuz ekleniyor...");

                } else if (sutTercih.equalsIgnoreCase(tercih2)) {

                    System.out.println("Sut eklenmiyor...");

                } else {
                    System.out.println("Girdiginiz parametre uyusmuyor.");
                }

                System.out.println("Şeker eklememizi ister misiniz (Evet yada Hayır)");

                String sekerTercih = input.next();

                if (sekerTercih.equalsIgnoreCase(tercih1)) {

                    System.out.println("Kac seker istersiniz?");

                    int sekerAdet = input.nextInt();

                    System.out.println(sekerAdet + " adet seker ekleniyor.");

                } else if (sekerTercih.equalsIgnoreCase(tercih2)) {

                    System.out.println("Seker eklenmiyor.");

                } else {

                    System.out.println("Gecersiz giris.");

                }

                System.out.println("Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.)");

                boyut = input.next();

                if (boyut.equalsIgnoreCase(boy1)) {

                    System.out.println(menu3 + " " + boy1 + " boy hazirlaniyor.");

                } else if (boyut.equalsIgnoreCase(boy2)) {

                    System.out.println(menu3 + " " + boy2 + " boy hazirlaniyor.");

                } else if (boyut.equalsIgnoreCase(boy3)) {

                    System.out.println(menu3 + " " + boy3 + " boy hazirlaniyor.");

                } else {

                    System.out.println("Gecersiz giris.");

                }

            } else {
                System.out.println("Hatalı tuslama yaptınız");
            }


            System.out.println(hangiKahve+" "+boyut+" hazır Afiyet olsun");



        } while (true);
    

    }
}
