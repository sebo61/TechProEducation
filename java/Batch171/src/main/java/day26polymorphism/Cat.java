package day26polymorphism;

public class Cat extends Animal {
    public void meow(){
    System.out.println("cat meow...");
}
    // Override annotation override kurallarının java tarafından kontrol edilmesini sağlar.

@Override
public void eat(){
    // Child daki override edilmiş eat() metoduna overriding metod denir.
        System.out.println("cat eat...");
    }

    @Override
    public void drink() {
        System.out.println("cat drink...");
    }
    @Override
    public Cat create(){

        return new Cat();
    }

    @Override
    public int add(int a, int b) {

        return a+b;
    }

    @Override
    public Integer multiply(Integer a, Integer b) {
        return a*b;
    }

}
