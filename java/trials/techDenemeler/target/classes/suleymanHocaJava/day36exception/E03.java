package suleymanHocaJava.day36exception;

public class E03 {
    /*

     throws ile throw arasında ki farklar.
    1) throws method signature de kullanılır.
        throw method body içinde kullanılır.

    2) throws bir defa birden fazla exception ile kullanılabilir.
        throw ise body içinde birden fazla kullanılabilir.
    3) throws dan sonra saedce exception class isimleri yazılır.
        throw dan sonra ise obje oluşturulur.
     */
    public static void main(String[] args) {
        printAge(23);
        try {
            printAge(-23);
        }catch (IllegalArgumentException e){
            System.out.println("Negative ages does not" );
        }
        printAge(-9);

    }
    // Example 1: kullanıcıdan alınan yaşı konsola yazdıran metod

    public static void printAge(int age){
        if (age<0){
            throw new IllegalArgumentException("used negative integers for ages");

        }
        System.out.println(age);

    }

}
