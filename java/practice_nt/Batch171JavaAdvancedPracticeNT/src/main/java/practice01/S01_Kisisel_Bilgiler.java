package practice01;

public class S01_Kisisel_Bilgiler {
    public static void main(String[] args) {
       /*
        İsim, soyisim, yaş, boy ve kilo değişkenlerini konsola aşağıdaki gibi yazdıran bir kod yazınız:
        İsim: ...
        Soyisim: ...
        Yaş: ...
        Boy: ...
        Kilo: ...
        Not: Sadece bir adet "System.out.println(); kullanınız.
                */

        String name="Sebahattin";
        String surname="Köse";
        int age=23;
        double boy=167;
        double kilo=88.5;

        System.out.println("İsim:...."+name+"\n"+"Soyisim....:"+surname+"\n\t"+"Yaş...:"+age+"\n\t"+"Boy..."+boy+"\n\t"+
                "kilo....:"+kilo);

    }
}
