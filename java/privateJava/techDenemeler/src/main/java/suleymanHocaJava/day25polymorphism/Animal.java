package suleymanHoca.day25polymorphism;

public class Animal {
    /*
    1) child methodda override ettiğimiz metodun acces modifierı daha dar olamaz. aynı olabilir.
    2) Parenttaki metodun acces modifirarı childdaki metodun cacces modifirından daha dar olabilir.
    3) Metodun return type ı primitive ise Overriding yapıldığında return type değiştirilemez.
    5)metodun retyrn type ı void ise overriding yapıldığında return type değiştirilemez.
    6) Child 'da Override edilen metodun return type ı ile parent taki methodun return type ı arasında IS-A ilişkşisş
        varsa return type değiştirilebilir. Aksi takdirde değiştirilemez. Mesela Integer Wrapper CLASS ile long Wrapper Class arasında
        "IS-1" ilişkisi yoktur. o yüzden return type Integer olduğunda Long'a değiştirilemez.
    7) return type wrapper class olduğunda overriding yaparken return type değiştirilemez.
    8) final metodlar override edilemezler.
        final metodların body si değiştirilemez.
    9) static metodlar override edilemezler. çünkü static metodlar tüm childlar için ortak metodlardır.
       bir child ortak metodu değiştirdiğinde diğer childlar bundan etkilenir. bu etkli ummadık
       sonuçlar ortaya çıkarabilir. Bu yüzden Java Static metodların override edilmesine izin vermez.
    10) private metodlar Override edilemezler.


     */
protected void move(){
    System.out.println("Animals move...");
}
public  int add (int a,int b){
    return  a+b;
}
public Animal create(){
    return new Animal();
}
public Integer multibly (Integer a, Integer b){
    return  a*b;
}


}

