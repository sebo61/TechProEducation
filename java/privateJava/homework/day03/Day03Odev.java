package homework.day03;

//method example
public class Day03Odev {
    public static void main(String[] args) {
        System.out.println("circlePerimeter(2.2) = " + circlePerimeter(2.2));
        System.out.println("circleArea(2.2) = " + circleArea(2.2));
    }

    static double circlePerimeter(double r) {
        return 2 * 3.14 * r;
    }

    static double circleArea(double r) {
        return 3.14 * r * r;
    }

}
