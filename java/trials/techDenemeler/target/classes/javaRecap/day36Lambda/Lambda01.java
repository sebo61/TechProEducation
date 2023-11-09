package day36Lambda;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {
        Course courseTurkishDay = new Course("Summer", "Turkish Day", 97, 128);
        Course courseTurkishNight = new Course("Winter", "Turkish Night", 98, 155);
        Course courseEnglishSpring = new Course("Summer", "English Day", 95, 132);
        Course courseEnglishNight = new Course("Winter", "English night", 80, 144);


        List<Course> courseList = new ArrayList<>();
        courseList.add(courseTurkishDay);
        courseList.add(courseEnglishNight);
        courseList.add(courseEnglishSpring);
        courseList.add(courseTurkishNight);


        // tüm avarage skorların  den büyük olup olmadığını kontrol kodu yazınız.

        boolean result1 = courseList.stream().allMatch(t -> t.getAvarageScore() > 80);
        System.out.println(result1);
        // allMatch() : verilen şarta göre stream içideki tüm elemanların bu şarta uyması durumunda true verecektir.

        // kurs isimlerinden en birinin "turkish" içerip içermediğini kontrol ediniz.

        boolean result2 = courseList.stream().anyMatch(t -> t.getCourseName().contains("Turkishx"));
        System.out.println(result2);
        // antMatch(): verilen şarta göre stream içindeki herhangi bir elemanın bu şarta uyması durumunda true verir.

        // kurs dönemleri içinde "Fall" bulunmadığını kontrol ediniz.

        boolean result3 = courseList.stream().noneMatch(t -> t.getSeason().contains("Fall"));
        System.out.println(result3);
        // verilen şarta göre steam içinde ki hiç bir elmanın şartı sağlamaması durumunda true verir.

        // Avarage skoru en yüksek olan kursun ismini consola yazdırınız.

        String result4 = courseList.stream().sorted(Comparator.comparing(Course::getAvarageScore).reversed()).findFirst().get().getCourseName();
        System.out.println(result4);

        // tüm course objelerini avarage score a göre küçükten büyüğe diziniz ilk 2 hariç yazdırın

        List<Course> mylist = courseList.stream().sorted(Comparator.comparing(Course::getAvarageScore)).skip(2).
                collect(Collectors.toList());

        System.out.println(mylist);

        // tüm course objelerini avarage csorelarına göre küçükten büyüğe ilk 3 ünü consola yazdırınız.


        List<Course> mylist2 = courseList.stream().sorted(Comparator.comparing(Course::getAvarageScore)).limit(3).collect(Collectors.toList());
        System.out.println(mylist2);

        // courseda bulunan öğrenci sayılarına göre büyükten küçüğe sirali bir şekilde listin içnde.

        List<Course> list = courseList.stream().sorted(Comparator.comparing(Course::getNumberOfStudents).reversed()).
                collect(Collectors.toList());

        System.out.println(list);

        // course da bulunan ingilizece bölüm sayısı
        Long english = courseList.stream().filter(t -> t.getCourseName().contains("English")).count();
        System.out.println(english);

        // öğrenci sayısı 140 dan az olan kursları bir liste halinde.

        List<Course> studentList= courseList.stream().filter(t->t.getNumberOfStudents()<140).collect(Collectors.toList());
        System.out.println(studentList);
    }
}
