package day02;

public class C01Odev {
    public static void main(String[] args) {
        int a=2;
        int b=3;
        kareToplaYazdır(5,7);

    }
    public static void kareToplaYazdır(int a,int b){
        //method parantezinin içine method da kullanacağımız variable lar tanımlanır, bunlar parametredir.

        int kareToplamı= a*a+b*b;
        System.out.println("kareToplamı = " + kareToplamı);

    }
}
