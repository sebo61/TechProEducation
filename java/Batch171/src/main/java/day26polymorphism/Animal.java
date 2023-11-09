package day26polymorphism;

public class Animal {
    /*
    1) Parent class daki methodu child class içinde özelleştirerek kullanmaya overriding yapmak denir.
    2) Overriding de method signature a dokunulmaz.
    3) private methodlar override edilemezler.
    4) Child classdaki methodun access modifieri parent classdaki override edilmis(Overriden Method)un access modifierindan
    dar olamaz. Aynisi olabilr yada daha genis olabilir.
    5) Child class da Override edilem metodun return type ı ile parent daki metodun return type ı arasında "IS A Relation Ship"
    varsa return type değiştirilebilir.
    6) metodun return type ı primitive ise overriding yaparken return type değiştirilemez. çümkü return type ya aynı olur
    yada parenttan secilir ama primitivler arasında parent child ilişkisi
    olmadığından aynısı olmak zorundadır.
    7)Child da override edilen metodun return type ı ile parenttaki methodun return type ı arasında
    "IS A Relation" yoksa return type değiştirilemez.
    Mesele:
    Integer warapper clası ile Long clası arasıında IS A Rletaionship yoktur. O YÜZDEN DEĞİŞTİRİLEMEZ.
    8) Methodun return type ı void ise overriding yaparken return type değiştirilemez.
    9)static metodlar override edilemezler.çünkü static metodlar tüm childlar için ortak metodlardır.
    bir child ortak bir metodu değştirdiğinde diğer childlar bundan olumsuz etkilenebilir. bu yüzden java static
    metodların override edilmesine müsade etmez.
    10) final metodlar override edilemezler.final metodların bodysi değiştirilemez ama override ederken method odı değiştirilir.
    bu yüzden java final metodların override edilmesine izin vermez.
        a) final keywordünü variable lar ile kullanabiliriz.
            i)eğr variable final ise mutlaka değer atanmalıdır.
            ii)ilk atanan değer değiştirilemez.
        b)fimal keywordünü metodlar ile kullanabiliriz.
            i) metod fianl ise body si değiştirilemez.
            ii) değiştirilemeyince override yapmak mümkün olmaz.
        c) fimal keywordünü classlar  ile kullanabiliriz.
            i) class final ise child ı olamaz.
      Poliymorphism çok şekillik demek. Method overloding + method overriding


     */
    public void eat() {
        //Parrent daki override edilmiş eat() metoduna "Overriden method" denir.
        System.out.println("animals eat...");
    }

    public void drink() {

        System.out.println("animal drink...");
    }

    public Animal create() {

        return new Animal();
    }

    public int add(int a, int b) {
        return a + b;
    }

    public Integer multiply(Integer a, Integer b) {
        return a * b;
    }

    final double pi = 3.14;

}


