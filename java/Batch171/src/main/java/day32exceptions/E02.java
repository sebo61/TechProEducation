package day32exceptions;

import com.sun.tools.javac.Main;

public class E02 {
    public static void main(String[] args) {
        //birbirine dönüştürülemeyecek data typelarını dönüştürmede ısrar ederseniz
        // java ClassCastException atar.

        Object obj=70;
        try {

            String str = (String) obj;
            System.out.println(str);
        } catch (ClassCastException e) {
            System.err.println("her data typeı her data typeına cevirilemez.");
        }


    }
}
