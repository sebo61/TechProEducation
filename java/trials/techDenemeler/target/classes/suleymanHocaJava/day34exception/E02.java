package suleymanHocaJava.day34exception;


public class E02 {
    public static void main(String[] args) {

        String a[] = {"A", "V", "A", "J"};
        System.out.println(getElement(a, 5));

    }

    // bir String array den ,stenilen istenilen bir elemanı eleman sırası ila alan method oluşturunuz
    public static String getElement(String[] a, int numOfElement) {
String result="";
        try {
            result=a[numOfElement - 1];
        }catch (ArrayIndexOutOfBoundsException e){ // array işlemlerinde olmayan index kullanıldığında atılır.

            if(numOfElement-1<0 ){
                result =a[0];
            }else {
                result=a[a.length-1];
            }


        }
        return result;



    }

}
