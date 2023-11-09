package day35lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");

        printElementsExceptStarsWithE(myList);
        System.out.println();
        printDistinctElementsLenghtLessThanFive(myList);
        System.out.println();
        List<String> newList = getElementsLenghtMoreThanFiveWithUpperCase(myList);
        System.out.println(newList);
        System.out.println();
        printElementsLenghtLessThanFiveUniqueWithToLowerCase(myList);
        System.out.println();
        printElementsUniqueToUpperCaseSorted(myList);
        System.out.println();
        printElementsUniqueLowerCaseSortWithLenght(myList);
        System.out.println();
        printElementsUniqueLowerCaseSortWithLenght2(myList);


    }

    //Example 1: Bir List'teki E ile baslayanlar haric tum elemanlari
    // console'a yazdiran method'u olusturunuz.
    public static void printElementsExceptStarsWithE(List<String> myList) {
        myList.
                stream().
                filter(t -> !t.startsWith("E")).
                forEach(t -> System.out.print(t + " "));
    }

    //Example 2: Bir List'te character sayisi 5 den az olan tum elemanlari
    // tekrarsiz olarak console'a yazdiran method'u olusturunuz.
    public static void printDistinctElementsLenghtLessThanFive(List<String> myList) {
        myList.
                stream().
                distinct().
                filter(t -> t.length() < 5).
                forEach(t -> System.out.print(t + " "));
    }
    //tavsiye edilir
    public static List<String> getElementsLenghtMoreThanFiveWithUpperCase2(List<String> myList) {
        return myList.
                stream().
                filter(t -> t.length() > 5).
                map(String::toUpperCase).
                collect(Collectors.toList());
    }


    //Example 3: Bir List'teki character sayisi 5 den cok olan tum elemanlari buyuk
    // harflerle bir listin icinde veren method'u olusturunuz.
    public static List<String> getElementsLenghtMoreThanFiveWithUpperCase(List<String> myList) {
        return myList.
                stream().
                filter(t -> t.length() > 5).
                map(t -> t.toUpperCase()).
                collect(Collectors.toList());
    }

    //Example 4: Bir List'teki character sayisi 5 den az olan tum elemanlari tekrarsiz olarak kucuk harflerle
    // natural order da console'a yazdiran method'u olusturunuz.
    public static void printElementsLenghtLessThanFiveUniqueWithToLowerCase(List<String> myList) {
        myList.
                stream().
                distinct().
                filter(t -> t.length() < 5).
                sorted().
                map(t -> t.toLowerCase()).
                forEach(t -> System.out.print(t + " "));

    }
    public static void printElementsLenghtLessThanFiveUniqueWithToLowerCase2(List<String> myList) {
        myList.
                stream().
                distinct().
                filter(t -> t.length() < 5).
                sorted().
                map(String::toLowerCase).
                forEach(Utils::printInTheSameLineWithSpace);

    }


    //Example 5: Bir List'teki elemanlari tekrarsiz olarak buyuk harflerle alfabetik sirada
    // console'a yazdiran method'u olusturunuz.
    public static void printElementsUniqueToUpperCaseSorted(List<String> myList) {
        myList.
                stream().
                distinct().
                sorted().
                map(t -> t.toUpperCase()).
                forEach(t -> System.out.print(t + " "));
    }
    //tavsiye edilir. best practice
    public static void printElementsUniqueToUpperCaseSorted2(List<String> myList) {
        myList.
                stream().
                distinct().
                sorted().
                map(String::toUpperCase).
                forEach(Utils::printInTheSameLineWithSpace);
    }



    //Example 6: Bir List'teki elemanlari tekrarsiz olarak kucuk harflerle uzunluklarina gore
    // kucukten buyuge sıralayarak console'a yazdiran method'u olusturunuz.
    public static void printElementsUniqueLowerCaseSortWithLenght(List<String> myList) {
        myList.
                stream().
                distinct().
                map(t->t.toLowerCase()).
                sorted(Comparator.comparing(t->t.length())).
                forEach(t-> System.out.print(t+" "));

    }
    //tavsiye edilir.
    public static void printElementsUniqueLowerCaseSortWithLenght2(List<String> myList) {
        myList.
                stream().
                distinct().
                map(String::toLowerCase).
                sorted(Comparator.comparing(String::length)).
                forEach(Utils::printInTheSameLineWithSpace);

    }



}
