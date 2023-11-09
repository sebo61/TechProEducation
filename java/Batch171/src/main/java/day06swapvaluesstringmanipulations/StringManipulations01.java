package day06swapvaluesstringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {
        //String bir non-primitive data type dır ve bir classdır.
        String s = "Java is easy";
        //ornek1: "s" Stringindeki tüm karakterleri büyük harf yapın.

        System.out.println("s.toUpperCase() = " + s.toUpperCase());//JAVA İS EASY
        //ornek2: s Stringindeki tüm karakterleri küçük harf yapınız.

        String sLower = s.toLowerCase();
        System.out.println("sLower = " + sLower);//java is easy
        //ornek3: a Strigindeki ilk karakteri alınız.

        char sChar = s.charAt(0);
        System.out.println("sChar = " + sChar);//J

        //ornek 4: "s" stringindeki 2. ve sondan 2. karakteri alını zve ekrana yazdırtınız.

        char sSecond = s.charAt(1);
        char sSon = s.charAt(10);
        System.out.println(sSecond);
        System.out.println(sSon);

        System.out.println("" + sSecond + sSon);//"" ile stringler ekrana yazdırılır. toksa ascii ekrana toplamını yazdırır
        //ornek 5: s stringinde kullanılan karakter sayısını bulunuz.
        int sLenght = s.length();
        System.out.println("sLenght = " + sLenght);
        //ornek 6: "s" stringindeki ilk 4 karakteri alınız.
        //substring bu kullanımda ilk index dahildir. ikinci index hariçtir.
        String sub1 = s.substring(0, 4);
        System.out.println("sub1 = " + sub1);
        //is i alınız.
        String is = s.substring(5, 7);
        System.out.println("is = " + is);
        //easy yi alınız
        String easy = s.substring(8, 12);
        System.out.println("easy = " + easy);
        //ikinci yol

        String sub4 = s.substring(8);
        System.out.println("sub4 = " + sub4);
        //ornek 9: "s" stringindeki "money" var olup olmadığını kontrol ediniz.
        boolean isExists = s.contains(" money");
        System.out.println("isExists = " + isExists);
        //ornek 10: "s" stringinin belli bir harf yada harfler ile başlayıp başlamadığını kontrol ediniz.

        boolean startWith = s.startsWith("J");
        System.out.println("startWith = " + startWith);

        //ornek 11: "s" stringinin 5. index dahil olak üzere bu indexten itibaren i karakter i ile başlayıp-başlamadığını kontrol eden kotu yazınız.
        boolean start= s.startsWith("i",5);
        System.out.println("start = " + start);

        boolean starts= s.startsWith("v",2);
        System.out.println("starts = " + starts);




    }
}
