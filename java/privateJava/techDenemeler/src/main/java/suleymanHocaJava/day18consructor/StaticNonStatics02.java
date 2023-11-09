package suleymanHocaJava.day18consructor;

public class StaticNonStatics02 {
    public StaticNonStatics02() {
        System.out.println("Constructor 1");
    }

    public StaticNonStatics02(int price) {

        System.out.println("Constructor 2");

    }

    public StaticNonStatics02(String name) {

        System.out.println("Constructor 3");

    }

    public StaticNonStatics02(boolean isOld) {
        System.out.println("Constructor 4");

    }

    // non-stataic blocks constructorlarda çalıştırılması gereken ortak kodları içerir.
    // non-static blocks içine yazılan kodlar her constructor için çalıştırılır.
    //birden fazla non-static block varsa önce üsttek içalıştırılır.
    {
        System.out.println("i am a constructor");
    }

    public static void main(String[] args) {
        StaticNonStatics02 obj1 = new StaticNonStatics02();
        StaticNonStatics02 obj2 = new StaticNonStatics02(12);
        StaticNonStatics02 obj3 = new StaticNonStatics02("shirt");
        StaticNonStatics02 obj4 = new StaticNonStatics02(false);

    }
}
