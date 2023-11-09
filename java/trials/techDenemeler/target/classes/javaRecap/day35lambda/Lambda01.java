package day35lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {
        List<String> myList=new ArrayList<>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");

        printElementExceptStartWithE(myList);
        System.out.println();
        printDistictElementsLengthThanFive(myList);
        System.out.println();
        List<String> list = getElementsLengthMoreThanFiveWithUpperCase(myList);
        System.out.println(list);
        System.out.println();
        printElemnetsThanFiveDistinctSmallCharacter(myList);
        System.out.println();
        printElementsUniqueUpperCase(myList);
        System.out.println();
        printElementsUniqueLowerCaseSortWithLength(myList);
    }
    // E ile başlayanla hariç tüm elemanları yazdır
    public static void  printElementExceptStartWithE(List<String> myList){
        myList.
                stream().
                filter(t->!t.startsWith("E")).
                forEach(t-> System.out.print(t+" "));

    }
    //bir liste karakter sayısı 5 den az olanları tekrarsız
    public static void printDistictElementsLengthThanFive(List<String> myList){

        myList.
                stream().
                distinct().
                filter(t->t.length()<5).
                forEach(t-> System.out.print(t+" "));

    }
    // listede charactr sayısı 5 den çok olan tüm elemanları buyuk harflerle listin içinde veren method

    public static List<String> getElementsLengthMoreThanFiveWithUpperCase(List<String> myList){
        return myList.
                stream().
                filter(t->t.length()>5)
                .map(t->t.toUpperCase()).
                collect(Collectors.toList());

    }
    public static List<String> getElementsLengthMoreThanFiveWithUpperCase2(List<String> myList){
        return myList.
                stream().
                filter(t->t.length()>5).
                map(String::toUpperCase).
                collect(Collectors.toList());

    }

    // karakter sayısı 5 den az olan tüm elemanları tekrarsız olarak küçük harfle natural olarak
        public static void printElemnetsThanFiveDistinctSmallCharacter(List<String> myList){

            myList.
                    stream().
                    distinct().
                    filter(t->t.length()<5).
                    sorted().
                    map(t->t.toLowerCase()).
                    forEach(Utils::printInTheSameLineWithSpace);

        }
    public static void printElemnetsThanFiveDistinctSmallCharacter2(List<String> myList){

        myList.
                stream().
                distinct().
                filter(t->t.length()<5).
                sorted().
                map(String::toLowerCase).
                forEach(Utils::printInTheSameLineWithSpace); // best practise

    }

        // elemanları ekrarsız olarak büyük harflerle alfabetik sırada konsola yaz

    public static void printElementsUniqueUpperCase(List<String> myList){

        myList.
                stream().
                distinct().
                sorted().
                map(t->t.toUpperCase()).
                forEach(t-> System.out.print(t+" "));

    }
    public static void printElementsUniqueUpperCase2(List<String> myList){

        myList.
                stream().
                distinct().
                sorted().
                map(String::toUpperCase).
                forEach(Utils::printInTheSameLineWithSpace);

    }
    // elemanları tekrarsız küçük harflerle uzunluklarına göre

    public static void printElementsUniqueLowerCaseSortWithLength(List<String> myList){

        myList.
                stream().
                distinct().
                map(t->t.toLowerCase()).
                sorted(Comparator.comparing(t->t.length())).
                forEach(t-> System.out.print(t+" "));


    }
    public static void printElementsUniqueLowerCaseSortWithLength2(List<String> myList){

        myList.
                stream().
                distinct().
                map(String::toLowerCase). // className::methodName
                sorted(Comparator.comparing(String::length)).
                forEach(t-> System.out.print(t+" "));

    }



}
