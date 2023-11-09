package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda02 {
    public static void main(String[] args) {
        List<String> meyve=new ArrayList<>(Arrays.asList("elma","portakal","üzüm","çilek","greyfurt","nar","mandalina",
                "armut","elma","keçiboynuzu","elma"));
        printLetterec(meyve);
        System.out.println();
        yilsizEkle(meyve);
        System.out.println();
        printLettere(meyve);
        System.out.println();
        removeL(meyve);
        System.out.println();
        karaterSayisiLambdaExpression(meyve);
        System.out.println();
        buyuktenKucugeSirala(meyve);


    }
    // SORU1 : List elemanlarının ilk harfi 'e' veya 'c' olanlari, Method References ile aralarında bosluk bırakarak yazdıralım
    public static void printLetterec(List<String> meyve){
        meyve.stream().filter(t->t.startsWith("e")|| t.startsWith("c")).forEach(Utils::yazdir);
    }
    // SORU2 : List elemanlarının hepsinin basina ve sonuna yildiz ekleyerek yazdiralim
    public static void yilsizEkle(List<String> meyve){
        meyve.stream().map(t->"*"+t+"*").forEach(Utils::yazdir);

    }
    // SORU3 : List elemanlarının icinde 'e' harfi olanları yazdırın
    public static void printLettere(List<String> meyve){
        meyve.stream().filter(t->t.contains("e")).forEach(Utils::yazdir);

    }
    // SORU4 : List elemanlarındaki 'l' harflerini silip yazdırınız
    public static void removeL(List<String> meyve){
        meyve.stream().map(t->t.replace("l","")).forEach(Utils::yazdir);
    }
    // SORU5 : List elemanlarini, Lambda Expression kullanarak
// karakter sayisina göre kucukten buyuge dogru sıralayarak yazdırınız
    public static void karaterSayisiLambdaExpression(List<String> meyve){

        meyve.stream().sorted(Comparator.comparing(t->t.length())).forEach(Utils::yazdir);
    }
    // SORU6 : List elemanlarini, Method References kullanarak
// karakter sayisina göre buyukten kucuge dogru sıralayarak yazdırınız
    public static void buyuktenKucugeSirala(List <String> meyve){
        meyve.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(Utils::yazdir);
    }




}
