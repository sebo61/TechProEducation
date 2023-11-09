package day13loops;

public class Loops03 {
    public static void main(String[] args) {
        // örnek 1: verilen 1 stringin de küçük harfleri konsala yazmayınız.
        // Pwd12?Ab ==> P12?A

        String s = "Pwd12?Ab";

        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);

            if(c>='a' && c<='z'){ //küçük harflerse eğer.
                continue;

            }
            System.out.print(c);

        }
           //break ile continue arasındaki fark nedir?:  break switch dışa çıkmak ve loop u kırmak için kullanilir.
        // continue ise loop yaparken bazı elemanları işleme sokmamak için kullanılır.
        //continue keywordu bir loopğ daki literation ı sonlandırıp sizi azaltma/arttırma bölümüne götürür.



    }
}
