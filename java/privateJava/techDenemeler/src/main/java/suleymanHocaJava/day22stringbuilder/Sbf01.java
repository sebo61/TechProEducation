package suleymanHoca.day22stringbuilder;

public class Sbf01 {
    public static void main(String[] args) {
        /*
        1) StringBuffer Java da String üreten bir class dır.
        2) StringBuffer StringBuilder a çok benzer. ikiside mutable String üretir.
        3) StringBuffer multi-thread dır ama StringBuilder multi-thread değildir.
        4) Java StringBuffer'ı StringBuilder dan önce üretti.
        5) StringBuilder multi-thread olmadığı için StringBufferdan daha hızlı çalışır.
        6)multiThread yapılırken işlerin sırası önemlidir.

        3 tane String Class öğrentik.
            a) iinmutable string lazımda string class
            b) mutable string lazımsa STRİNGBUİLDER VE STRİNG BUFFER
                -multi-thread lazımsa StringBuffer değilse stringBuilder.

        */
        StringBuffer sbf1=new StringBuffer("Java");

    }
}
