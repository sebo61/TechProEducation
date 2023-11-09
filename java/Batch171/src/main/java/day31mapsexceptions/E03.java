package day31mapsexceptions;

import com.sun.tools.javac.Main;

public class E03 {
    public static void main(String[] args) {
        String s="Java";
        getCharFromString(s,2);
        String t="Java";
        getCharFromString(t,4);
    }
    //stringlerde var olmayan indexler kullanıldığında java StringIndexOutOfBoundsException exception atar.

    public static void getCharFromString(String s,int idx){
// CTRL+ALT+T try kısayolu


        try {
            char ch= s.charAt(idx);
            System.out.println(ch);
        } catch (Exception e) {
            System.out.println("olmayan index kullanım hatası yaptınız." +e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();
            System.out.println("kod çalımaya devam etti");
        }
    }
}
