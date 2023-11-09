package day36lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {
        Course courseTurkishDay = new Course("Summer", "Turkish Day", 97, 128);
        Course courseTurkishNight = new Course("Winter", "Turkish Night", 98, 155);
        Course courseEnglishDay = new Course("English Day", "English Night", 95, 132);
        Course courseEnglishNight = new Course("English Night", "English Night", 93, 144);

        List<Course> courseList = new ArrayList<>();
        courseList.add(courseTurkishDay);
        courseList.add(courseTurkishNight);
        courseList.add(courseEnglishNight);
        courseList.add(courseEnglishDay);

        // 1) tüm avarageScore ların 91 den büyük olup olmadığın kontrol eden kodu yazınız.

        boolean result1= courseList.stream().allMatch(t->t.getAvarageScore()>91);
        System.out.println(result1);
        // allMatch verilen şarta göre Stream içindeki tüm elemanların bu şarta uyması durumunda true verecektir.
        // bir tane bile şarta uymazsa false verir.

        // 2) Kurs isimlerinden en az birinin Turkish kelimesini içerip içermediğini kontrol eden kodu yazınız.
        boolean result2= courseList.stream().anyMatch(t->t.getCourseName().contains("Turkish"));
        System.out.println(result2);
        // anyMatch verilen şarta göre stream içindeki herhangi bir elemanın bu şarta uyması durumunda true verir.
         // 3) Kurs dönmleri içinde fall döneminin hhiç bulunmadığını kontrol eden kodu yazınız.

        boolean result3= courseList.stream().noneMatch(t->t.getSeoson().contains("Fall"));
        System.out.println(result3);
        // noneMatch: verilen şarta göre stream içindeki hiçbir elemanın şartı sağlamaması durumunda true verir.
         // 4) AvarageScore u en yükek olan course un ismini consola yazdıran kodu yazınız.
        String courseName1= courseList.stream().sorted(Comparator.comparing(Course::getAvarageScore).reversed()).findFirst().get().getCourseName();
        System.out.println(courseName1); // Turkish Night
        // 5) Tüm course objelerini avarage score a göre küçükten büyüğe diziniz. ve ilk ikisi hariç liste halinde yazdırımız.

        List <Course> myList= courseList.stream().sorted(Comparator.comparing(Course::getCourseName)).skip(2).collect(Collectors.toList());
        System.out.println(myList);
        // 6) Tüm course objelerinin avarageCourselarına göre küçükten büyüğe diziniz ve ilk 3 ünü liste halinde consola yazdırınız.
        List <Course> myList2= courseList.stream().sorted(Comparator.comparing(Course::getCourseName)).limit(3).collect(Collectors.toList());
        System.out.println(myList2);
        // 7) kursta bulunan öğrenci sayılarına göre büyükten küçüğe sıralı şekilde listin iöçinde veren kod.
        List<Course> ogrList=courseList.stream().sorted(Comparator.comparing(Course::getNumberOfStudents).reversed()).collect(Collectors.toList());
        System.out.println(ogrList);
        // 8 Kursta bulunan ingilizce bolumlerinin sayisini veren kodu yaziniz.

        long countEnglishCourse= courseList.stream().filter(t->t.getCourseName().contains("English")).count();
        System.out.println(countEnglishCourse);
        // 9) öğrenci sayısı 140 dan az olan kursları bir liste halinde veren kodu yazınız.

        List <Course> studentList= courseList.stream().sorted(Comparator.comparing(Course::getNumberOfStudents)).filter(t->t.getNumberOfStudents()<140).collect(Collectors.toList());
        System.out.println(studentList);

    }

}
