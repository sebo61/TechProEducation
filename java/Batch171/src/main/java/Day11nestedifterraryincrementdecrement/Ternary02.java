package Day11nestedifterraryincrementdecrement;

public class Ternary02 {
    public static void main(String[] args) {
        //örnek 1:
        int a = 10;
        int b = 20;
        //
        int r1 = a < b ? a++ : ++b;
        System.out.println(r1);
        System.out.println(a);
        System.out.println(b);

        //ornek 2: verilen 1 sayının mutlak değerini hesaplayan kodu yazınız.
        //-4==> -1*-4 4==> 4 0==>0

        int c = -4;

        int r2 = c < 0 ? c * -1 : c;
        System.out.println("r2 = " + r2);
        // örnek 3: 2 sayının işareti  aynı ise bu sayıları çarpan farklı ise
        // fasrklı işaretli işaretli sayıları çarpamıyorum mesajı veren kodu yazın

        int m = 5;
        int n = -6;

        Object r3 = (m > 0 && n > 0) || (m < 0 && n < 0) ? m * n : "farklı işaretlileri çarpamıyorum";
        System.out.println(r3);
        //ornek 4: bize verilen sayının 3 basamaklı olup olmadığını komtroll eden kodu yazınız.

        int number =-234;
        number=Math.abs(number);

        String str = (number < 1000 && number > 99) ? "üç basamaklı" : "üç basamaklı değildir.";
        System.out.println("str = " + str);


    }
}
