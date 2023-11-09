package suleymanHoca.day24inheritancepolymorphism;
/*
1) inhertance da object oluştururken constructorlar yukarıdan (Parent) aşağıya (child) doğru çalışır.
2) Parent ve Super eş anlamlıdır. child ve sub eş anlamlıdır.
3) Super () her constructorın ilk satırında görünmez şekilde bulunur. isterseniz görünür yapabilirsiniz.
4) super() sizi parent class daki constrocter a taşır.
5) this() sizi aynı class içindeki constructorlar arasında gezdirir.
6) this içinde bulunulan calsstaki variableları çağırmaya yarar
   super parent classtaki variableları çağırmaya yarar.
7) HAS-A ve IS-A ilişki
*/

/*
1) polymorphism ==> çoklu şekil
    Yani bir metodun farklı şekillerde karşımıza çıkması demektir.
    polymorphism = overloading(+) + overriding
2) Overriding parent class'daki metodu child classın ihtiyaçlarına göre özelleştirerek kullanmaktır.
3) Overriding'de methodun body'si değiştirilir.
4) Overriding de method signuture dokunulmaz. Dokunursanız Java kızar.
 */


public class Car {
    public String model = "Car";
    public int price = 0;

    public void move() {
        System.out.println("Cars move...");
    }

    public void getBreak() {
        System.out.println("Cars break...");
    }

    public void engine() {
        System.out.println("Cars have engine...");
    }

    public Car() {
        System.out.println("Car constructor 1");
    }

    public Car(int i) {
        this();
        System.out.println("Car constructor 2");
    }

}
