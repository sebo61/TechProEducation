package practice03;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S08_ArrayList_Menu {
    public static void main(String[] args) {
         /*
        Bir restoraın menüsüne eklenecek öğeleri kullanıcıdan alarak List'e ekleyin ve menüyü ekrana yazdırın.
    */
        List<String> menu=new ArrayList<>();
        Scanner input=new Scanner(System.in);

String secenek;
        do {
            System.out.println("Lütfen eklemek istediğiniz yemek ismini giriniz: ");
           String yemek=input.nextLine();
           if(menu.contains(yemek)){
               System.out.println("Yemek zaten var");
           }else {
               menu.add(yemek);
               System.out.println(yemek+ " menüye eklendi.");
           }

            System.out.println("Başka bir yemek istiyor musunuz? (E/H)");
            secenek=input.nextLine();

        }while(secenek.equalsIgnoreCase("E")) ;
        System.out.println("Menu"+ menu);





    }
}
