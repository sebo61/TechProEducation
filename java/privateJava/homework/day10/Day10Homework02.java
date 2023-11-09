package homework.day10;

import java.util.Scanner;

public class Day10Homework02 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Öğrenmek istediğiniz gün adını giriniz.:");
        String dayName=input.next();

        if(dayName.equalsIgnoreCase("Sunday")){
            System.out.println(1);
        }else if(dayName.equalsIgnoreCase("Monday")){
            System.out.println(2);
        }else if(dayName.equalsIgnoreCase("Tuesday")){
            System.out.println(3);
        }else if(dayName.equalsIgnoreCase("Wadnesday")){
            System.out.println(4);
        }else if(dayName.equalsIgnoreCase("Thursday")){
            System.out.println(5);
        }else if(dayName.equalsIgnoreCase("Friday")){
            System.out.println(6);
        }else if(dayName.equalsIgnoreCase("Saturday")){
            System.out.println(7);
        }else{
            System.out.println("Geçerli gün adı giriniz.");
        }


    }
}
