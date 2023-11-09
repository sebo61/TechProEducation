package practice01;

import java.util.Scanner;

public class S04_Hipotenus_Metot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("a kenarını girin");
        double a = input.nextDouble();

        System.out.println("b kenarını girin");
        double b = input.nextDouble();
        System.out.println(hipotonusHesapla(a,b));


    }
        public static double hipotonusHesapla ( double a, double b){

return Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        }

    }

