package day28interfacecollections;

public interface Ac {

    public abstract void cool();
    void run();
    int price =2000;

    /*
    1) Bir interface'i bir classin parenti yapmak icin "implements" keywordunu kullaniriz
    2) java parentlar class oldugunda multiple parent a musaade etmez ama biz bazen
    multiple parent a ihtiyac duyariz
    Bu ihtiyaci gidermek icin java interface adinda yeni bir yapi olusturdu
    Bu yapi sayesinde bir class icin coklu interface parent olusturulabilir
    3) interfacelerin icine conceret method konulamaz, cunku concrete methodlarda body vardir ve
    body o methodun işi nasil yapacagini belirtir. isin nasil yapilacagi bir cok detay icerir ve bu chlid
    classlarda kafa karisikligina sebep olur. Halbuki sadece yapilmasi gereken isi soyleyip
     nasil yapilacagini childa birakirsaniz chil classin kafa karisikligini engellemis olursunuz
    4) interfacelerdeki tum methodlar otomatik olarak public dir, abstracttir, static degildir
    5)interfaceler concrete method iceremezler dolayisyal interface icindeki hicbirsey istege bagli degildir
    hersey child classlar icin mecburidir. Bu yuzden interfacelere" to-do list " de denir
    6)Coklu interface parentlarin herbirinin icine ayni isimli methodlar koyabiliriz
    Mesela Ac nin, Engine'in ve Security nin iclerine "run()" metodu koymak gibi
    Child class herhangi birini override ettiginde hepsini override etmis gibi olur sonrada
    body yi Child class da yazarak uygulamasini yapmis olur
    7) a) interfacelerdeki tum variablelar otomatik olarak(default) olarak finaldir.Bu yuzden interfce icindeki
         variabli olusturdugunuzda mutlaka deger atamasi yapmalisiniz. Bilindigi gibi final variable larin degerleri degistirilemez
       b) interface lerdeki tum variablelar otomatik olarak(default) olarak publicdir.
       c) interface lerdeki tum variablelar otomatik olarak(default) olarak staticdir.
       => dolayisiyla interfacelerde variable cagirirken interface adini kullanarak cagiririz, bu hem static varibale olamanin geregidir
       hemde okunurlugu artirir
    8)  Normalde "interface" icine "concrete method" konulamaz ama bazi ozel durumlarda "concrete method"
    koymamaiz gerekirse default keyword kullanarak bunu yapabiliriz
        static keyworudun kullanarak ta interface icine concrete method koyabiliriz
    9) "default" keyword unu kullanarak olusturdugunuz "concerete methodlara interface in chil classindan
    object olusturarak ulasabilirsiniz.
        "static keywordunu" kullanarak olusturdugunuz concrete methodlara ulasmak icin object olusturmaya gerek yoktur,
        interface ismi yeterlidir
    10)interfacelerden object oluşturulamaz. interfacein constrocterı yoktur.
    11)
        Child           Parent          keyword
        class           class           extends
        interface       interface       extends
        class           interface       implement
        interface       class           OLAMAZ

        Aynı ise "extends"
        farklı ise "Implement" kullanırız. ve interface concrete clasın childi olamaz

        Abstract class ile interface arasında farklar nelerdir.
        1) abstract classlar hem abstract hemde concrete metodlar içerebilir fakat interface ler sadece abstract metod içerir.
            ama interfacelerde istersek "default" ve static keywordlerini kullanarak concrete metod üretebiliriz.

        2) Abstract classlar multibıl interitence ı desteklemez. ama interfaceler destekler.
        3) Abstract classlar içinde her türlü veriable oluşturulabilir. interface lerde içindeki variablelar.
            public static ve final olmak zorundadır.
        4) Interface, classın child ı olamaz. ama abstract classın childı olabilir.
        5) abstract classlarda constructor vardır ama obje üretemez interfacelerde constructor yoktur bu yüzden
        obje üretilemez.
     */

}
