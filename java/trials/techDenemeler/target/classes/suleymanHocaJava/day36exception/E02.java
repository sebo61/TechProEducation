package suleymanHocaJava.day36exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E02 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("techDenemeler/target/classes/suleymanHocaJava/day36exception/TextFile.txt");
            int i = 0;
            while ((i = fis.read()) != -1) {
                System.out.print((char)i);


            }
        } catch(FileNotFoundException e){
            System.out.println("Path is wrong or the file does not exist");
        } catch (IOException e) {
            System.out.println("some character could not be read");        }

    }
}