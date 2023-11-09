package suleymanHocaJava.day34exception;


public class E01 {
    /*
    1) exception beklenmedik problem
    2) halledebilmek için 2 temel yol vardır.
        a) exception a uygun çözümler. "Exception handling"
        b) exception oluştuğunda bunu ilan eder ve geri çekilirsiniz. buna da "Throw Exception" denir
    3) exception a uygun çözümler üretmede try catch kullanılır.
        "try" block da yapılması gereken işlemi Java'dan yapması istenir.
         jAVA İŞLEMİ
    4) try block da exception oluşursa

     */
    public static void main(String[] args) {

        System.out.println(divide2(12, 3));
        System.out.println(divide2(6, 0));

    }

    public static int divide(int a, int b) {
        // 1. yol
        if (b == 0) {
            return 0;
        } else {


            return a / b;
        }
    }


    //2. yol exception u handle etmede harika yol
    public static int divide2(int a, int b) {
        int result=0;
        try {
            result= a / b;
            System.out.println("i am here");

        } catch (ArithmeticException e){ //matematik ile ilgili kural ihlali yapıldığında atilir.
            System.out.println("Do not divide any number by zero");
        }


return result;
    }
}
