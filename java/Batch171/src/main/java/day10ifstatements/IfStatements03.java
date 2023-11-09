package day10ifstatements;

import java.util.Scanner;

public class IfStatements03 {
    public static void main(String[] args) {
        //Example 1: Ay isimleri girilince kacinci ay oldugunu yazan kodu yaziniz.
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen ay adını giriniz..:");
        String mounthName=input.next();

        if (mounthName.equalsIgnoreCase("January")) {
            System.out.println("1. ay");
        }
        else if (mounthName.equalsIgnoreCase("February")) {
            System.out.println("2. ay");
        }
        else if (mounthName.equalsIgnoreCase("March")) {
            System.out.println("3. ay");
        }
        else if (mounthName.equalsIgnoreCase("April")) {
            System.out.println("4. ay");
        }
        else if (mounthName.equalsIgnoreCase("May")) {
            System.out.println("5. ay");
        }
        else if (mounthName.equalsIgnoreCase("June")) {
            System.out.println("6. ay");
        }
        else if (mounthName.equalsIgnoreCase("July")) {
            System.out.println("7. ay");
        }
        else if (mounthName.equalsIgnoreCase("August")) {
            System.out.println("8. ay");
        }
        else if (mounthName.equalsIgnoreCase("September")) {
            System.out.println("9. ay");
        }
        else if (mounthName.equalsIgnoreCase("October")) {
            System.out.println("10. ay");
        }
        else if (mounthName.equalsIgnoreCase("November")) {
            System.out.println("11. ay");
        }
        else if (mounthName.equalsIgnoreCase("December")) {
            System.out.println("12. ay");
        }
        else{
            System.out.println("Invalid mounth name");
        }

    }
}
