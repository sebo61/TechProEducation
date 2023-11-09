package day02;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        /*

        //Kullanicidan aldiginiz character ile asagidaki gibi bir gorunum olusturunuz

        /*
                  A
                 A A
                A A A
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("İstediğiniz karakteri yazınız..:");
        char ch = scan.next().charAt(0);//scanner objesinin nextChar diye bir methodu yoktur.
        //bu yüzden kullanının girdiği datayı önce String olarak alıyoruz, sonra bu Stringin
        //0. indexindeki karakteri charAt(0) methodu ile alıyoruz.

        System.out.println("ch = " + ch);
        System.out.println("=================CEVAP================");

        //CONSOLDA BOŞLUK, YANİ space yapmak için clasımızdaki sout'un içinde space'i mutlaka ""
        //içinde yazmalıyız.
        System.out.println("  "+ch+"  "+"\n"+" "+ch+" "+ch+" "+"\n"+ch+" "+ch+" "+ch);//tek satırda
        //"\n" ,şareti alt satıra geçmek için kullanılır ve " " arqsına yazılır.


    }
}
