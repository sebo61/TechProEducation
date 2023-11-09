package generics.bounding;

import java.sql.SQLFeatureNotSupportedException;

// parametre olarak aldığımız data tipini üstten sınırlandırabiliriz.
// bu sınıfta sadece number classının alt sınıfları kullanılabilsin.
// Integer, Double, Long, Float, Byte,Sort
public class GenericUpperBound<T extends Number> {
    private T[] numberArray;
    // parametreli cost


    public GenericUpperBound(T[] numberArray) {
        this.numberArray = numberArray;
    }
    // number array içöindeki elemanların ortalamasını bulsun.

    private double getAvarage(){
        double sum=0;

        for (T t: this.numberArray) {
            sum+=t.doubleValue(); // t değerini double a dönüşütürür.

        }

        double avarage= sum/this.numberArray.length;
        return avarage;

    }
    // main metod
    public static void main(String[] args) {
        Integer[] intArr={1,2,3};
        Double [] doubleArr={0.3,5.8,8.88,99.9};
        String [] strArr={"genericleri","üstten","sınırlayabilirler"};
        GenericUpperBound <Integer> obj1=new GenericUpperBound<>(intArr);
        System.out.println(obj1.getAvarage());

        GenericUpperBound<Double> obj2=new GenericUpperBound<>(doubleArr);
        obj2.getAvarage();


        // GenericUpperBound<String> obj3=new GenericUpperBound<>(strArr);
        //Generic data tipini Number ile üstten sınırlandırdık, String kabul etmez





    }
}
