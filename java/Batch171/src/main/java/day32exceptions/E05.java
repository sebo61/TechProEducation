package day32exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E05 {
    public static void main(String[] args) {

        try {

            FileInputStream fis = new FileInputStream("src/main/java/day32exceptions/file.txt");
            int k = 0;
            while ((k = fis.read()) != -1) {
                System.out.print((char) k);
            }

        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        /*
        1) FileNotFoundException ve IOException compile Time exceptionlardır.
        2) FileNotFoundException exception path in doğruluğu ve dosyanın varlığıu ile ilgilidir.
            IOeXCEPTİON TÜM İNPUT, output işlemleri ile ilgilidir.
        3) IOException class FileNotFoundException CLASSİN PARENTIDIR.
            istenirse FileNotFoundException yerine IOException da kullnılabilir.
        4) IOException class ve FileNotFoundException braber kullanılacaksa FileNotFoundException üstte olmalıdır.
            IOException altta olmalıdır.
         */

    }
}