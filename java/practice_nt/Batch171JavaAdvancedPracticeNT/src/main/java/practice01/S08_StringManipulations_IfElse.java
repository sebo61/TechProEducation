package practice01;

import java.util.Scanner;

public class S08_StringManipulations_IfElse {
    public static void main(String[] args) {


     /*
        Kullanıcının girdiği bir String ifadenin son üç karakterini alarak bu üç karakteri
        String ifadenin başına ve sonuna ekleyen
        bir Java programı yazınız.
    */

        Scanner input = new Scanner(System.in);
        System.out.println("kelimeyi giriniz.");
        String str = input.next();

        if (str.length() > 2) {

            int boy = str.length();

            String sonUc = str.substring(boy - 3);

            System.out.println(sonUc + str + sonUc);


        } else {
            System.out.println("en az üç karakterli bir kelime girniz.");
        }
    }
}
