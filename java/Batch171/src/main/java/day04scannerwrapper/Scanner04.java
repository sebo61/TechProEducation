package day04scannerwrapper;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        //ornek: kullanicidan bir diktörtgenin iki kenar uzunluğunu alıp,
        //a) alaninin hesaplayınız.
        //b)çevresini hesaplayınız.

        Scanner input = new Scanner(System.in);
        System.out.println("Dirtdörtgenin kısa ve uzun kenarını giriniz..:");

        double edge1 = input.nextDouble();
        double edge2 = input.nextDouble();

        System.out.println("Alan..:" + (edge1 * edge2));
        System.out.println("Çevre..:" + (2 * (edge1 + edge2)));


    }
}
