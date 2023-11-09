package practice01;

import java.util.Scanner;

public class S07_StringManipulations {
    public static void main(String[] args) {
          /*
        Kullanıcıdan adını, ikinci adını ve soyadını tek bir satırda girmesini isteyin.
        Ardından ikinci adın ve soyadın ilk karakterini yazdırın.
        Örnek: Mark Hansel Twain ==> HT
    */


        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen 3 lü ismi girin");
        String str= input.nextLine();

       int ilk= str.indexOf(" ");
       int son=str.lastIndexOf(" ");

        System.out.println(str.substring(ilk+1,ilk+2)+str.substring(son+1,son+2));






    }
}
