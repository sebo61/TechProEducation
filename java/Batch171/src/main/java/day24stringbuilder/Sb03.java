package day24stringbuilder;

import com.sun.tools.javac.Main;

public class Sb03 {
    public static void main(String[] args) {
        /*
        1) StringBuffer java da String üreten bir diğer class dır.
            StringBuffer java'nın string üretmek için oluşturduğu ilk classdır.
        2) StringBuffer, StringBuilder a çok benzer. yani,i ikisi de "mutale" string üretir.
        3) StringBuffer "multiThread" dir. ama StringBuilder "multiThread" değildir.
        4 StringBuilder ""multiThread olmadığı için StingBuffer dan daha hızlı çalışır.
        5) "multi-thread" yapılırken yapılan işlrin sıralaması önem arzeder.yapılan işleri mantıklı bir sıraya
            koymak "syncronization" olarak adlandırılır.
            StringBuffer multithread olduğundan aynı zamanda "syncronized" dir.

        3 tane string oluşturan class öğrendik.
            1) Inmutable string lazımsa string class kullanılır.
            2) Mutable string lazımda StringBuilder ve StringBuffer
                a) StringBuffer ı multithread lazımsa,
                b) StringBuilder i multiThread gerekmez ise kullanırız.

         */
        StringBuffer sbf=new StringBuffer("Java");
        System.out.println(sbf); //Java
    }
}
