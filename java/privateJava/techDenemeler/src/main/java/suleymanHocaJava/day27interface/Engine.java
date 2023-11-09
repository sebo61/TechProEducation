package suleymanHocaJava.day27interface;

public interface Engine {
    /*
                interface deki methodlar.
    1) "interface" içine "concrete method" konulamaz.
    2) "interface" içindeki mwthodların abstract olduğunu Java bilir. Bu yüzden "interface" içindeki "abstract method" larda
        abstract keyword kullanmaya gerek yoktur.
    3) interface içindeki abstract methodların tamamı publictir.
        Bu yüzden interface içinde abstract method oluştururken "acces modifier" yazmaya gerek yoktur.
    4) Bir interface i bir concrete class'ın parentı yapmak istediğimizde extends keyword yerine "implements"
        keyword kullanılır.
    5) "concrete Child Class" lar "parent interface" de ki "abstract method" ları override etmek zorundadırlar.
    6) interface ler bir applicationda "concrete Child Class" ların yapmak zorunda oldukları fonksiyonları barındırırlar
    bu yüzden "interface" lere "to-do-list" de denir.
    7) "interface" içinde aynı isimli abstract metodlar oluşturabilirsiniz. Abstract metodların body si olmadığı içinb child class lar aynı isimli
        mwetodlardan herhangi birini override ederek kullanabilirler.

    8) aynı isimli bastract metodlar oluşturduğunuzda return typeları aynı olmalıdır.
    9) "interface" içinde body si olan method istenirse başına "default" yazılır. Bu default access modifgier değildir.
        static keywordü ile de concrete metod oluşturulabilir.
    10) default veya static keywordünü kullanarak oluşturduğunuz concrete methodların concrete child classlar tarafından kullanılma zorunluluğu yoktur.
    11) defaul keywordünü kullanarak oluşturduğumuz "concrete methodlara" ulaşmak için object oluşturarak ulaşabiliriz.
        static keyword kullanarak oluşturduğumuz "concrete method" lara ulaşmak için object oluşturmaya gerek yoktur. intergface ismi yeterlidir.
    12) interface lerden object oluşturulamaz. interface de body siz methodlar vardır. interface lerin contructorı yoktur.


    */

    public void start();
    void payment();

    default void eco(){
        System.out.println("Users gas less...");
    }
    static void stop(){
        System.out.println("Stops securely...");
    }

}
