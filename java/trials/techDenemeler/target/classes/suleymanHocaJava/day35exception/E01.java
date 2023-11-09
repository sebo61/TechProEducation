package suleymanHocaJava.day35exception;

public class E01 {
    public static void main(String[] args) {
        System.out.println(convertStringToInt("12ab")+2);

    }
    //bir Stringi interger a ceviren method oluşturunuz.
    public static int convertStringToInt(String str){
       try{
           return  Integer.valueOf(str);

       }catch (NumberFormatException e){

         str=str.replaceAll("[^0-9]","");
         return  Integer.valueOf(str);
       }

    }
}
