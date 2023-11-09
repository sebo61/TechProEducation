package suleymanHocaJava.day37exceptionsenums;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomExceptionRunner {
    /*
    try kullandığımızda her zaman çalışmasını istediğimiz kodları finaly içine yazarız.
    finalize: garbage collector memory yi temiz tutmak için sürekli memory yi tarar ve silinmesi gerekenleri siler.
                Garbage collector silmeden önce silinecek öğeleri finilize eder sonra siler. silinecek diye
                işaretleyip siler.
     */
    public static void main(String[] args) throws IllegalGradeException {
       // System.out.println(getGrades());
        try{
            printAge(-5);
        }catch (IllegalAgeException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("ben her zaman çalışırım.");
        }

    }
    // öğrenci notlarını bir liste ekleyen methodu oluşturunuz.

    public static List<String> getGrades() throws IllegalGradeException {
        List<String> grades = new ArrayList<>();
        String grade="";
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("please enter the grade to stop press entering  q");
            grade=input.next();
            Integer intGrade=0;
            if (!grade.equals("q")) {

                intGrade = Integer.valueOf(grade);
            }
            if (grade.equals("q")){
                break;
            }
            if (intGrade >=0 && intGrade <= 100 && !grade.equals("q")) {
                grades.add(grade);

            } else {

                throw new IllegalGradeException("grdaes less than zero and greater than 100 are not valid");
            }

        } while (true);

        return  grades;
    }

    // kullanıcının yasini konsola yazdıran metodu oluşturunuz.
    public static void printAge(int age) {
        if(age<0) {
            throw new IllegalAgeException("Ages cannot be negative");
        }
        System.out.println(age);

    }

}
