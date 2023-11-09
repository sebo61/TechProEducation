package day32exceptions;

import com.sun.tools.javac.Main;

public class E06 {
    public static void main(String[] args) {
        /*
        1) Exception olsada olmasada çalıştırmamız gereken kodları finally block içine yazarız.
        2) database ile bağlantıyı kesme işini yapan kodlar her halükarda çalıştırılmalıdır. bu kodları finally block içine koyarız.
        3) try tek başına kullanılamaz. try+catch olabiliri, try + cok catch olablir.
          try ile çoklu catch ve finally beraber kulanılabilir.
         4) exception dışında error diye adlandırdığımız ve handler edilemeyen problemler vardır. applicationlarda memorynin dolması errordur.
            2 tür memory error vardır.
                a) stack memory dolarsa "StackOverFlow Error" alabilirsiniz.
                b) Heap memory dolarsa "OutOfMemory Error" alırsınız.
*/
        int a=12;
        int b=6;
        int c[]={3,6,9,12};
        getElementFromArray(c,a,b);


    }
    public static void getElementFromArray(int []c,int a,int b){
        try {
            int idx=a/b;
            int element=c[idx];
            System.out.println(element);
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println(e.getMessage());
        }finally {
            System.out.println("Cut the connection with the database");
        }

    }
}
