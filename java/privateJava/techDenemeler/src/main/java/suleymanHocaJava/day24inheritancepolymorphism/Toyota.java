package suleymanHoca.day24inheritancepolymorphism;

public class Toyota extends Car {

    public void hybrid() {
        System.out.println("Toyota uses hyrib engine...");
    }

    public Toyota() {
   this("prius");
           System.out.println("Toyota constructor 1");
    }

    public Toyota(String s) {
        super(7);
        System.out.println("Toyota constructor 2");
    }
}
