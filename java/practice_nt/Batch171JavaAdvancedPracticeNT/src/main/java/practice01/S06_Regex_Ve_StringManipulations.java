package practice01;

import javax.xml.transform.sax.SAXTransformerFactory;
import java.util.Scanner;

public class S06_Regex_Ve_StringManipulations {
    public static void main(String[] args) {
 /*
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız.
       Ad ayrı, soyad ayrı sekilde ekrana yazdırınız.
       Örnek:
          Ad: Ali
          Soyad: Can
    */


        Scanner input=new Scanner(System.in);
        System.out.println("ad ve soyad giriniz.");
        String nameSurname= input.nextLine();

        String a1=nameSurname.split(" ")[0];
        String a2=nameSurname.split(" ")[1];

        System.out.println(a1);
        System.out.println(a2);



    }
}
