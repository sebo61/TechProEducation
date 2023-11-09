package suleymanHocaJava.day35exception;

public class E02 {
    public static void main(String[] args) {
        char chr = getCharFromString("Java", 2);
        char chr1 = getCharFromString("Java", 8);
        System.out.println(chr);
        System.out.println(chr1);
    }

    // bir Stringdeki karakteri index kullanarak alan bir method oluşturunuz.
    public static char getCharFromString(String str, int idx) {

        try {
            return str.charAt(idx);
        }catch (StringIndexOutOfBoundsException e){
                idx=Math.abs(idx);
                idx=idx%str.length();
                return str.charAt(idx);
        }
    }
}
