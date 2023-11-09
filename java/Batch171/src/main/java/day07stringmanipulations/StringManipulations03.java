package day07stringmanipulations;

public class StringManipulations03 {
    public static void main(String[] args) {
        //ornek 1: bir stringin baş ve sonunda space karakteri varsa siliniz.

        String s = " Ali Can ";
        String sTrimmed = s.trim(); //sadece baştan ve sondan siler. aradaki spacelere dokunmaz.
        System.out.println("s1 = " + sTrimmed);
        //ornek 2: aşağıdaki fiyatları verilen ürünlerin toplam fiyatını bulunuz.
        // String tv="$456.99"; String laptop="$875.99"; ==> toplamları..

        String tv = "$456.99";
        String laptop = "$875.99";
        String tv2 = tv.replace("$", "");
        System.out.println("tv2 = " + tv2);
        String laptop2 = laptop.replace("$", "");
        System.out.println("laptop2 = " + laptop2);

        double totalPrice = Double.valueOf(tv2) + Double.valueOf(laptop2);
        System.out.println("totalPrice = " + totalPrice);

        //ornek 3: verilen ismin ilk isminin ilk harfini ve soy isminin ilk harfini ekrana yazdırınız.

        // "Ali Can" ==> AC

        String name = " aLi cAN";
        // split() methodu bir Stringi istediğimiz karakterden parcalamaya yarar.
        char first = name.trim().toUpperCase().charAt(0);
        System.out.println("first = " + first);

        char last = name.trim().toUpperCase().split(" ")[1].charAt(0);//ALİ[0] CAN[1]: ALİ 0'ıncı index, CAN 1'inci index.
                System.out.println("last = " + last);
        System.out.println("" + first + last);


    }
}
