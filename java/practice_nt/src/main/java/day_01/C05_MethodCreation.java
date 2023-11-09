package day_01;

public class C05_MethodCreation {
    public static void main(String[] args) {
        squareTotal(4, 5);
    }

    ////iki sayının kareleri toplamını bulan ve yazdıran bır method olusturunuz
    public static void squareTotal(int a, int b) {

        System.out.println("Kare toplamları:." + (a * 2 + b * b));
    }

}
