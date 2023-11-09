package suleymanHocaJava.day37exceptionsenums;

public class IllegalAgeException  extends RuntimeException{
    /*
    eğer runtime custom exception üretmek istersek runtimeexception class a extend gerekir
     */
    public IllegalAgeException(){
        super();

    }
    public IllegalAgeException(String message){
        super(message);

    }

}
