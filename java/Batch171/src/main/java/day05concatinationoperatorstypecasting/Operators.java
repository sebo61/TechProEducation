package day05concatinationoperatorstypecasting;

public class Operators {

        /*
        1)+,-,*,/ işlemleri java da matematik gibi kullanır
        note1: int/int=int dir.
        note2: double ile int i toplarsak sonuç double olur.
        çünkü; javada matematiksel işlemlerde farklı data type ları kullanılırsa sonuç  her zaman buyuk data tipinde olur.
        2) java da mantıksal operatorler kullanırız. logical operatorlar.
        AND ve OR işlemleri logical operatorlardır.
        i) AND (&&) true alabilmek için herşey true olmalıdır.
           AND işlemi "perfecttionist"dir.
           AND işleminde bir tane false sonucu false yapar.
        ii) OR (||) true alabilmek için en az biri true olmalıdır.
            OR işlemi "polyanna" gibidir.
       iii) NOT Operator(!) false ı true, true i false yapar.
       !true==>false
       !false==>true
       3) Comparison(karşılaştırma) operatorleri
        <,>,<=,>=,==,!=
        NOTE: Karşilaştırma operatorlerini kullandığınızda kesinlike boolean (true-false) alırsınız.

        NOTE: Bizler coding de and işlemi için && kullanırız ama & kullanımda gecerlidir.
        arkları ise; && kullamımda ilk ifade false ise java diğerlerini kontrol etmez.
        & kullanımda ilk ifade ne olursa olsun diğerlerini kontrol eder. bu fazla işlem demektir.
        bu yüzden hep 2 && kullsnırız.



        */
        public static void main(String[] args) {
            boolean firt=3<5;
            System.out.println(firt);

            boolean second=2+3!=5;
            System.out.println(second);
            boolean third=2+3*5>=19;
            System.out.println(third);
            System.out.println(firt&&second);
            System.out.println(firt||second||third);




    }
}
