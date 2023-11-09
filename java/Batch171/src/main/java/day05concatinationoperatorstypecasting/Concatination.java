package day05concatinationoperatorstypecasting;

import java.sql.SQLOutput;

public class Concatination {
    public static void main(String[] args) {
        //Ornek 1: Bir string ve iki integer variable olusturun. String degeri ile Integer larin toplamini console a yazdirin
        String s = "elma";
        int a = 10;
        int b = 11;

        System.out.println(s + a + b); //elma10111 - işlem önceliği
        //
        System.out.println(s + (a + b));//elma21
        System.out.println(s + a * b); //elma110 işlem önceliği
        System.out.println(a + b + s);//21elma-işlem önceliği
        System.out.println(a + s + b);//10elma11 - işlem sırası

        // Javada + sembolü iki sayı arasında kullanılırsa toplama işlemi olur.
        //javada "+" sembolü iki string arasında veya bir string ve sayı arasında kullanıırsa bu işlem "concatination" işlemi olur.
        //"concatination" birleştirme yapar.
        //note: Concatination işlemlerinde java matematikteki gi işlem önceliği kurallarını kullanır.

        /*işlem önceliği
        1)üslü
        2)parantez
        3)çarpma-bölme
        4)toplama ve cıkarma
        5)aynı öncelikli olanlarda soldan sağa baslanir.
         */
        //örnek 2: size String olarak verilen 2 fiyatın toplamini ekrana yazdırınız.
        System.out.println("--------------------------------------");
        String shirt="2300";
        String shoes="5200";

        System.out.println(shirt+shoes);

        //Integer.valueof() değerleri Stringleri integer a cevirir.
        int toplamFiyat=Integer.valueOf(shirt)+Integer.valueOf(shoes);
        System.out.println(toplamFiyat);
        //ornek 3: size String olarak verilen 2 fiyatın toplamini ekrana yazdırınız.

        String tv="$1100";
        String radio="$300";
        int totalPrice=Integer.valueOf(tv)+Integer.valueOf(radio);
        System.out.println(totalPrice);
        //not:valueof() methodu tüm karakterleri rakam olan stringleri sayilara cevirir.
        //eğer valueoff methodu kullanılırken strigin içine rakam olamayan karakter koyarsanız hata alırsınız.
        //valueoff methodu kullanılırken sadece rakam olan stringler kullanılmalıdır.




    }

}
