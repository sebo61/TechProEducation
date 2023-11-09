package day32exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E04 {
    // run butununa bastıktan sonra konsolda alınan Exceptionlara "runtime exception" denir.
    // ArithmeticException, NullPointerException, NumberFormatException, ArrayIndexOutOfBoundsException
    // StringIndexOutOfBoundsException, ...runtime exception.
    // runtimelara unchecked Exception da denir.
    /*
    Code yazarken kırmızı alt cizgi şeklnde alınan exceptionlar da vardır. bUnlarada " Compile Time Exception" denir.

     FileNotFoundException, IOException, compile file exception
        compile time exceptionlara checked excepion da denir.
        Trow ile Trows keywordleri arasındaki fark nedir?
        1) throw  metod bodysi içinde, throws ise metod parantezinden hemen sonra kullnılır.
        2) throw metod body si içinde istenilen yerde istenildiği kadar kullanılır.
            throws ise metod parantezinden hemen sonra sadece 1 kere kullanılır.
        3) throwdan sonra new keyword ve constructor kullanılarak obje oluşturulur.
            throwsdan sonra sadece Exception class ismi yazılır.
        4) throw belli şartlar için exception fırlatma için kullanılır.
            throws ise bir metodun belli bir exceptionu fırlatabileceğini fırlatabileceğini belirtmek için kullanılır.



             */
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("java/Batch171/src/main/java/day32exceptions/file.txt");
        int k = 0;
        while ((k = fis.read()) != -1) {
            System.out.print((char) k);
        }
    }
}
