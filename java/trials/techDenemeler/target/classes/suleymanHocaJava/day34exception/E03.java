package suleymanHocaJava.day34exception;

public class E03 {
    public static void main(String[] args) {
        System.out.println(getNumOfChars("Java"));
        System.out.println(getNumOfChars("Money "));
        System.out.println(getNumOfChars(""));
        System.out.println(getNumOfChars(null));



    }
    // Bir Stringdeki character sayısını veren metod oluşturun.
    public  static int getNumOfChars(String s){
        int result=0;
        try {
            result=s.length();

        }catch (NullPointerException e){
            System.out.println("Some String methods do not work with null....");
            System.out.println(e.getMessage());
        }
            return result;
    }
}
