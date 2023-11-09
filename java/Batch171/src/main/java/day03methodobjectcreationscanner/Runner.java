package day03methodobjectcreationscanner;

public class Runner {
    public static void main(String[] args) {
        //Obje nasıl oluşturulur?
        //new keywordu sıfırdan yeni  bir object oluşturmak için kullanılır.
        //Constructer java da objeleri oluşturmak için kullanılan özel bir methoddur.
        //class ismi +  obje ismi +  Assignment Operator + "new" + Constructor
        Car                 myCar           =               new         Car();

        System.out.println("myCar.fiyat = " + myCar.fiyat);
        System.out.println("myCar.model = " + myCar.model);
        myCar.hareket();
        myCar.dur();

        Student aliCan = new Student();
        System.out.println("aliCan.adres = " + aliCan.adres);
        System.out.println("aliCan.grade = " + aliCan.grade);
        System.out.println("aliCan.name = " + aliCan.name);
        aliCan.feed();
        aliCan.study();
        //homework: içinde isim ve yaş olan (en az) ile teach methodu da olan bir teacher objesi oluşturun ve obje üzerinde bu özellikleri kullanın



    }

}
