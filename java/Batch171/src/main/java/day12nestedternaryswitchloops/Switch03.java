package day12nestedternaryswitchloops;

import javax.xml.transform.sax.SAXTransformerFactory;
import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {
        //Example 1: Kulanicidan iki sayi ve yapilacak islemi alan ve +, -, *, /, % islemlerini yapan kodu yaziniz
        Scanner input=new Scanner(System.in);
        System.out.println("LÜTFEN 2 SAYI GİRİNİZ.");
        double a= input.nextDouble();
        double b= input.nextDouble();

        System.out.println("Yapmak istediğiniz işlemi seciniz.: +,-,*,/,%");
        char opr=input.next().charAt(0);
        switch (opr){
            case '+':
                System.out.println(a+" + "+b+" = " + (a+b));
            break;
            case '-':
                System.out.println("Sayıların farkı..:"+(a-b));
                break;
            case '*':
                System.out.println("Sayıların çarpımı..:"+(a*b));
                break;
            case '/':
                System.out.println("Sayıların bölümü..:"+(a/b));
                break;
            case '%':
                System.out.println("Sayıların modulus'ı ..:"+(a%b));
                break;
            default:
                System.out.println("Lütfen belirtilen işlemlerden birini seciniz.");
        }

    }
}
