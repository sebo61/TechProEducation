package day14Lops;

import javax.xml.transform.sax.SAXTransformerFactory;

public class Loops01 {
    public static void main(String[] args) {
        //örnek bir stringi ters ceviren kodu yazınız.
        // java ==> avaj
        //1. yol

        String t = "Java";
        String ters = "";

        for (int i = t.length() - 1; i >= 0; i--) {

            ters = ters + t.substring(i, i + 1); //string değişkene bu şekilde değer yükleyebiliyormuşuz.
            System.out.println("loop içi="+ters);
        }
        System.out.println(ters);

        // 2. yol


        String u = "Java";
        String ters2 = "";

        for(int i=u.length()-1;i>=0;i--){
           ters2=ters2 + u.charAt(i);

        }
        System.out.println(ters2);
        //örnek 2: size verilen bir stringin palidron olup olmadığını kontrol eden kodu yazınız.
        // ey edip adanada pide ye
        //stringi ters cevir düz hali le düz halini karşılaştır. eşitse palidrondur.


        String duz="Ey edip adanada pide ye";
        String ters3="";
        for (int i=duz.length()-1;i>=0;i--){

           ters3=ters3 + duz.charAt(i);


        }
        System.out.println(ters3);

        if (ters3.equalsIgnoreCase(duz)){
            System.out.println("palidrondur.");
        }else {
            System.out.println("palidron değildir.");
        }


    }
}
