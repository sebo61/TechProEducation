package day25inheritance;

public class Animal {
    // Inheritance ==> miras alma
    /*
    özellikleri bir classtan diğer claslara alan bir kavramdır. Bunun Java daki karşılığı şudur:
    Siz bir class oluşturacaksıunız ama daha önce oluşturulmuş bir class sizin istediğiniz özelliklerin bir çoğunu kapsıyor.
    o zaman direkt yeni oluşturduğunuz class ı özelliklerini kullanmak istediğiniz calass a child yaparız.
    InheritANCE FAYDALARI:
    1)Kod tekrarlarından kurtuluruz
    2) kod tamiri (maintenance) kolay olur
    3) child classları daha atomik yapmış oluruz.

    => bir class ı başka bir class ın child classı yapmak için "extends" keyword kullanılır.
    ilk yazılan class child ikinci yazılan class parent (veya super) olur.

    => child class objeleri parent class tan method ve variablelleri kullanabilirler.
    => parent class ogjelri child classtan method ve variablelleri kullanamazlar.
    => java da bir class ın sadece bir tane parent ı olabilir. coklu parent a "Multiple Inheritance"
    derler.
    tekli parent'a "single Inheritance" derler. Java Multiple Inheretance ı detseklemez.
    Java "Single Inheritance" kullanır.

    => apartman şeklindeki inheritance yapısına "multilevel inheritance" denir.
    Java MultiLevel inheritance ı destekler.

    => Object class her class ın parentıdır. Java da Object class hariç her class in parenti vardır.
    Java da parentı olmayan tek class Object Class dır.

    => Javada parenttan childa olan ilişkilere "HAS-A Relationsship" denir.
        Javada childdan parent a olna ilişkilere "IS-A Reletaionsship"  denir.

    => Jvada her class ın bir tane default consructerı vardır. Bu default consructer classın içinde görülmez. çünkü
    consructer "Object Class" içindedir.

    */
    public void eat(){
        System.out.println("animal eat...");
    }
    public void drink(){
        System.out.println("animal drink...");
    }



}
