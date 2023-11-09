package day35lambda;

import java.util.stream.IntStream;


public class Lambda03 {
    public static void main(String[] args) {
      //  System.out.println(getFromSevenToSeventy());
       // System.out.println(getMultiplyFromThreeToNine());
        System.out.println(getFactorial(0));
        System.out.println(getSumOfEvenBetweenTwoInt(3, 54));
        System.out.println(getSumOfEvenBetweenTwoInt(13, 7));
        getSumOfEvenBetweenTwoInt2(23,20);

    }
    // 9 7 den 700 ekdar olan sayıların toplamını
    public static int getFromSevenToSeventy(){
         return IntStream.
                 rangeClosed(7,70).
                 reduce(Math::addExact).getAsInt();

    }
    // 10 :  3den 9 a tüm tamsayıların çarpımı
    public static int getMultiplyFromThreeToNine(){

        return  IntStream.
                rangeClosed(3,9).
                reduce(Math::multiplyExact).
                getAsInt();


    }
    // 11 size verilen sayının faktöriyelini hesaplayınız.

    public static int getFactorial(int x){
        if (x==0){
            return 1;
        } else if (x <0) {
            System.out.println( "faktoriyel negatif olamaz");
            return -1;

        }else {

            return IntStream.
                    rangeClosed(1, x).
                    reduce(Math::multiplyExact).
                    getAsInt();
        }

    }
    // 12: verilen iki tamsayı arasındaki çift sayılar.

    public static int getSumOfEvenBetweenTwoInt(int a, int b){
        if (a>b){
            int temp=a;
            a=b;
            b=temp;
        }
        return  IntStream.range(a+1,b).filter(t->t%2==0).sum();

    }
    // 2. yol
    public static int getSumOfEvenBetweenTwoInt2(int a, int b){
        if (a>b){
            int temp=a;
            a=b;
            b=temp;
        }
        return  IntStream.range(a+1,b).filter(Utils::isNumberEven).sum();

    }


}
