package day07stringmanipulations;

import java.net.PasswordAuthentication;
import java.util.Scanner;

public class StringManipulations02 {
    public static void main(String[] args) {
        /*
        örnek: aşağıdaki kurallara göre kullanıcının girdiği
        passwordu kontrol ediniz.
            1) en az 8 karakter olsun.
            2) space characteri password de olmasın
            3) en az bir upperCase olsun
            4) en az bir küçük harf olsun
            5) En az 1 rakam olsun
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen passwordünüzü giriniz..:");
        String passWord = input.nextLine();
        // 1) en az 8 karakter olsun.
        boolean first = passWord.length() > 7;
        System.out.println("en az 8 karakter var mı? " + first);
        // 2) space characteri password de olmasın

        boolean second = !passWord.contains(" ");
        System.out.println("second = " + second);
        //  3) en az bir upperCase olsun
        boolean third = passWord.replaceAll("[^A-Z]", "").length() > 0;//methodları aynı satırda kullanmaya method chain denir
        System.out.println("third = " + third);
        //    4) en az bir küçük harf olsun
        boolean fourth = passWord.replaceAll("[^a-z]", "").length() > 0;
        System.out.println("fourth = " + fourth);
        //5) En az 1 rakam olsun
        boolean fifth = passWord.replaceAll("[^0-9]", "").length() > 0;
        System.out.println("fifth = " + fifth);
        System.out.println("Password geçerli mi..:"+(first&&second&&third&&fourth&&fifth));




    }
}
