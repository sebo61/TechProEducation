package suleymanHocaJava.day36exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E01 {
    /*
        1) run butonuna bastıktan sonra konsolda alınan exceptionlara run time exception denir. unChecked exception
         2) Compile time exception, FileNotFoundException, IOException örnek..Checked exception

            exception: handel edilebilir.
            error'lar: ölümcül.. StackOverFlow Error, out Of Memory Error, Virtual Machine Error
         3) FileNotFoundException : java ya dosyayı bul dediğimizde java dosyanın adresi ve dosyanın varlığı konusunda
            hata oluşursa ne yapması gerektiğini söylememizi ister.
         4) IOException: (IO)
            NOT. IO exception FileNotFoundException un parent'ıdır.
     */
    public static void main(String[] args) throws IOException {
        // 1. yöntem

        FileInputStream fis=new FileInputStream("techDenemeler/target/classes/suleymanHocaJava/day36exception/TextFile.txt");

        int i=0;

        while((i=fis.read())!=-1){
            System.out.print((char) i);

        }

        



    }

}
