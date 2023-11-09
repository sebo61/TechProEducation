package suleymanHoca.day24inheritancepolymorphism;

public class Honda extends Car {

    public void eco(){
        System.out.println("Honda engine are so economic...");
    }
    public String model="Civic";
    public int price=20000;
    public Honda(){
        System.out.println(this.model);
        System.out.println(super.model);
    }
}
