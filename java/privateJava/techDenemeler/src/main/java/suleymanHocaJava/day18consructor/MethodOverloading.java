package suleymanHoca.day18consructor;

public class MethodOverloading {
    /*
    1) Bir metod aynı isim ve farklı parametrelerle oluşturulursa buna method overloading denir.
    2) Method overloading Jada iyi organizasyon için önemlidir.
    3) method overloading yaparken parametre 3 şekilde değiştirilebilir.
        i)) parametre sayıları değiştirilebilir.
        ii) parametrelerin data typeları değiştirilebilir.
        iii) parametrelerin data typeları farklı ise yerleri değiştirilebilir.
    4) method overloading bir classın içinde oluşur. bu yüzden private metodlarda overloading edilebilir.
        method overloading bütün acces modifierlar için kullanılabilir.
    5) static metodlar overload edilebilirler.


     */
    public static void main(String[] args) {
        System.out.println(add(3, 5));


    }
        public static int add (int a,int b){
        return a+b;
        }

    public static int add(int a,int b,int c){
        return a+b+c;
    }
    public static double add(double a,int b){
        return a+b;
    }
    public static double add(int a,double b){
        return a+b;
    }
}
