package day35lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda02 {
    public static void main(String[] args) {
        List<String> myList=new ArrayList<>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");
        // removeIfLengthGreaterThanFive(myList);
        // removeIfElementsStartsWithZorf(myList);
        removeIfElementsStartsWithZorf2(myList);
    }
    // xchracter sayısı 6 den fazla olanları sil
    public static void removeIfLengthGreaterThanFive(List<String> myList){
        myList.removeIf(t->t.length()>5);

        System.out.println(myList);

    }
    // "Z" ile başlayan yada 'f' ile biten elemanları silen metod
    public static void removeIfElementsStartsWithZorf(List<String> myList){
        myList.removeIf(t->t.charAt(0)=='Z' || t.charAt(t.length()-1)=='f');
        System.out.println(myList);

    }
    // 2.yol
    public static void removeIfElementsStartsWithZorf2(List<String> myList){
        myList.removeIf(t->t.startsWith("Z") || t.endsWith("f"));
        System.out.println(myList);

    }





}
