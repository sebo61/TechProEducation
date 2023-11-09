package day08stringmanipulationmemeoryusageifstatements;

import java.sql.SQLOutput;

public class StringManipulation02 {
    public static void main(String[] args) {
        //ornek 1: Bir Stringin belirli bir karakterinden başlayarak belirli bir karaktere kadar dinamik olarak alınız
        //abc@gmail.com ==> gmail
        String a = "abc@hotmail.com";
        int statrtingIndex = a.indexOf('@') + 1;
        int endingIndex = a.indexOf('.');

        String companyNmae = a.substring(statrtingIndex, endingIndex);
        System.out.println("companyNmae = " + companyNmae);

        //örnek 2: Verilen 2 Stringin birbirinin aynısı alup olmadığı kontrol eden kodu yazınız.

        String h = "Ali Can";
        String i = "Ali Can";
        boolean equal = h.equals(i);
        System.out.println("equal = " + equal);
        //javada memory kullanımı
        /*
        Java da 2 adet memory vardır.
        1) Stackk memory ==> small
            a) primitivleri ve Non-primitivlerin adreslerini (reference) tutar
            b) küçük memorydir.
        2) Heap memory ==> Huge
            a) Büyük memory dir.
            b) Non-primitev dataları içerir.

        ==> Java heap memory de yerleştirilen tüm non-primitive datalar için bir adres oluşturur ve bu adresi stack
        memory de saklar.
        /*
        Note Stringlerin eşitliklerini kontrol ederken == yerine equals() methodu kullanırız.
        Neden kullanırız? Çünkü; "==" sembolü 2 stringi karşılaştırırken adres ve değerlere bakar ikisi de aynı ise
        stringler eşittir der.

        Ama biz kod yazarken Striglerin adresleri ile değil değerleri ile ilgileniriz. Bu yüzden string karşılaştırmalarda
        == kullanmayız. equals() methodu ise 2 stringi karşılaştırırken değerleri ile ilgilenir. değerleri aynı ise
        bu 2 string eşittir der, değerler farklı ise 2 string farklıdır der ki bu bizim kod yazarken ihtiyaç duyduğumuz
        şeydir
         */
          String s="Tom";
          String t="Terry";
          String r= new String("Tom");
        System.out.println((s==t)); //adresler ve değerler farklı
        System.out.println(s.equals(t));//değerler farklı
        System.out.println(s==r);
        System.out.println(s.equals(r));//s ve r nin değerleri aynı olğuğu için equals true verir.
         //---------------------------------------------------------
        // ornek 3: verilen  2 stringin birbirini aynısı olup olmadığı büyük harf küçük harf dikkate almadan kontrol
        // eden kodu yazınız.
         String j="ali Can";
         String k="Ali Can";
         boolean result3= j.equalsIgnoreCase(k);//büyük-küçük harf dikkate almaz.
        System.out.println("result3 = " + result3);
        // HOMEWORK:
        /*
            1) Bir string variable oluşturunuz ve u string deki rakam olamayan tüm karakterlerin sayısını konsola yazdırınız.
            2) bir string variable oluşturunuz ve ilk karakter ve son karakter dışındaki tüm karakteri konsola büyük harflerle yazdırınız.
            3) bir strşing variable oluşturunuz. ilk ve son karakterlerin acsii değerleri toplamını konsola yazdırınız.
            4) tek kelimeli şehir ismi için string variable oluşturun. şehir ism,n ilk harfini büyükharfle diğer
            harflerini küçük harflerle konsola yazdırınız.
            5) aşağıdaki kurallara göre kullanıcının girdiği password u ontrol ediniz.
                a) en az 6 karakter olsun
                b) en az 1 tane büyük harf olsun.
                c) en az 1 tane küçük harf olsun
                d) en az 1 tane rakam olsun
                note 1: önce canli oturum sırasında çözülen örnekleri yapınız.
                not2:tüm soruları dinamik kodlarla çözünüz.
                note3: birbirinizin çözümlerini inceleyip tavsiyede bulunup yada yardım isteyiniz.
                         */



    }
}
