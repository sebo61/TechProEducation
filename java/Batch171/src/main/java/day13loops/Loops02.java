package day13loops;

public class Loops02 {
    public static void main(String[] args) {
        //21 den 180 e kadar hem 2 hemde 3 ile tam böl
        for (int i = 21; i < 181; i++) {
            if (i % 2 == 0 && i % 3 == 0) {

                System.out.print(i + "-");
            }

        }
        //örnek 2: size verilen küçük harfle yazılmış stringin indexi çift sayı olan
        //karakterlerini büyük harfe dönüştürünüz.
        System.out.println("\n");
        String s = "ankara";
        //s.length();
        for (int i = 0; i < s.length(); i++) {
            String ch = s.substring(i, i + 1);
            if (i % 2 == 0) {
                System.out.print(ch.toUpperCase());

            }

        }
        System.out.println("\n");
        //örnek 3: verilen bir stringin ilk a harfinden önceki tüm karakyerleri yazdırınız.
        String str = "Tramway";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a') {
                break;
            }

            System.out.print(ch);

        }
        //örnek 4:verilen bir stringile son a'dan sonraki tüm karakterleri ters sırada
        //yazdırınız.
        System.out.println("\n");

        String t="Germany";

        for(int i=t.length()-1;i>=0;i--){
            char c=t.charAt(i);
            if (c=='a'){
                break;
            }
            System.out.print(c);

        }


    }
}
