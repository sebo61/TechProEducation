package day06swapvaluesstringmanipulations;

public class SwapValues {
    public static void main(String[] args) {
        //swap: yer değiştirmek 1. kap patates 2. kap domates ==> 1.kap domates 2.kap patates
        int a = 12;
        int b = 5;//swaptan sonra a=5,b=12
        //1. adım
        int temp=0;

        temp=a;

        a=b;
        b=temp;

        System.out.println(a+ "-" +b);
        //2. yol
        int elma=12;
        int armut=5;
        System.out.println("elma = " + elma);
        System.out.println("armut = " + armut);
        elma=elma+armut;
        armut=elma-armut;

        elma=elma-armut;

        System.out.println("elma = " + elma);
        System.out.println("armut = " + armut);


    }
}
