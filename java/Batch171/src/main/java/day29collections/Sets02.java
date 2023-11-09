package day29collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Sets02 {
    public static void main(String[] args) {
       Long  t1= System.nanoTime();

        // örnek: öğrenci email adreslerini natural orderda sıralanmış olarak nasıl depolarsınız.
        // 1. yol
        TreeSet<String> emails = new TreeSet<>();
        emails.add("af@gmail.com");
        emails.add("df@gmail.com");
        emails.add("thr@hotmail.com");
        emails.add("yhdk@gmail.com");
        emails.add("vhdk@gmail.com");
        emails.add("shdk@gmail.com");
        emails.add("bhdk@gmail.com");
        System.out.println(emails);
        //2. yol
        HashSet<String > emailsHs=new HashSet<>();
        Long t2= System.nanoTime();
        emailsHs.add("af@gmail.com");
        emailsHs.add("df@gmail.com");
        emailsHs.add("thr@hotmail.com");
        emailsHs.add("yhdk@gmail.com");
        emailsHs.add("vhdk@gmail.com");
        emailsHs.add("shdk@gmail.com");
        emailsHs.add("bhdk@gmail.com");
        System.out.println(emailsHs);
        TreeSet<String> emailHsTs=new TreeSet<>(emailsHs);
        System.out.println(emailHsTs);


        Long t3= System.nanoTime();

        System.out.println(t2-t1 );
        System.out.println(t3-t2 );

    }


}
