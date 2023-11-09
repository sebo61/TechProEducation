package day02datatypesmethodcreation;

public class MethodCreation01 {
    /*
    javada method nasıl oluştururlur.
    1) main methodun dışında classin içinde
    2)Access Modifier + return type + method name +() + {}


    Oluşturulan methodlar nasıl kullanılır?
    1) Methodu oluşturmak methodu çalıştırmak için yeterli değildir.
    kullanılmak istenen method, main methodun içinden kullanılır.

    2)methodun ismi +() yazın.
    varsa işlem yapacağınız datalarını içine koyun.bu işlem method call (method çağırma) olarak adalandırılır.
    3)methodun ismi + parametreler ==>method signature
         */
    public static void main(String[] args) {
        int sonuc = toplamaYap(3, 5);

        System.out.println(sonuc);

        long carpmaSonucu = multiply(4, 5);
        System.out.println(carpmaSonucu);


        System.out.println(carpTopla(4, 6, 9));
    }

    //ornek 1:toplama işlemi yapan bir metod oluşturunuz ve kullanınız.
    public static int toplamaYap(int a, int b) {//bu kısımda method kapsamında kullamılmasını ve işlenmesini istediğimiz dataları declere ediyoruz.

        return a + b;
        //return bu methodun çağrıldığı yere bu değeri geri döndür demek.
        //main method static olduğu için main method içinde kullanacağımzı method static olmalıdır.
    }

    //ornek 2: 2 sayıyı çarpma işlemi yapan bir method oluşturun ve kullanın
    protected static long multiply(int a, int b) {
        return a * b;

    }
    //ornek 3: verilen 3 sayıdan ilk ikisini çarpan ve üçüncü sayı ile sonucu toplayan metodu oluşturunuz.

    private static long carpTopla(int a, int b, int c) {
        return (a * b) + c;


    }
}
