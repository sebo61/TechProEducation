package suleymanHoca.day21datetime;

public class Varargs01 {
    public static void main(String[] args) {
        int sum = add(1, 2, 3, 4, 5, 6, 9);
        System.out.println(sum); //30
        System.out.println(add(4)); //4
        getİnitials("Ali Can","Sebahattin KÖse","Mustafa Kurt");
    }

    //
 /*   public  static int add(int a, int b){
        return a+b;
    }
    public  static int add(int a,int b,int c){
        return a+b+c;
    }*/
    // varargs arkada Array kullanır.
    /*
    1) Bir metod parantezinde birden fazla varargs kullanılamaz.
    
     */
    public static int add(int... a) {
        int sum = 0;
        for (int w : a) {
            sum += w;

        }
        return sum;
        // example 2: verilen isimlerin ilk harflerini konsola yazdıran metodu oluşturunuz.


    }

    public static void getİnitials(String... s) {
        String initials = "";

        for (String w : s) {
            initials = initials+w.charAt(0) + w.split(" ")[1].charAt(0);
            System.out.println(initials);
            initials = "";

        }
    }
    //varargs boş olabilir.
    // varargs, bir tane olmalı en sonda olmalı

}
