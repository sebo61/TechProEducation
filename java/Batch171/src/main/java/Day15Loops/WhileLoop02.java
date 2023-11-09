package Day15Loops;

import java.util.Scanner;

public class WhileLoop02 {
    public static void main(String[] args) {
        //Example 1: Kullanicinin verdigi sayi icin carpim tablosunu olusturup console'a
        // yazdiran kodu yaziniz

          /*            3 ==> 3x1=3
                            3x2=6
                            3x3=9
                            3x4=12 ...
                            3x10=30*/
        int i = 1;


        Scanner input = new Scanner(System.in);
        System.out.println("Çarpım tablosunu görmek için sayı giriniz");
        int num = input.nextInt();

        while (i < 11) {
            System.out.println(num + "*" + i + "=" + (num * i));

            i++;
        }

        // Example 2: verilen bir stringte her harfin sonrasına "*" sembolünü ekleyiniz.
        // java ==> J*a*v*a
        System.out.println("Bir kelime giriniz");
        String word = input.next();
        String newWord = "";

        int k = 0;
        while (k < word.length()) {
            newWord = newWord + word.charAt(k) + "*";


            k++;
        }
        System.out.println(newWord);
        // Example 3: bir stringdeki tekrarsız karakterleri konsola yazdırınız.
        //Kertenkelle ==> rtn
        // indexOf("k") ==> 0 farklı ise tekrarlı
        //lastIndexOf("k") ==> 6

        //indexOf("r") ==> 2 aynı ise tekrarsız
        // lastIndexof("r") ==> 2

        String s="kertenkelle";
        String sonuc="";

        int a=0;
        
        while (a<s.length()){
            char ch=s.charAt(a);

            if(s.indexOf(ch)==s.lastIndexOf(ch)){
                sonuc=sonuc+ch;

            }

            a++;
        }
        System.out.println(sonuc);






    }
}
