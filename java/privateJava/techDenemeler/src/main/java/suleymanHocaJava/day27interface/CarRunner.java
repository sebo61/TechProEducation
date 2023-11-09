package suleymanHocaJava.day27interface;

public class CarRunner {
    public static void main(String[] args) {
      Engine.stop(); // stop methodu static olduğundan intrerface ismi ile ulşatım.

         Honda h=new Honda();
         h.eco(); // eco metodu static olmadığından object ile ulaştım.


    }
}
