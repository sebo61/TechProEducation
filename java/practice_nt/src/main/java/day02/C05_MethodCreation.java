package day02;



public class C05_MethodCreation {
    public static void main(String[] args) {
          /*
        1- Verilen sayi1 ve sayi2 variable'larinin degerlerini degistiren (SWAP)
        bir program yaziniz
         Orn    : sayi1=10 ve sayi2=20;
          kod calistiktan sonra
         sayi1=20 ve sayi2=10
         */
        int a=3;
        int b=7;
        degistir(a,b);
    }

    private static void degistir(int a, int b) {
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

}
