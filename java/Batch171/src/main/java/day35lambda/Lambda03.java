package day35lambda;

import java.util.stream.IntStream;

public class Lambda03 {
    public static void main(String[] args) {
        System.out.println(getSumFromSevenToSeventy());
        System.out.println(getMultipleFromThreeToNine());
        System.out.println(getFactorial(5));
        System.out.println(getSumOfEvensBetweenToInt(44,34));
        System.out.println(getSumOfEvensBetweenToInt2(44, 34));

    }

    //9 ) 7'den 70'e kadar tum tamsayilarin toplamini veren kodu yaziniz
    public static int getSumFromSevenToSeventy() {
        return IntStream.
                rangeClosed(7, 70).
                reduce(Math::addExact).
                getAsInt();
    }
    // 3 den 9 a kadar tüm tamsayı çarpımı

    public static int getMultipleFromThreeToNine() {
        return IntStream.
                rangeClosed(3, 9).
                reduce(Math::multiplyExact).
                getAsInt();


    }

    // 11) size verilen sayının faktöriyelini hesaplayan kodu yazınız.
    public static int getFactorial(int x) {
        if(x==0){
            return 1;
        }else if(x<0){
            System.out.println("faktöriyel negatif sayılarla olmaz.");
            return -1;
        }else{
            return IntStream.
                    rangeClosed(1, x).
                    reduce(Math::multiplyExact).
                    getAsInt();
        }
    }
    // 12) size verilen iki tamsayı arasındaki tüm çift sayıların toplamını veren kod.
    public static int getSumOfEvensBetweenToInt(int a,int b){
        if(a>b){
            int temp=a;
            a=b;
            b=temp;
        }
        return  IntStream.
                range(a+1,b).
                filter(t->t%2==0).
                sum();

    }
    // 12) size verilen iki tamsayı arasındaki tüm çift sayıların toplamını veren kod.
    public static int getSumOfEvensBetweenToInt2(int a,int b){
        if(a>b){
            int temp=a;
            a=b;
            b=temp;
        }
        return  IntStream.
                range(a+1,b).
                filter(Utils::isNumberEven).
                sum();

    }
}


