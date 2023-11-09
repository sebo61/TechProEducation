package suleymanHocaJava.day27interface;

import suleymanHocaJava.day27interface.Brake;

public class Honda implements suleymanHocaJava.day27interface.Engine, Brake {

    @Override
    public void start() {
        System.out.println("Start....");

    }

    @Override
    public void payment() {
        System.out.println("pay the brake...");
        System.out.println("pay the engine...");
    }

    @Override
    public void slow() {
        System.out.println("Be slow...");

    }


}
