package suleymanHocaJava.day35exception;

public class E03 {
    /*
        1) try block tan sonra çoklu catch blok kullanılabilir.
            catch block lar arasında parent-child ilişkisi yoksa catch blocklar
            istenildiği gibi kullanılabilir.

            İlişki varsa child üstte olmalıdır.
        2) Exception class tüm exceptionların parentıdır.
            çoklu catch yerine istenen özelliğe göre exception class kullanılabilir.
        3) try + 1 catch try + çok catch olur. sadece try olmaz. tek başına olmaz.
            try catch olmadan kullanılabilir mi? try + finally olabilir.
     */
    public static void main(String[] args) {
        System.out.println(convertStringToIntDivideByLength1("6"));
        System.out.println(convertStringToIntDivideByLength2("6"));
        System.out.println(convertStringToIntDivideByLength3("6"));

    }

    // exp 1: bir Stringi interger a çeviren ve integer ı Stringin length ine bölen metod
    public static int convertStringToIntDivideByLength1(String str) {
        int result=0;
        try {
            int a = Integer.valueOf(str);
             result=a / (str.length() - 1);

        } catch (NumberFormatException e) {
            System.out.println("Non-digit character be used in valueof");


        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

        return result;
    }
    public static int convertStringToIntDivideByLength2(String str) {
        int result=0;
        try {
            int a = Integer.valueOf(str);
            result=a / (str.length() - 1);

        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        return result;
    }
    public static int convertStringToIntDivideByLength3(String str) {
        int result=0;
        try {
            int a = Integer.valueOf(str);
            result=a / (str.length() - 1);

        }
        catch (ArithmeticException e) {
            System.out.println("Jump");
        }
            catch  (Exception e){
            System.out.println(e.getMessage());
        }

        return result;
    }

}
