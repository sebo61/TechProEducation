package day04scannerwrapper;

import java.util.Scanner;

public class ScannerHomework {
    public static void main(String[] args) {
        //3 tam sayının ortalamasını bulma
        Scanner input = new Scanner(System.in);

        System.out.println("Ortalaması alınacak 3 tam sayı giriniz..:");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        System.out.println("Girilen 3 tam sayının ortalması..:" + (number1 + number2 + number3) / 3);

    }
}
