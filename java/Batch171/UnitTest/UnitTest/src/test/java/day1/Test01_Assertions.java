package day1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class Test01_Assertions {
    @Test
  public void test(){

        //test metodlarının erişim tipi public olmak zorundadır(junit4 ve öncesi)
        // junit5 ile birlikte public yazmak zorunda değiliz.

    }
    @Test
    public void testLength(){
        String str="unit test çok kolay";
        int anlikDeger=str.length(); //19
        int beklenenDeger=19;

        assertEquals(beklenenDeger,anlikDeger,"length metodu hatalı");
        //aldığı paramtrelerin değerlerini karşılaştırır.
        // eğer değerler aynı ise test geçer, aksi halde kalır.
        // testin başarısız olması durumunda mesaj yazılabilir.

    }
    // stringin toupperCase fonk test.

    @Test
    public void testtoUpperCase(){

        String upperTest="uppercase";
        String beklenmeyen="Junit";

        String anlikDeger2=upperTest.toUpperCase();

        String beklenenGeger2="UPPERCASE";

        //assertEquals(beklenenGeger2,anlikDeger2);

        assertNotEquals(beklenmeyen,anlikDeger2);


    }

    // Math.addExact
    @Test
    public void testAddExact(){
        int sayi1=15;
        int sayi2=5;

        int anlikdeger=Math.addExact(sayi1,sayi2);
        int beklenenDeger=sayi1+sayi2;
        assertEquals(beklenenDeger,anlikdeger);

    }

    // String den contais
    @Test
    public void testContains(){
        assertEquals(false,"java".contains("z"));

    }

}
