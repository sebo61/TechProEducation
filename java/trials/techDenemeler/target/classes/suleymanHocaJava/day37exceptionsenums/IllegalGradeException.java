package suleymanHocaJava.day37exceptionsenums;

public class IllegalGradeException extends Exception{
    /*
        1)Custom exception class oluşturmak için exception class a extend etmeli
            cu compule time exception olur.
        2) custom exception class oluştururken constructer oluşturmalısınızdır.
           Bu parenttaki construxterı cağırmalıdır.
           bu constrycter mesaj verecek veya vermeyecek şelikde oluşturulabilir.
       3)custom exception class oluşturduğunuzda ismin sonunda exception kelimesini
        kullanmalısınızdır.

     */

    public IllegalGradeException(String message){
        super(message);
    }

    public IllegalGradeException(){
        super();
    }

}
