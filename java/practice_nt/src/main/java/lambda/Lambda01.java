package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {

        List<Integer> sayi=new ArrayList<>(Arrays.asList(-5,-8,-12,0,1,12,5,5,6,9,15,8));
        //SORU1: List elemanlarının çift ve pozitif olanlarını, Lambda Expression kullanarak aralarında bosluk olacak sekilde yazdırın
        ciftPozitif(sayi);
        System.out.println();
        ciftPozitifMethodReferance(sayi);
        System.out.println("\n************");
        printSquare(sayi);
        System.out.println("\n************");
        printUnique(sayi);
        System.out.println();
        printSorted(sayi);
        System.out.println();
        pozitifKüpBirler(sayi);
        System.out.println();
        toplamiMethodReferance(sayi);
        System.out.println();
        toplamLambdaExpression(sayi);
        System.out.println();
        System.out.println(printListMultiple(sayi));
        System.out.println();
        List<Integer> newList=ciftKareSirali(sayi);
        System.out.println(newList);

    }
    public static void ciftPozitif(List<Integer> sayi){
        sayi.stream().filter(t->t%2==0 && t>0).forEach(t-> System.out.print(t+" "));
        // sayi.stream().filter(t->t%2==0).filter(t-> t>0).forEach(t-> System.out.print(t+" ")); //filter ayrı da yzılır.


    }
    //SORU2: List elemanlarının çift ve pozitif olanlarını, Method Referances kullanarak aralarında bosluk olacak sekilde yazdırın
    public static void ciftPozitifMethodReferance(List<Integer> sayi){

        sayi.stream().filter(Utils::ciftPozitifBul).forEach(Utils::yazdir);

    }
    //SORU3 : List elemanlarının karelerini, aralarında bosluk olacak sekilde yazdırın
    public static void printSquare(List<Integer> sayi){
        sayi.stream().map(t->t*t).forEach(Utils::yazdir);

}
//SORU4 : List elemanlarının karelerini, tekrarsiz yazdırın
    public static void printUnique(List<Integer> sayi){
        sayi.stream().map(t->t*t).distinct().forEach(Utils::yazdir);
    }
    //SORU5: List elemanlarını buyukten kucuge sıralayarak yazdırın
    public static void printSorted(List <Integer> sayi){
        sayi.stream().sorted(Comparator.reverseOrder()).forEach(Utils::yazdir);

    }
    // SORU6 : List elemanlarının pozitif olanlarının, kuplerini bulup, birler basamagı 5 olanları yazdırınız
    public static void pozitifKüpBirler(List<Integer> sayi){
        sayi.stream().filter(t->t>0).map(t->t*t*t).filter(t->t%10==5).forEach(Utils::yazdir);
    }
    // SORU7: List elemanlarının Method References ile toplamını bulun ve yazdırın
    public static void toplamiMethodReferance(List<Integer> sayi){

        int toplam= sayi.stream().reduce(Integer::sum).get();
        System.out.println(toplam);
    }
    // SORU8: List elemanlarının Lambda Expression ile toplamını bulun ve yazdırın

    public static void toplamLambdaExpression(List<Integer> sayi) {
        int sonuc= sayi.stream().reduce(0,(a,b)->a+b);
        System.out.println(sonuc);
    }
    //SORU9 : Listin pozitif elemanlarının, carpımını Lambda Expression ile return ederek yazdırın
    public static int printListMultiple(List<Integer> sayi) {
        int carpim=sayi.stream().filter(t->t>0).reduce(1,(a,b)->a*b);
        return carpim;

    }
    //SORU10 : Listin cift elemanlarının, karelerini, kucukten buyuge sıralayıp list halinde return ederek yazdırınız
    public  static List<Integer> ciftKareSirali(List <Integer> sayi ){
        return sayi.stream().filter(t->t%2==0).map(t->t*t).sorted().collect(Collectors.toList());

    }

}
