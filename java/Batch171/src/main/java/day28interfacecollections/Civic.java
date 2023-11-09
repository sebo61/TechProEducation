package day28interfacecollections;

public class Civic implements Ac,Engine,Security {
    public void cool() {
        System.out.println("civic cools perfect");

    }

    @Override
    public void run() {
        System.out.println("ac runs super");
    }
    //interface


}
