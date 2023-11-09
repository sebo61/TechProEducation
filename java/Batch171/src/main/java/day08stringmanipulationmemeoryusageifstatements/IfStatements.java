package day08stringmanipulationmemeoryusageifstatements;

public class IfStatements {
    public static void main(String[] args) {
        // if statements
        // bazı kodların bazı şartlara göre active edebilmek için if statements kullanılır.
        // if eğer demek ==> if cümlesi
        // if you study hard, you will learn Java. ==> english
        /*
        if (you study hard){

        }you will learn Java == Java

         */
        //ornek 1: sayı pozitif ise ekrana pozitif yazdırın
        int num = 13;
        if (num > 0) {
            System.out.println(num + " pozitif");
        }
        // ornek 2 : sayı -1 ile 10 arasında ise ekran rakam yazdırın.
        int n = -5;
        if (n < 10 && n > -1) {

            System.out.println("rakam");

        }
    }
}
