package day08stringmanipulationmemeoryusageifstatements;


public class StringManipulation01 {
    public static void main(String[] args) {


        // 1 Stringin hiç karakter içermediğini (boş string) nasıl kontrol ederiz.
        // 1. yol lenght methodu ile çözüm
        String str = "";
        boolean result = str.length() == 0;
        System.out.println("boş mu? " + result);
        // 2.yol hazır method. java eğer bir konuda method oluşturmuş ise o mehodu kullamak en iyisidir.
        boolean result2 = str.isEmpty();
        System.out.println("is Empty = " + result2);

        //ornek 2: bir stringin space hariç hiç bir karakter içermediğini kontrol eden kodu yazınız.

        String t = " ";
        // 1. yol
        boolean result3 = t.replace(" ", "").length() == 0;
        System.out.println("result3 = " + result3);
        // 2. yol
        boolean result4 = t.replace(" ", "").isEmpty();
        System.out.println("result4 = " + result4);
        //3. yol :space haricinde karakter yok true verir.
        boolean result5 = t.isBlank();
        System.out.println("result5 = " + result5);

        //isBlank() methodu sadece space iceren String ler icin true verir, space disinda bir character var ise false verir
        //isBlank() methodu bos stringler icin de true verir
        //isBlank() methodu space + hic birsey icin true verir
        //isEmpty() methodu sadece hic birsey icin true verir.

        // ornek 3: String de a,i,e characterlerinin ilk görünümlerinin indexleri toplamini ekrana yazdırınız.
        // "Java is easy to learn" ==> 1+5+8 ==>14
        // 0123456789....
        String r = "Java is easy to learn";
        int indxA = r.indexOf('a');
        System.out.println("indxA = " + indxA);
        int indxI = r.indexOf('i');
        System.out.println("indxi = " + indxI);
        int indxE = r.indexOf('e');
        System.out.println("indE = " + indxE);

        System.out.println("Toplam.:" + (indxA + indxI + indxE));

        // Ornek 4: bir Stringde ki "Java" kelimesinin ilk olarak kaçıncı indexde kullanıldığını yazınız.

        // "Ah Java vah Java sensiz olmuyor Java."

        String u = "Ah Java vah Java sensiz olmuyor Java.";
        // indexOf("Java") kullanımında siz "Java" kelimesinin ilk görünümündeki ilk harfin yani J'nin index ini alır.
        int indxU = u.indexOf("Java");
        System.out.println("indxU = " + indxU);//indexOf(String dizisi) (int) type return eder. 3

        //indexOf() methodu olmayan karakterler için kullanılırsa her zaman -1 return eder.
        int indxjava = u.indexOf("java");// -1 return eder.
        System.out.println("indxjava = " + indxjava);
        // örnek 5: bir Stringin   String de ki  "a","i","e" characterlerinin son görünümlerinin indexleri toplamini ekrana yazdırınız.
       // lastIndexOf() karakterlerin son index değerini veir.
        String v = "Java is easy to learn";
        int indA= v.lastIndexOf('a');
        System.out.println("indA = " + indA);
        int indI= v.lastIndexOf('i');
        System.out.println("indI = " + indI);
        int indE= v.lastIndexOf('e');
        System.out.println("indE = " + indE);
        System.out.println(indA+indE+indI);
        // not: lastIndexOf() methodu da olayan karakterler için -1 verir.




    }
}
