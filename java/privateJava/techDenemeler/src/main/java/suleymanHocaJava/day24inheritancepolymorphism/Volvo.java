package suleymanHoca.day24inheritancepolymorphism;

public class Volvo extends Car {
    public void secure() {
        System.out.println("Volvo is the most secure car in the world...");
    }

    @Override // bu bir annotation dır. override kuyrallarını kontrol eder.
    public void move() {
        System.out.println("Volvo moves...");
    }

}
