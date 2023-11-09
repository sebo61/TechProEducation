package day28interfacecollections;

public interface Engine {
    void run();
    int price=2000;
    default void eco(){
        System.out.println("uses gas less");

    }
    static  void stop(){

        System.out.println("stops securely");
    }
}
