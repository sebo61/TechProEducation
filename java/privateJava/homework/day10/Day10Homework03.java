package homework.day10;

import java.util.Scanner;

public class Day10Homework03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ay numarasını giriniz.:");
        int mounthNumber = input.nextInt();
            
        if (mounthNumber == 1) {
            System.out.println("January");
        } else if (mounthNumber == 2) {
            System.out.println("February");
        } else if (mounthNumber == 3) {
            System.out.println("March");
        } else if (mounthNumber == 4) {
            System.out.println("April");
        } else if (mounthNumber == 5) {
            System.out.println("May");
        } else if (mounthNumber == 6) {
            System.out.println("June");
        } else if (mounthNumber == 7) {
            System.out.println("July");
        } else if (mounthNumber == 8) {
            System.out.println("August");
        } else if (mounthNumber == 9) {
            System.out.println("September");
        } else if (mounthNumber == 10) {
            System.out.println("October");
        } else if (mounthNumber == 11) {
            System.out.println("November");
        } else if (mounthNumber == 12) {
            System.out.println("December");
        } else {
            System.out.println("Lütfen 1 ile 12 arası bir sayı giriniz.");
        }
    }
}


