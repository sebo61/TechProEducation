package day20statickeywordconstructors;

public class Student {
    /*
    1) static variable veya static method'lar (class member) tüm objeler için ortak elemandır.
    2) static class memberlar üzerinde yapılan tüm değişiklikler tüm objeleri etkiler.
    3) static class memberlar class a, non-static class memberlar objelere monte edilir.
    mesela; bir class dan 100 obje oluşturduğunuzda non-static olanlar 100 kere oluşturulur, ama
    static olanlar object sayısından bağımsız olarak bir kere oluşturulurlar.
    4) static class membera ulaşmak için object oluşturmaya gerek duyulmaz.
        ama non-static class memberlara ulaşmak için object oluşturmak şarttır.
    5) static variableların diğer adı "class variable" dır.
       non-static variable ların diğer adı "instance variable" veya "object variable" dır.
     */

   public static String stdName="Tom Hanks";
   public int age=13;
   public static void staticMethod(){
      System.out.println("ben static metodum.");
   }
public void nonStaticMetod(){
   System.out.println("ben static olmayan metodum");
}

}

