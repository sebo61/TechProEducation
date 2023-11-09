package day32exceptions;

public class E03 {
    /*
    bir netodun badu-y si içinde istediğimiz yerde istediğimiz koşullar için istediğimiz kdarexception atmmamızı SağlAR
    throw keyword yazıldıktan sonra bir exception class objecti oluşturulur.

    exception class consructor içine istediğimiz exception mesajını yazabiilirdininiz.

     */

    public static void main(String[] args) {

        try {
            printAge(-63);
        }catch (IllegalArgumentException e){
            System.err.println(e.getMessage());
        }

    }

    public static  void printAge(int age){
        if(age<0){
            throw new IllegalArgumentException("Age cannot be negative");
        }else {
            System.out.println(age);
        }




    }

}