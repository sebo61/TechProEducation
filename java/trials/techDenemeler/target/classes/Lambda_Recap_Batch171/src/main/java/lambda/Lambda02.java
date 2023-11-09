package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda02 {
    public static void main(String[] args) {
       List<String> fruits = new ArrayList<>(Arrays.asList("elma", "portakal", "üzüm", "çilek", "greyfurt", "nar", "mandalina", "armut", "elma", "keçiboynuzu", "elma"));
        ilkHarfeorc(fruits);
        System.out.println();

     addStarHeadAndTail(fruits);
        System.out.println();
        ineLetters(fruits);
        System.out.println();
        removelLetters(fruits);
        System.out.println();
        characterNumberSorted(fruits);
        System.out.println();
        characterBigToSmall(fruits);




    }
    // ilk harfi 'e' veya 'c' olamları uazdırın

    public static void ilkHarfeorc(List<String> fruits){

        fruits.stream().filter(t->t.startsWith("e") || t.startsWith("'c")).forEach(Utils::yazdir);


    }
    // basina ve sonuna * ekleyin

    public static void addStarHeadAndTail(List<String> fruits){

        fruits.stream().forEach(t-> System.out.print("*"+t+"*" + " "));
    }
    // içinde e harfi olanları yazdırın

    public static void ineLetters(List<String> fruits){

        fruits.stream().filter(t->t.contains("e")).forEach(Utils::yazdir);
    }
    // içinde l harfini silip yazdırın
    public static void removelLetters(List<String> ftuits){
        ftuits.stream().map(t->t.replace("l","")).forEach(Utils::yazdir);

    }
    // liste elemanlarını karakter sayısına göre küçükten büyüğe

    public static void characterNumberSorted(List<String> fruits){
        fruits.stream().sorted(Comparator.comparing(t->t.length())).forEach(Utils::yazdir);

    }
    // liste elemanlarını karakter sayısına göre buyukten küçüğe

    public static void characterNumberSorted2(List<String> fruits){
        fruits.stream().sorted(Comparator.comparing(t->t.toString().length()).reversed()).forEach(Utils::yazdir);

    }
    // elemanları method referance ile karakter syısına göre büyükten küçüğe
    public static void characterBigToSmall(List<String> fruits){
        fruits.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(Utils::yazdir);


    }



}
