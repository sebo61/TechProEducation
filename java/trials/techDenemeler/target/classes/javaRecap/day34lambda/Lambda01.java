package day34lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {
    /*
   1) Lambda functional programing dir. diğeri structured programing dir.
   2) functional programingde ne yapıacak a odaklanılır. diğerinde nasıl yapılacak.
   3) functional programing java 8 ile kullanılmaya başlandı.
   4) functional programing collectionlar ve arraylerde kullanılır.
     */
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();

        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);

        // aynı satırda aralarına boşluk koyarak yazdırın

        printElements1(nums);
        printElements2(nums);
        printEvenElements1(nums);
        printEvenElements2(nums);
        printSquareOddElements(nums);
        printCubeOfDistincElements(nums);
        printSumOfDistinctSqareElements(nums);
        printOfDistinctMultiplyElements(nums);
        printGetMaxValue1(nums);
        printGetMaxValue5(nums);
        printGetMaxValue6(nums);
        getMinValue2(nums);
        getMinGreaterThanSevenEven(nums);
    }

    public static void printElements1(List<Integer> nums) {
        for (Integer w : nums) {

            System.out.print(w + " ");

        }
        System.out.println();

    }

    public static void printElements2(List<Integer> nums) {
        nums.stream().forEach(t -> System.out.print(t + " "));
    }
    //çift elemanlar

    public static void printEvenElements1(List<Integer> nums) {
        System.out.println();

        for (Integer w : nums) {
            if (w % 2 == 0) {
                System.out.print(w + " ");

            }

        }

    }

    //functional
    public static void printEvenElements2(List<Integer> nums) {

        System.out.println();

        nums.
                stream().
                filter(t -> t % 2 == 0).
                forEach(t -> System.out.print(t + " "));


    }

    //tek sayı olanların karelerini aynı satırda yaz.

    public static void printSquareOddElements(List<Integer> nums) {
        System.out.println();

        nums.
                stream().
                filter(t -> t % 2 != 0).
                map(t -> t * t).
                forEach(t -> System.out.print(t + " "));


    }
// tek sayı elemanların kplerini tekrarsız aynı satırda..

    public static void printCubeOfDistincElements(List<Integer> nums) {
        System.out.println();

        nums.
                stream().
                distinct().
                filter(t -> t % 2 != 0).
                map(t -> t * t * t).
                forEach(t -> System.out.print(t + " "));
    }
    // liste tekrarsız çift elemanların karelerini toplamını

    public static void printSumOfDistinctSqareElements(List<Integer> nums) {
        System.out.println();

        Integer sum = nums.
                stream().
                distinct().
                filter(t -> t % 2 == 0).
                map(t -> t * t).
                reduce(0, (t, u) -> t + u);

        System.out.println(sum);


    }

    // tekrarsiz lemanlardan çift olanların karelerinin çarpımını hesaplayan metod

    public static void printOfDistinctMultiplyElements(List<Integer> nums) {

        Integer multiply =
                nums.
                        stream().
                        distinct().
                        filter(t -> t % 2 == 0).
                        map(t -> t * t).
                        reduce(1, (t, u) -> t * u);
        System.out.println(multiply);
    }

    // verilen listedeki max değeri bulun

    public static void printGetMaxValue1(List<Integer> nums) {
        Integer max = nums.stream().distinct().reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);

        System.out.println(max);

    }

    // 2. yol
    public static void printGetMaxValue2(List<Integer> nums) {
        Integer max = nums.stream().distinct().reduce(nums.get(0), (t, u) -> t > u ? t : u);

        System.out.println(max);

    }
    //3. yol

    public static void printGetMaxValue3(List<Integer> nums) {
        Integer max = nums.
                stream().distinct().
                sorted().
                reduce((t, u) -> u).get();

        System.out.println(max);


    }

    // 4. yol
    public static void printGetMaxValue4(List<Integer> nums) {
        Integer max = nums.
                stream().
                sorted().
                reduce(Math::max).get();

        System.out.println(max);


    }

    // verilen listede münumum değeri bulmak için metod

    public static void printGetMaxValue5(List<Integer> nums) {
        Integer min = nums.
                stream().
                sorted().
                reduce(Math::min).get();

        System.out.println(min);


    }

    public static void printGetMaxValue6(List<Integer> nums) {
        Integer min = nums.
                stream().distinct().
                sorted().
                reduce((t, u) -> t).get();

        System.out.println(min);


    }

    public static void getMinValue2(List<Integer> nums) {
        Integer min = nums.
                stream().
                distinct().
                sorted(Comparator.
                        reverseOrder()).
                reduce((t, u) -> u).get();

        System.out.println(min);


    }
    //3.yol

    public static void getMinValue3(List<Integer> nums) {
        Integer min = nums.
                stream().
                distinct().
                reduce((t, u) -> t).
                get();

        System.out.println(min);


    }

    //4. yol

    public static void getMinValue4(List<Integer> nums) {
        Integer min = nums.
                stream().
                distinct().
                reduce((t, u) -> Math.min(t, u)).
                get();

        System.out.println(min);


    }

    //verilen listten 7 den büyük en küçük çift sayı

    public static void getMinGreaterThanSevenEven(List<Integer> nums){
        Integer min= nums.stream().filter(t->t>7 && t%2==0).sorted().reduce((t,u)->t).get();

        System.out.println("7 den büyük ve en küçük çift sayı: "+min);


    }


}
