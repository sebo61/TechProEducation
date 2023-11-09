package generics.methods;

import java.sql.SQLOutput;
import java.util.Arrays;

public class GenericMethod {
    public static void main(String[] args) {
        Integer [] integerArr={2,3,4,5,6,27,18,90};
        Double [] doubleArr={1.3,4.5,66.4,0.6,45.1};
        String [] stringArr={"Java","generics","hayatımızı","kolaylaştırır"};
        System.out.println("----------generic olmayan çözüm-----------");
        printArr(integerArr);
        printArr(doubleArr);

        //********

        printArray(stringArr);
        printArray(doubleArr);
        printArr(integerArr);

        System.out.println("-----------geriye sonuc döndüren generic metod");

        System.out.println(getFirst(integerArr));
        System.out.println(getFirst(stringArr));
        System.out.println("---2 parametrreli generic metod----");

        printArrayAndObject(integerArr,"string");
        printArrayAndObject(integerArr,12);



    }
        // arrayleri yazdırmak için metod
    public static void printArr(Integer[] arr){
        Arrays.stream(arr).forEach(t-> System.out.print(t+" "));

    }
    // overload ile sorun palyatif çözülüyor. araplara giderek para işi çözülmez.
    public static void printArr(Double[] arr){
        Arrays.stream(arr).forEach(t-> System.out.print(t+" "));
        System.out.println();
    }
    // generic metod
    public static <T> void printArray(T[] arr){
        Arrays.stream(arr).forEach(t-> System.out.print(t+" "));
        System.out.println();

    }
    // geriye sonuç döndüren generic metod

    public  static <T> T getFirst(T[] arr){
        T first= arr[0];

        return first;


    }
    //birden fazla parameterli generic metod
    public static <T,U> void printArrayAndObject(T[] array, U object){

        Arrays.stream(array).forEach(t-> System.out.print(t+" "));
        System.out.print("----------------"+object);
        System.out.println();
    }

}
