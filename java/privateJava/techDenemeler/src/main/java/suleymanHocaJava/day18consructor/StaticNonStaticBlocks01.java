package suleymanHocaJava.day18consructor;
// 1)static blockslar static variable lara ilk değerlerini atamak (initialize) (başlatmak) için kullanılır.
// 2) static bir variablea değer atamak için kod yazmamız gerekirse "static block" kullanınız.
// 3) static bir variable a değer atamak için yazılmiş


import java.time.LocalDate;

public class StaticNonStaticBlocks01 {
    // static variable'lar static blok kullanılmadan da "initialize" edilebilirler.
    public static double pi=3.14;
    //aşağıdaki gibi bir variable a değer atamak için kod yazmamiz gerekirse "static block" kullanınız.
    public static double price;
    static {
        System.out.println("static blok 1");
        LocalDate d=LocalDate.now();
        if (d.getMonthValue()==3){
        price=1000;
    }else {
            price=1200;
        }
    }
    static {
        System.out.println("static blok 2");
    }
    public static void main(String[] args) {

    }

}
