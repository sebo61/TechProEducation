package lambda;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {
        // map harici tüm collectionlarda kullanılmaz.
        List<Integer> sayi = new ArrayList<>(Arrays.asList(-5, -8, -12, 0, 1, 12, 5, 5, 6, 9, 15, 8));

        ciftvePozitif(sayi);
        System.out.println("\n***********************************");
        ciftvePozitifMehtodReferance(sayi);
        System.out.println();
        kare(sayi);
        System.out.println();
        kareTekrarsız(sayi);
        System.out.println();
        buyukTokucuk(sayi);
        System.out.println();
        kupBirlerFive(sayi);
        System.out.println();
        toplamMethodReferance(sayi);
        System.out.println();
        toplamLambdaExperession(sayi);
        System.out.println();
        System.out.println(pozitifList(sayi));
        System.out.println();
        List<Integer> list=doubleListElements(sayi);

        System.out.println(list);


    }

    // çift ve pozitif
    public static void ciftvePozitif(List<Integer> sayi) {


        sayi.stream().filter(t -> t > 0 && t % 2 == 0).forEach(t -> System.out.print(t + " "));
    }
 //çift ve pozitif olanları metod REFERNSA

    public static void ciftvePozitifMehtodReferance(List<Integer> sayi){
       // sayi.stream().filter(t->t%2==0 && t>0).forEach(Utils::yazdir);
        sayi.stream().filter(Utils::ciftPozitifBul).forEach(Utils::yazdir);

    }

    // list elemanlarının karelerini aralarına boşluklu

    public static void kare(List<Integer> sayi){
        sayi.stream().map(t->t*t).forEach(Utils::yazdir);

    }

    // karalerini tekrarsız

    public static void kareTekrarsız(List<Integer> sayi) {
        sayi.stream().map(t->t*t).distinct().forEach(Utils::yazdir);

    }
    // list elemanlarını büyükten küçüğe sırala

    public static void buyukTokucuk(List<Integer> sayi){
        sayi.stream().sorted(Comparator.reverseOrder()).forEach(Utils::yazdir);

    }

    // list elemanlarının pozitif olanların küplerini bulup birler basamağı 5 oalnlar.

    public static void kupBirlerFive(List<Integer> sayi){
        sayi.stream().filter(t->t>0).map(t->t*t*t).filter(t->t%10==5).forEach(Utils::yazdir);


    }

    // list elemanlarının method referanca ile toplamını bulun ve yazdırın
    public static void toplamMethodReferance(List<Integer> sayi){
        Integer toplam= sayi.stream().reduce(Integer::sum).get();
        System.out.println(toplam);


    }
    //  lambdaexpression ile toplamını bulun

    public static void toplamLambdaExperession(List<Integer> sayi) {

        int sonuc= sayi.stream().reduce(0,(a,b)->a+b);

        System.out.println(sonuc);
    }
    //listin pozitif elemanlarının çarpımını lambda expression ile return edin.

    public static Integer pozitifList(List<Integer> sayi){

        return sayi.stream().filter(t->t>0).reduce(1,(t,u)->t*u);

    }
    // listin çift elemanlarının karelerini küçükten büyüğe list halinde return

    public static List<Integer> doubleListElements(List<Integer> sayi) {

        return sayi.stream().filter(t->t%2==0).map(t->t*t).sorted().collect(Collectors.toList());
    }





}
