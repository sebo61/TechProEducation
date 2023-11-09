package day14Lops;

public class Loops02 {
    public static void main(String[] args) {
        // örnek 1: 5 den 8 kadar tamsayıların toplamını veren kodu yazınız.
        int sum = 0;
        for (int i = 5; i < 9; i++) {
            sum += i;

        }
        System.out.println(sum);

        //örnek 2: 7 den 9 a kadar tamsayilarin carpimini veren kodu veriniz.

        int multibly = 1;
        for (int i = 7; i < 10; i++) {
            multibly = multibly * i;

        }
        System.out.println(multibly);
        // örnek 3: verilen bir tamsayının rakamlarının toplamını veren kodu yazınız.
        // 578 ==> 20

        int toplam = 0;
        int num = -578;

        num=Math.abs(num);
        for (int i = num; i > 0; i = i / 10) {

            toplam = toplam + i % 10;

        }
        System.out.println(toplam);


    }
}
