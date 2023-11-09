package day17Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays02 {
    public static void main(String[] args) {
        //örnek : kullanıcının çoklu data yı bir array e yerleştirebilmesi ve istediği zaman
        //durdurabilmesi için gereken kdu yazınız.

        /*
        1) Kullanıcıdan dat almak için Scanner nesnesi oluştur.
        2) Çoklu data yı yerleştirmek için bir array oluşturmalıyız.
        3)array oluşrabilmek için kullanıcıdan array a kaç tane eleman koyacağını almalıyız.
        4) loop oluşturup eleman ekleme işlemni tekrar tekrar yapabilmeliyiz.
                 */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen eklemek istediğiniz öğrenci sayısını giriniz.");
        int numOfElements = input.nextInt();

        String stdNames[] = new String[numOfElements];
        System.out.println("işlemi durdurmak için 'q' harfine basınız.");

        for (int i=0;i<stdNames.length;i++){
            System.out.println((i+1)+". öğrencinin ismini giriniz.");
            String name=input.next();
            if(name.equalsIgnoreCase("q")){
                break;
            }else {
                stdNames[i]=name;

            }

        }
        System.out.println(Arrays.toString(stdNames));


    }
}
