package day30maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMap03 {
    public static void main(String[] args) {
        //Example 1: Verilen cumledeki kelimelerin gorunum sayisini veren kodu yaziniz.
        //"I like you, like like!"  => I=1, like=3, you=1
        // stringimizi tüm noktalama işaretlerinden temizledik
        String s = "I like you, like like!";
        s = s.replaceAll("\\p{Punct}", "");

        System.out.println(s);
        //kelimelrle çalışacağımız için split (" ") ile stringi kelimelere ayırdık.
        String words[] = s.split(" ");
        System.out.println(Arrays.toString(words)); //[I, like, you, like, like]

        // word arrayindeki kelimeler birer birer mapd evar mı yok mu diye kontrol edeceğiz.
        // "words" arrayindeki kelimler map de yoksa map e value si 1 olarak yerleştir.
        // "words" arrayindeki kelimeler map de varsa map e varolan value yi 1 attırarak ekle diyeceğiz.
        HashMap<String, Integer> occ = new HashMap<>();

        for (String w : words) {
            Integer numOffOccurance = occ.get(w);

            if (numOffOccurance == null) {
                occ.put(w, 1);
            } else {
                occ.replace(w, numOffOccurance + 1);
            }

        }
        System.out.println(occ);

        // Verilen bir String'de hangi harfin kac defa kullanildigini veren method olusturunuz.
        //        //"Hello Henry!" ==> H=2, e=2, l=2, o=1, n=1, r=1, y=1
    }
}
